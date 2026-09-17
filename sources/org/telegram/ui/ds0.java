package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class ds0 implements Runnable {
    public final PhotoViewer f35882a;
    public final View f35883b;
    public final gt0 f35884c;
    public final float d;
    public final float f35885e;
    public final AnimatorSet f35886f;

    public ds0(PhotoViewer photoViewer, View view, gt0 gt0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f35882a = photoViewer;
        this.f35883b = view;
        this.f35884c = gt0Var;
        this.d = f7;
        this.f35885e = f10;
        this.f35886f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.T8;
        View view = this.f35883b;
        gt0 gt0Var = this.f35884c;
        view.setOutlineProvider(gt0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f35882a;
        photoViewer.f33749x3.setOutlineProvider(gt0Var);
        photoViewer.f33749x3.setClipToOutline(true);
        tu0 tu0Var = photoViewer.E2;
        if (tu0Var != null) {
            tu0Var.setOutlineProvider(gt0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f33749x3.setTranslationY(this.d);
        float f7 = this.f35885e;
        view.setTranslationY(f7);
        tu0 tu0Var2 = photoViewer.E2;
        if (tu0Var2 != null) {
            tu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f33577e0.invalidate();
        this.f35886f.start();
    }
}
