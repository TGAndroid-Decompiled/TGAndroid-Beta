package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class ds0 implements Runnable {
    public final PhotoViewer f35854a;
    public final View f35855b;
    public final gt0 f35856c;
    public final float d;
    public final float f35857e;
    public final AnimatorSet f35858f;

    public ds0(PhotoViewer photoViewer, View view, gt0 gt0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f35854a = photoViewer;
        this.f35855b = view;
        this.f35856c = gt0Var;
        this.d = f7;
        this.f35857e = f10;
        this.f35858f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.T8;
        View view = this.f35855b;
        gt0 gt0Var = this.f35856c;
        view.setOutlineProvider(gt0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f35854a;
        photoViewer.f33721x3.setOutlineProvider(gt0Var);
        photoViewer.f33721x3.setClipToOutline(true);
        tu0 tu0Var = photoViewer.E2;
        if (tu0Var != null) {
            tu0Var.setOutlineProvider(gt0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f33721x3.setTranslationY(this.d);
        float f7 = this.f35857e;
        view.setTranslationY(f7);
        tu0 tu0Var2 = photoViewer.E2;
        if (tu0Var2 != null) {
            tu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f33549e0.invalidate();
        this.f35858f.start();
    }
}
