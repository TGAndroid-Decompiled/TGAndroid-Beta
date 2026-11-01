package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n30 extends AnimatorListenerAdapter {
    public final a50 f39684a;

    public n30(a50 a50Var) {
        this.f39684a = a50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f39684a.O2 = null;
    }
}
