package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q40 extends AnimatorListenerAdapter {
    public final i60 f36790a;

    public q40(i60 i60Var) {
        this.f36790a = i60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f36790a.X0 = null;
    }
}
