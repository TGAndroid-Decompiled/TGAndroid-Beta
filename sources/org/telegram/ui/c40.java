package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c40 extends AnimatorListenerAdapter {
    public final v50 f38248a;

    public c40(v50 v50Var) {
        this.f38248a = v50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f38248a.X0 = null;
    }
}
