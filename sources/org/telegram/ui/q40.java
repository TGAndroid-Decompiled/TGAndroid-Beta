package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q40 extends AnimatorListenerAdapter {
    public final j60 f39751a;

    public q40(j60 j60Var) {
        this.f39751a = j60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f39751a.X0 = null;
    }
}
