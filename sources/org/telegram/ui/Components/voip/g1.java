package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g1 extends AnimatorListenerAdapter {
    public final j1 f28926a;

    public g1(j1 j1Var) {
        this.f28926a = j1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        j1 j1Var = this.f28926a;
        j1Var.f28979b.removeViewImmediate(j1Var.d);
        j1Var.f28981f.d.release();
        j1Var.v = null;
        j1Var.f28985w = true;
        j1Var.f28986x = false;
        j1Var.J = null;
        j1Var.H = false;
    }
}
