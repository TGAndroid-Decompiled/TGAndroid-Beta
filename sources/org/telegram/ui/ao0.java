package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class ao0 implements Runnable {
    public final PhotoViewer f45464a;
    public final View f45465b;
    public final dp0 f45466c;
    public final float d;
    public final float f45467e;
    public final AnimatorSet f45468f;

    public ao0(PhotoViewer photoViewer, View view, dp0 dp0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.f45464a = photoViewer;
        this.f45465b = view;
        this.f45466c = dp0Var;
        this.d = f10;
        this.f45467e = f11;
        this.f45468f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.Z8;
        View view = this.f45465b;
        dp0 dp0Var = this.f45466c;
        view.setOutlineProvider(dp0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f45464a;
        photoViewer.f42924x3.setOutlineProvider(dp0Var);
        photoViewer.f42924x3.setClipToOutline(true);
        nq0 nq0Var = photoViewer.F2;
        if (nq0Var != null) {
            nq0Var.setOutlineProvider(dp0Var);
            photoViewer.F2.setClipToOutline(true);
        }
        photoViewer.f42924x3.setTranslationY(this.d);
        float f10 = this.f45467e;
        view.setTranslationY(f10);
        nq0 nq0Var2 = photoViewer.F2;
        if (nq0Var2 != null) {
            nq0Var2.setTranslationY(f10);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f42763f0.invalidate();
        this.f45468f.start();
    }
}
