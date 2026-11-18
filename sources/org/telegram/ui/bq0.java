package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bq0 extends AnimatorListenerAdapter {
    public final cq0 f46269a;

    public bq0(cq0 cq0Var) {
        this.f46269a = cq0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        cq0 cq0Var = this.f46269a;
        PhotoViewer photoViewer = cq0Var.f46597c;
        photoViewer.f43279n4 = 0;
        photoViewer.D1();
        photoViewer.M0.setAlpha(255);
        photoViewer.f43208f0.invalidate();
        photoViewer.Q0.setTranslationY(0.0f);
        if (photoViewer.f43333t4) {
            PhotoViewer.T(photoViewer, cq0Var.f46596b.intValue());
        }
        uq0 uq0Var = cq0Var.f46595a;
        if (uq0Var != null) {
            uq0Var.d();
        }
    }
}
