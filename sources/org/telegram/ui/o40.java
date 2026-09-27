package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o40 extends AnimatorListenerAdapter {
    public final g60 f36135a;

    public o40(g60 g60Var) {
        this.f36135a = g60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f36135a.X0 = null;
    }
}
