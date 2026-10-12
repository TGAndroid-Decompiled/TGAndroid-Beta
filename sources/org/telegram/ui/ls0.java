package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class ls0 implements Runnable {
    public final PhotoViewer f38082a;
    public final View f38083b;
    public final ot0 f38084c;
    public final float d;
    public final float e;
    public final AnimatorSet f38085f;

    public ls0(PhotoViewer photoViewer, View view, ot0 ot0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f38082a = photoViewer;
        this.f38083b = view;
        this.f38084c = ot0Var;
        this.d = f7;
        this.e = f10;
        this.f38085f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.f38083b;
        ot0 ot0Var = this.f38084c;
        view.setOutlineProvider(ot0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f38082a;
        photoViewer.f32399x3.setOutlineProvider(ot0Var);
        photoViewer.f32399x3.setClipToOutline(true);
        bv0 bv0Var = photoViewer.E2;
        if (bv0Var != null) {
            bv0Var.setOutlineProvider(ot0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f32399x3.setTranslationY(this.d);
        float f7 = this.e;
        view.setTranslationY(f7);
        bv0 bv0Var2 = photoViewer.E2;
        if (bv0Var2 != null) {
            bv0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f32226e0.invalidate();
        this.f38085f.start();
    }
}
