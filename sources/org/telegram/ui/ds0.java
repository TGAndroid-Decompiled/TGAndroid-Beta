package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class ds0 implements Runnable {
    public final PhotoViewer f31967a;
    public final View f31968b;
    public final gt0 f31969c;
    public final float d;
    public final float e;
    public final AnimatorSet f31970f;

    public ds0(PhotoViewer photoViewer, View view, gt0 gt0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f31967a = photoViewer;
        this.f31968b = view;
        this.f31969c = gt0Var;
        this.d = f7;
        this.e = f10;
        this.f31970f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.T8;
        View view = this.f31968b;
        gt0 gt0Var = this.f31969c;
        view.setOutlineProvider(gt0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f31967a;
        photoViewer.f30221x3.setOutlineProvider(gt0Var);
        photoViewer.f30221x3.setClipToOutline(true);
        vu0 vu0Var = photoViewer.E2;
        if (vu0Var != null) {
            vu0Var.setOutlineProvider(gt0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f30221x3.setTranslationY(this.d);
        float f7 = this.e;
        view.setTranslationY(f7);
        vu0 vu0Var2 = photoViewer.E2;
        if (vu0Var2 != null) {
            vu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f30049e0.invalidate();
        this.f31970f.start();
    }
}
