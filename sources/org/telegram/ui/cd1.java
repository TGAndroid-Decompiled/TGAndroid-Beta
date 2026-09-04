package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cd1 extends AnimatorListenerAdapter {
    public final wd1 f35079a;

    public cd1(wd1 wd1Var) {
        this.f35079a = wd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        wd1 wd1Var = this.f35079a;
        if (wd1Var.W0 == null) {
            wd1Var.J0[0].setVisibility(4);
        }
    }
}
