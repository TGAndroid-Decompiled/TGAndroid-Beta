package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g1 extends AnimatorListenerAdapter {
    public final j1 f28952a;

    public g1(j1 j1Var) {
        this.f28952a = j1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        j1 j1Var = this.f28952a;
        j1Var.f29005b.removeViewImmediate(j1Var.d);
        j1Var.f29007f.d.release();
        j1Var.v = null;
        j1Var.f29011w = true;
        j1Var.f29012x = false;
        j1Var.J = null;
        j1Var.H = false;
    }
}
