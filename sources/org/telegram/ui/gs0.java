package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class gs0 implements Runnable {
    public final PhotoViewer f34040a;
    public final View f34041b;
    public final jt0 f34042c;
    public final float d;
    public final float e;
    public final AnimatorSet f34043f;

    public gs0(PhotoViewer photoViewer, View view, jt0 jt0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f34040a = photoViewer;
        this.f34041b = view;
        this.f34042c = jt0Var;
        this.d = f7;
        this.e = f10;
        this.f34043f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.f34041b;
        jt0 jt0Var = this.f34042c;
        view.setOutlineProvider(jt0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f34040a;
        photoViewer.f31126x3.setOutlineProvider(jt0Var);
        photoViewer.f31126x3.setClipToOutline(true);
        wu0 wu0Var = photoViewer.E2;
        if (wu0Var != null) {
            wu0Var.setOutlineProvider(jt0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f31126x3.setTranslationY(this.d);
        float f7 = this.e;
        view.setTranslationY(f7);
        wu0 wu0Var2 = photoViewer.E2;
        if (wu0Var2 != null) {
            wu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f30954e0.invalidate();
        this.f34043f.start();
    }
}
