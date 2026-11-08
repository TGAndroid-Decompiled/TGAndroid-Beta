package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c71 extends AnimatorListenerAdapter {
    public final v71 f44713a;

    public c71(v71 v71Var) {
        this.f44713a = v71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        v71 v71Var = this.f44713a;
        if (v71Var.X0 == null) {
            v71Var.K0[0].setVisibility(4);
        }
    }
}
