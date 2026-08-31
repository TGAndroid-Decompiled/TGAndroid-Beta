package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class kc1 extends AnimatorListenerAdapter {
    public final ed1 f38349a;

    public kc1(ed1 ed1Var) {
        this.f38349a = ed1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ed1 ed1Var = this.f38349a;
        if (ed1Var.T0 == null) {
            ed1Var.G0[0].setVisibility(4);
        }
    }
}
