package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class mp0 implements Runnable {
    public final PhotoViewer f39745a;
    public final View f39746b;
    public final pq0 f39747c;
    public final float d;
    public final float e;
    public final AnimatorSet f39748f;

    public mp0(PhotoViewer photoViewer, View view, pq0 pq0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f39745a = photoViewer;
        this.f39746b = view;
        this.f39747c = pq0Var;
        this.d = f7;
        this.e = f10;
        this.f39748f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.f39746b;
        pq0 pq0Var = this.f39747c;
        view.setOutlineProvider(pq0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f39745a;
        photoViewer.f33643x3.setOutlineProvider(pq0Var);
        photoViewer.f33643x3.setClipToOutline(true);
        zr0 zr0Var = photoViewer.E2;
        if (zr0Var != null) {
            zr0Var.setOutlineProvider(pq0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f33643x3.setTranslationY(this.d);
        float f7 = this.e;
        view.setTranslationY(f7);
        zr0 zr0Var2 = photoViewer.E2;
        if (zr0Var2 != null) {
            zr0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f33470e0.invalidate();
        this.f39748f.start();
    }
}
