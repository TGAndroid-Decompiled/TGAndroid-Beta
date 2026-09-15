package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class es0 implements Runnable {
    public final PhotoViewer f33395a;
    public final View f33396b;
    public final ht0 f33397c;
    public final float d;
    public final float e;
    public final AnimatorSet f33398f;

    public es0(PhotoViewer photoViewer, View view, ht0 ht0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f33395a = photoViewer;
        this.f33396b = view;
        this.f33397c = ht0Var;
        this.d = f7;
        this.e = f10;
        this.f33398f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.T8;
        View view = this.f33396b;
        ht0 ht0Var = this.f33397c;
        view.setOutlineProvider(ht0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f33395a;
        photoViewer.f31108x3.setOutlineProvider(ht0Var);
        photoViewer.f31108x3.setClipToOutline(true);
        uu0 uu0Var = photoViewer.E2;
        if (uu0Var != null) {
            uu0Var.setOutlineProvider(ht0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f31108x3.setTranslationY(this.d);
        float f7 = this.e;
        view.setTranslationY(f7);
        uu0 uu0Var2 = photoViewer.E2;
        if (uu0Var2 != null) {
            uu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f30936e0.invalidate();
        this.f33398f.start();
    }
}
