package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bq0 extends AnimatorListenerAdapter {
    public final cq0 f46296a;

    public bq0(cq0 cq0Var) {
        this.f46296a = cq0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        cq0 cq0Var = this.f46296a;
        PhotoViewer photoViewer = cq0Var.f46656c;
        photoViewer.f43324n4 = 0;
        photoViewer.D1();
        photoViewer.M0.setAlpha(255);
        photoViewer.f43253f0.invalidate();
        photoViewer.Q0.setTranslationY(0.0f);
        if (photoViewer.f43378t4) {
            PhotoViewer.T(photoViewer, cq0Var.f46655b.intValue());
        }
        uq0 uq0Var = cq0Var.f46654a;
        if (uq0Var != null) {
            uq0Var.d();
        }
    }
}
