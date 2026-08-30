package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ic1 extends AnimatorListenerAdapter {
    public final cd1 f35092a;

    public ic1(cd1 cd1Var) {
        this.f35092a = cd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        cd1 cd1Var = this.f35092a;
        if (cd1Var.T0 == null) {
            cd1Var.G0[0].setVisibility(4);
        }
    }
}
