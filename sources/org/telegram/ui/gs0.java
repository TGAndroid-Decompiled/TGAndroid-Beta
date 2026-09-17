package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class gs0 implements Runnable {
    public final PhotoViewer f34036a;
    public final View f34037b;
    public final jt0 f34038c;
    public final float d;
    public final float e;
    public final AnimatorSet f34039f;

    public gs0(PhotoViewer photoViewer, View view, jt0 jt0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f34036a = photoViewer;
        this.f34037b = view;
        this.f34038c = jt0Var;
        this.d = f7;
        this.e = f10;
        this.f34039f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.T8;
        View view = this.f34037b;
        jt0 jt0Var = this.f34038c;
        view.setOutlineProvider(jt0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f34036a;
        photoViewer.f31122x3.setOutlineProvider(jt0Var);
        photoViewer.f31122x3.setClipToOutline(true);
        wu0 wu0Var = photoViewer.E2;
        if (wu0Var != null) {
            wu0Var.setOutlineProvider(jt0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f31122x3.setTranslationY(this.d);
        float f7 = this.e;
        view.setTranslationY(f7);
        wu0 wu0Var2 = photoViewer.E2;
        if (wu0Var2 != null) {
            wu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f30950e0.invalidate();
        this.f34039f.start();
    }
}
