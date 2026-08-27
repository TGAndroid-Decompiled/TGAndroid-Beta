package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class d1 extends AnimatorListenerAdapter {

    public final g1 f33521a;

    public d1(g1 g1Var) {
        this.f33521a = g1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        g1 g1Var = this.f33521a;
        g1Var.f33568b.removeViewImmediate(g1Var.d);
        g1Var.f33571f.d.release();
        g1Var.v = null;
        g1Var.f33575w = true;
        g1Var.f33576x = false;
        g1Var.F = null;
        g1Var.D = false;
    }
}
