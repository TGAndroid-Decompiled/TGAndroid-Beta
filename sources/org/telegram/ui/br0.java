package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class br0 implements Runnable {
    public final PhotoViewer f36892a;
    public final View f36893b;
    public final ds0 f36894c;
    public final float d;
    public final float f36895e;
    public final AnimatorSet f36896f;

    public br0(PhotoViewer photoViewer, View view, ds0 ds0Var, float f9, float f10, AnimatorSet animatorSet) {
        this.f36892a = photoViewer;
        this.f36893b = view;
        this.f36894c = ds0Var;
        this.d = f9;
        this.f36895e = f10;
        this.f36896f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.P8;
        View view = this.f36893b;
        ds0 ds0Var = this.f36894c;
        view.setOutlineProvider(ds0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f36892a;
        photoViewer.f35821t3.setOutlineProvider(ds0Var);
        photoViewer.f35821t3.setClipToOutline(true);
        qt0 qt0Var = photoViewer.A2;
        if (qt0Var != null) {
            qt0Var.setOutlineProvider(ds0Var);
            photoViewer.A2.setClipToOutline(true);
        }
        photoViewer.f35821t3.setTranslationY(this.d);
        float f9 = this.f36895e;
        view.setTranslationY(f9);
        qt0 qt0Var2 = photoViewer.A2;
        if (qt0Var2 != null) {
            qt0Var2.setTranslationY(f9);
        }
        photoViewer.U5 = 0.0f;
        photoViewer.f35647a0.invalidate();
        this.f36896f.start();
    }
}
