package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dd1 extends AnimatorListenerAdapter {
    public final xd1 f33101a;

    public dd1(xd1 xd1Var) {
        this.f33101a = xd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        xd1 xd1Var = this.f33101a;
        if (xd1Var.W0 == null) {
            xd1Var.J0[0].setVisibility(4);
        }
    }
}
