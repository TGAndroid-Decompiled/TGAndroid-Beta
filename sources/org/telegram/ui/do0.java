package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class do0 implements Runnable {
    public final PhotoViewer f46950a;
    public final View f46951b;
    public final gp0 f46952c;
    public final float d;
    public final float f46953e;
    public final AnimatorSet f46954f;

    public do0(PhotoViewer photoViewer, View view, gp0 gp0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.f46950a = photoViewer;
        this.f46951b = view;
        this.f46952c = gp0Var;
        this.d = f10;
        this.f46953e = f11;
        this.f46954f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.Z8;
        View view = this.f46951b;
        gp0 gp0Var = this.f46952c;
        view.setOutlineProvider(gp0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f46950a;
        photoViewer.f43369x3.setOutlineProvider(gp0Var);
        photoViewer.f43369x3.setClipToOutline(true);
        pq0 pq0Var = photoViewer.F2;
        if (pq0Var != null) {
            pq0Var.setOutlineProvider(gp0Var);
            photoViewer.F2.setClipToOutline(true);
        }
        photoViewer.f43369x3.setTranslationY(this.d);
        float f10 = this.f46953e;
        view.setTranslationY(f10);
        pq0 pq0Var2 = photoViewer.F2;
        if (pq0Var2 != null) {
            pq0Var2.setTranslationY(f10);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f43208f0.invalidate();
        this.f46954f.start();
    }
}
