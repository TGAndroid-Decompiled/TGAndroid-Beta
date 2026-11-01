package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class kp0 implements Runnable {
    public final PhotoViewer f38954a;
    public final View f38955b;
    public final nq0 f38956c;
    public final float d;
    public final float e;
    public final AnimatorSet f38957f;

    public kp0(PhotoViewer photoViewer, View view, nq0 nq0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f38954a = photoViewer;
        this.f38955b = view;
        this.f38956c = nq0Var;
        this.d = f7;
        this.e = f10;
        this.f38957f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.f38955b;
        nq0 nq0Var = this.f38956c;
        view.setOutlineProvider(nq0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f38954a;
        photoViewer.f33650x3.setOutlineProvider(nq0Var);
        photoViewer.f33650x3.setClipToOutline(true);
        yr0 yr0Var = photoViewer.E2;
        if (yr0Var != null) {
            yr0Var.setOutlineProvider(nq0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f33650x3.setTranslationY(this.d);
        float f7 = this.e;
        view.setTranslationY(f7);
        yr0 yr0Var2 = photoViewer.E2;
        if (yr0Var2 != null) {
            yr0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f33477e0.invalidate();
        this.f38957f.start();
    }
}
