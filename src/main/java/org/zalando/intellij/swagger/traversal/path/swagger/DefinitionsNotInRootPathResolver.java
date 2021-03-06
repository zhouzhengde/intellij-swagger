package org.zalando.intellij.swagger.traversal.path.swagger;

import com.intellij.psi.PsiElement;

public class DefinitionsNotInRootPathResolver implements PathResolver {

    @Override
    public final boolean childOfDefinitions(final PsiElement psiElement) {
        return hasPath(psiElement, "$.*.*");
    }

}
