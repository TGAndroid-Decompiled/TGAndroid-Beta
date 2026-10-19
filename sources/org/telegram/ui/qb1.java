package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qb1 extends AnimatorListenerAdapter {
    public final kc1 f40529a;

    public qb1(kc1 kc1Var) {
        this.f40529a = kc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        kc1 kc1Var = this.f40529a;
        if (kc1Var.W0 == null) {
            kc1Var.J0[0].setVisibility(4);
        }
    }
}
