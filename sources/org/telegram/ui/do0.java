package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class do0 implements Runnable {
    public final PhotoViewer f47019a;
    public final View f47020b;
    public final gp0 f47021c;
    public final float d;
    public final float f47022e;
    public final AnimatorSet f47023f;

    public do0(PhotoViewer photoViewer, View view, gp0 gp0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.f47019a = photoViewer;
        this.f47020b = view;
        this.f47021c = gp0Var;
        this.d = f10;
        this.f47022e = f11;
        this.f47023f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.Z8;
        View view = this.f47020b;
        gp0 gp0Var = this.f47021c;
        view.setOutlineProvider(gp0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f47019a;
        photoViewer.f43414x3.setOutlineProvider(gp0Var);
        photoViewer.f43414x3.setClipToOutline(true);
        pq0 pq0Var = photoViewer.F2;
        if (pq0Var != null) {
            pq0Var.setOutlineProvider(gp0Var);
            photoViewer.F2.setClipToOutline(true);
        }
        photoViewer.f43414x3.setTranslationY(this.d);
        float f10 = this.f47022e;
        view.setTranslationY(f10);
        pq0 pq0Var2 = photoViewer.F2;
        if (pq0Var2 != null) {
            pq0Var2.setTranslationY(f10);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f43253f0.invalidate();
        this.f47023f.start();
    }
}
