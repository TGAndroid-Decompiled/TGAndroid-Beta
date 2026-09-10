package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gd1 extends AnimatorListenerAdapter {
    public final ae1 f33065a;

    public gd1(ae1 ae1Var) {
        this.f33065a = ae1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ae1 ae1Var = this.f33065a;
        if (ae1Var.W0 == null) {
            ae1Var.J0[0].setVisibility(4);
        }
    }
}
