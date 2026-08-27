package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;

public final class dr0 implements Runnable {

    public final PhotoViewer f37531a;

    public final View f37532b;

    public final fs0 f37533c;
    public final float d;

    public final float f37534e;

    public final AnimatorSet f37535f;

    public dr0(PhotoViewer photoViewer, View view, fs0 fs0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.f37531a = photoViewer;
        this.f37532b = view;
        this.f37533c = fs0Var;
        this.d = f10;
        this.f37534e = f11;
        this.f37535f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.P8;
        View view = this.f37532b;
        fs0 fs0Var = this.f37533c;
        view.setOutlineProvider(fs0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f37531a;
        photoViewer.f35758t3.setOutlineProvider(fs0Var);
        photoViewer.f35758t3.setClipToOutline(true);
        tt0 tt0Var = photoViewer.A2;
        if (tt0Var != null) {
            tt0Var.setOutlineProvider(fs0Var);
            photoViewer.A2.setClipToOutline(true);
        }
        photoViewer.f35758t3.setTranslationY(this.d);
        float f10 = this.f37534e;
        view.setTranslationY(f10);
        tt0 tt0Var2 = photoViewer.A2;
        if (tt0Var2 != null) {
            tt0Var2.setTranslationY(f10);
        }
        photoViewer.U5 = 0.0f;
        photoViewer.f35583a0.invalidate();
        this.f37535f.start();
    }
}
