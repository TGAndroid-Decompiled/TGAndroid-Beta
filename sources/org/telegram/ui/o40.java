package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o40 extends AnimatorListenerAdapter {
    public final g60 f40417a;

    public o40(g60 g60Var) {
        this.f40417a = g60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f40417a.X0 = null;
    }
}
