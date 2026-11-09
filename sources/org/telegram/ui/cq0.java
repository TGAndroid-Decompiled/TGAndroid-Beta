package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cq0 extends AnimatorListenerAdapter {
    public final dq0 f44737a;

    public cq0(dq0 dq0Var) {
        this.f44737a = dq0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        dq0 dq0Var = this.f44737a;
        PhotoViewer photoViewer = dq0Var.f45105c;
        photoViewer.f41463m4 = 0;
        photoViewer.D1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f41391e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f41518s4) {
            PhotoViewer.S(photoViewer, dq0Var.f45104b.intValue());
        }
        wq0 wq0Var = dq0Var.f45103a;
        if (wq0Var != null) {
            wq0Var.d();
        }
    }
}
