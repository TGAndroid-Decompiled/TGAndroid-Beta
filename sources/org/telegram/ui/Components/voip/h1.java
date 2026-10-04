package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h1 extends AnimatorListenerAdapter {
    public final k1 f31887a;

    public h1(k1 k1Var) {
        this.f31887a = k1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k1 k1Var = this.f31887a;
        k1Var.f31934b.removeViewImmediate(k1Var.d);
        k1Var.f31937f.d.release();
        k1Var.v = null;
        k1Var.f31941w = true;
        k1Var.f31942x = false;
        k1Var.J = null;
        k1Var.H = false;
    }
}
