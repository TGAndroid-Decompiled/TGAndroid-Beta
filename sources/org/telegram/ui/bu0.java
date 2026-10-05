package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bu0 extends AnimatorListenerAdapter {
    public final cu0 f35223a;

    public bu0(cu0 cu0Var) {
        this.f35223a = cu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        cu0 cu0Var = this.f35223a;
        PhotoViewer photoViewer = cu0Var.f35552c;
        photoViewer.f33995n4 = 0;
        photoViewer.G1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f33914e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f34049t4) {
            PhotoViewer.Z(photoViewer, cu0Var.f35551b.intValue());
        }
        wu0 wu0Var = cu0Var.f35550a;
        if (wu0Var != null) {
            wu0Var.d();
        }
    }
}
