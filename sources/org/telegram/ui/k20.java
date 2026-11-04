package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k20 extends AnimatorListenerAdapter {
    public final x30 f46744a;

    public k20(x30 x30Var) {
        this.f46744a = x30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f46744a.P2 = null;
    }
}
