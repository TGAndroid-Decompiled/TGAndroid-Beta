package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l40 extends AnimatorListenerAdapter {
    public final d60 f35188a;

    public l40(d60 d60Var) {
        this.f35188a = d60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35188a.X0 = null;
    }
}
