package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ac1 extends AnimatorListenerAdapter {
    public final vc1 f37734a;

    public ac1(vc1 vc1Var) {
        this.f37734a = vc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        vc1 vc1Var = this.f37734a;
        if (vc1Var.X0 == null) {
            vc1Var.K0[0].setVisibility(4);
        }
    }
}
