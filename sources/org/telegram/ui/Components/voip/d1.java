package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d1 extends AnimatorListenerAdapter {
    public final g1 f33471a;

    public d1(g1 g1Var) {
        this.f33471a = g1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        g1 g1Var = this.f33471a;
        g1Var.f33518b.removeViewImmediate(g1Var.d);
        g1Var.f33521f.d.release();
        g1Var.v = null;
        g1Var.f33525w = true;
        g1Var.f33526x = false;
        g1Var.F = null;
        g1Var.D = false;
    }
}
