package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h1 extends AnimatorListenerAdapter {
    public final k1 f31893a;

    public h1(k1 k1Var) {
        this.f31893a = k1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k1 k1Var = this.f31893a;
        k1Var.f31940b.removeViewImmediate(k1Var.d);
        k1Var.f31943f.d.release();
        k1Var.v = null;
        k1Var.f31947w = true;
        k1Var.f31948x = false;
        k1Var.J = null;
        k1Var.H = false;
    }
}
