package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class do0 implements Runnable {
    public final PhotoViewer f47027a;
    public final View f47028b;
    public final gp0 f47029c;
    public final float d;
    public final float f47030e;
    public final AnimatorSet f47031f;

    public do0(PhotoViewer photoViewer, View view, gp0 gp0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.f47027a = photoViewer;
        this.f47028b = view;
        this.f47029c = gp0Var;
        this.d = f10;
        this.f47030e = f11;
        this.f47031f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.Z8;
        View view = this.f47028b;
        gp0 gp0Var = this.f47029c;
        view.setOutlineProvider(gp0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f47027a;
        photoViewer.f43369x3.setOutlineProvider(gp0Var);
        photoViewer.f43369x3.setClipToOutline(true);
        pq0 pq0Var = photoViewer.F2;
        if (pq0Var != null) {
            pq0Var.setOutlineProvider(gp0Var);
            photoViewer.F2.setClipToOutline(true);
        }
        photoViewer.f43369x3.setTranslationY(this.d);
        float f10 = this.f47030e;
        view.setTranslationY(f10);
        pq0 pq0Var2 = photoViewer.F2;
        if (pq0Var2 != null) {
            pq0Var2.setTranslationY(f10);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f43208f0.invalidate();
        this.f47031f.start();
    }
}
