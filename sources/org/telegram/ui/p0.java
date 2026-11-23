package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p0 extends AnimatorListenerAdapter {
    public final g4 f50672a;

    public p0(g4 g4Var) {
        this.f50672a = g4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.messenger.g0.g3(new iq0(this, 6));
    }
}
