package org.telegram.ui;
public final class b extends ro {
    @Override
    public final void c(Object obj, float f) {
        ((ArticleViewer$WindowView) obj).setInnerTranslationX(f);
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
    }
}
