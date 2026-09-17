package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class ds0 implements Runnable {
    public final PhotoViewer f35855a;
    public final View f35856b;
    public final gt0 f35857c;
    public final float d;
    public final float f35858e;
    public final AnimatorSet f35859f;

    public ds0(PhotoViewer photoViewer, View view, gt0 gt0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f35855a = photoViewer;
        this.f35856b = view;
        this.f35857c = gt0Var;
        this.d = f7;
        this.f35858e = f10;
        this.f35859f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.T8;
        View view = this.f35856b;
        gt0 gt0Var = this.f35857c;
        view.setOutlineProvider(gt0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f35855a;
        photoViewer.f33722x3.setOutlineProvider(gt0Var);
        photoViewer.f33722x3.setClipToOutline(true);
        tu0 tu0Var = photoViewer.E2;
        if (tu0Var != null) {
            tu0Var.setOutlineProvider(gt0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f33722x3.setTranslationY(this.d);
        float f7 = this.f35858e;
        view.setTranslationY(f7);
        tu0 tu0Var2 = photoViewer.E2;
        if (tu0Var2 != null) {
            tu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f33550e0.invalidate();
        this.f35859f.start();
    }
}
