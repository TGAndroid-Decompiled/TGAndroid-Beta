package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q40 extends AnimatorListenerAdapter {
    public final h60 f39714a;

    public q40(h60 h60Var) {
        this.f39714a = h60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f39714a.X0 = null;
    }
}
