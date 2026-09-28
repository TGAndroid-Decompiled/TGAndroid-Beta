package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h1 extends AnimatorListenerAdapter {
    public final k1 f29300a;

    public h1(k1 k1Var) {
        this.f29300a = k1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k1 k1Var = this.f29300a;
        k1Var.f29344b.removeViewImmediate(k1Var.d);
        k1Var.f29346f.d.release();
        k1Var.v = null;
        k1Var.f29350w = true;
        k1Var.f29351x = false;
        k1Var.J = null;
        k1Var.H = false;
    }
}
