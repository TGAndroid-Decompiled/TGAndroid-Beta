package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q0 extends AnimatorListenerAdapter {
    public final i4 f48714a;

    public q0(i4 i4Var) {
        this.f48714a = i4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.messenger.g0.h3(new xp0(this, 6));
    }
}
