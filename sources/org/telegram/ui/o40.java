package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o40 extends AnimatorListenerAdapter {
    public final g60 f40451a;

    public o40(g60 g60Var) {
        this.f40451a = g60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f40451a.X0 = null;
    }
}
