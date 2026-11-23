package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cq0 extends AnimatorListenerAdapter {
    public final dq0 f46623a;

    public cq0(dq0 dq0Var) {
        this.f46623a = dq0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        dq0 dq0Var = this.f46623a;
        PhotoViewer photoViewer = dq0Var.f46994c;
        photoViewer.f43289n4 = 0;
        photoViewer.D1();
        photoViewer.M0.setAlpha(255);
        photoViewer.f43218f0.invalidate();
        photoViewer.Q0.setTranslationY(0.0f);
        if (photoViewer.f43343t4) {
            PhotoViewer.T(photoViewer, dq0Var.f46993b.intValue());
        }
        vq0 vq0Var = dq0Var.f46992a;
        if (vq0Var != null) {
            vq0Var.d();
        }
    }
}
