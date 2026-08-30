package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l40 extends AnimatorListenerAdapter {
    public final c60 f35954a;

    public l40(c60 c60Var) {
        this.f35954a = c60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35954a.U0 = null;
    }
}
