package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mu0 extends AnimatorListenerAdapter {
    public final nu0 f38073a;

    public mu0(nu0 nu0Var) {
        this.f38073a = nu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        nu0 nu0Var = this.f38073a;
        PhotoViewer photoViewer = nu0Var.f38478c;
        photoViewer.f32010n4 = 0;
        photoViewer.G1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f31928e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f32064t4) {
            PhotoViewer.a0(photoViewer, nu0Var.f38477b.intValue());
        }
        hv0 hv0Var = nu0Var.f38476a;
        if (hv0Var != null) {
            hv0Var.d();
        }
    }
}
