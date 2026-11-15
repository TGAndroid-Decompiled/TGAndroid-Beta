package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p20 extends AnimatorListenerAdapter {
    public final c40 f50114a;

    public p20(c40 c40Var) {
        this.f50114a = c40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f50114a.S2 = null;
    }
}
