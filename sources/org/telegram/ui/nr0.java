package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class nr0 implements Runnable {
    public final PhotoViewer f39533a;
    public final View f39534b;
    public final ps0 f39535c;
    public final float d;
    public final float e;
    public final AnimatorSet f39536f;

    public nr0(PhotoViewer photoViewer, View view, ps0 ps0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f39533a = photoViewer;
        this.f39534b = view;
        this.f39535c = ps0Var;
        this.d = f7;
        this.e = f10;
        this.f39536f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.f39534b;
        ps0 ps0Var = this.f39535c;
        view.setOutlineProvider(ps0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f39533a;
        photoViewer.f33439x3.setOutlineProvider(ps0Var);
        photoViewer.f33439x3.setClipToOutline(true);
        cu0 cu0Var = photoViewer.E2;
        if (cu0Var != null) {
            cu0Var.setOutlineProvider(ps0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f33439x3.setTranslationY(this.d);
        float f7 = this.e;
        view.setTranslationY(f7);
        cu0 cu0Var2 = photoViewer.E2;
        if (cu0Var2 != null) {
            cu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f33266e0.invalidate();
        this.f39536f.start();
    }
}
