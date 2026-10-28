package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e40 extends AnimatorListenerAdapter {
    public final x50 f38753a;

    public e40(x50 x50Var) {
        this.f38753a = x50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f38753a.X0 = null;
    }
}
