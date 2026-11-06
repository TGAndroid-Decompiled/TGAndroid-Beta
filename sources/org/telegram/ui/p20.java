package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p20 extends AnimatorListenerAdapter {
    public final c40 f48591a;

    public p20(c40 c40Var) {
        this.f48591a = c40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f48591a.O2 = null;
    }
}
