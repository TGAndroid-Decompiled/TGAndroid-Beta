package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ct0 extends AnimatorListenerAdapter {
    public final dt0 f37210a;

    public ct0(dt0 dt0Var) {
        this.f37210a = dt0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        dt0 dt0Var = this.f37210a;
        PhotoViewer photoViewer = dt0Var.f37632c;
        photoViewer.f35733j4 = 0;
        photoViewer.F1();
        photoViewer.H0.setAlpha(255);
        photoViewer.f35647a0.invalidate();
        photoViewer.L0.setTranslationY(0.0f);
        if (photoViewer.f35786p4) {
            PhotoViewer.a0(photoViewer, dt0Var.f37631b.intValue());
        }
        xt0 xt0Var = dt0Var.f37630a;
        if (xt0Var != null) {
            xt0Var.d();
        }
    }
}
