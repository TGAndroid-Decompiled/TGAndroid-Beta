package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f1 extends AnimatorListenerAdapter {
    public final i1 f33792a;

    public f1(i1 i1Var) {
        this.f33792a = i1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        i1 i1Var = this.f33792a;
        i1Var.f33844b.removeViewImmediate(i1Var.d);
        i1Var.f33846f.d.release();
        i1Var.v = null;
        i1Var.f33850w = true;
        i1Var.f33851x = false;
        i1Var.J = null;
        i1Var.H = false;
    }
}
