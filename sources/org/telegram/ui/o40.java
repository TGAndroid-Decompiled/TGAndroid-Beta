package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o40 extends AnimatorListenerAdapter {
    public final g60 f40413a;

    public o40(g60 g60Var) {
        this.f40413a = g60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f40413a.X0 = null;
    }
}
