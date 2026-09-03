package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d1 extends AnimatorListenerAdapter {
    public final g1 f29566a;

    public d1(g1 g1Var) {
        this.f29566a = g1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        g1 g1Var = this.f29566a;
        g1Var.f29610b.removeViewImmediate(g1Var.d);
        g1Var.f29612f.d.release();
        g1Var.v = null;
        g1Var.f29616w = true;
        g1Var.f29617x = false;
        g1Var.G = null;
        g1Var.E = false;
    }
}
