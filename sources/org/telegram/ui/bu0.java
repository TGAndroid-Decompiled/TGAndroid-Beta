package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bu0 extends AnimatorListenerAdapter {
    public final cu0 f35199a;

    public bu0(cu0 cu0Var) {
        this.f35199a = cu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        cu0 cu0Var = this.f35199a;
        PhotoViewer photoViewer = cu0Var.f35560c;
        photoViewer.f33982n4 = 0;
        photoViewer.G1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f33901e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f34036t4) {
            PhotoViewer.Z(photoViewer, cu0Var.f35559b.intValue());
        }
        wu0 wu0Var = cu0Var.f35558a;
        if (wu0Var != null) {
            wu0Var.d();
        }
    }
}
