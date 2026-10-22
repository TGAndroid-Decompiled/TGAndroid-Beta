package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class lr0 implements Runnable {
    public final PhotoViewer f39004a;
    public final View f39005b;
    public final ns0 f39006c;
    public final float d;
    public final float e;
    public final AnimatorSet f39007f;

    public lr0(PhotoViewer photoViewer, View view, ns0 ns0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f39004a = photoViewer;
        this.f39005b = view;
        this.f39006c = ns0Var;
        this.d = f7;
        this.e = f10;
        this.f39007f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.f39005b;
        ns0 ns0Var = this.f39006c;
        view.setOutlineProvider(ns0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f39004a;
        photoViewer.f33455x3.setOutlineProvider(ns0Var);
        photoViewer.f33455x3.setClipToOutline(true);
        au0 au0Var = photoViewer.E2;
        if (au0Var != null) {
            au0Var.setOutlineProvider(ns0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f33455x3.setTranslationY(this.d);
        float f7 = this.e;
        view.setTranslationY(f7);
        au0 au0Var2 = photoViewer.E2;
        if (au0Var2 != null) {
            au0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f33282e0.invalidate();
        this.f39007f.start();
    }
}
