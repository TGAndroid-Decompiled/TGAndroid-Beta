package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p0 extends AnimatorListenerAdapter {
    public final g4 f48610a;

    public p0(g4 g4Var) {
        this.f48610a = g4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.messenger.g0.h3(new jq0(this, 6));
    }
}
