package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bq0 extends AnimatorListenerAdapter {
    public final cq0 f46292a;

    public bq0(cq0 cq0Var) {
        this.f46292a = cq0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        cq0 cq0Var = this.f46292a;
        PhotoViewer photoViewer = cq0Var.f46653c;
        photoViewer.f43320n4 = 0;
        photoViewer.D1();
        photoViewer.M0.setAlpha(255);
        photoViewer.f43249f0.invalidate();
        photoViewer.Q0.setTranslationY(0.0f);
        if (photoViewer.f43374t4) {
            PhotoViewer.T(photoViewer, cq0Var.f46652b.intValue());
        }
        uq0 uq0Var = cq0Var.f46651a;
        if (uq0Var != null) {
            uq0Var.d();
        }
    }
}
