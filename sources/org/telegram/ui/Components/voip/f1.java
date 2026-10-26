package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f1 extends AnimatorListenerAdapter {
    public final i1 f33795a;

    public f1(i1 i1Var) {
        this.f33795a = i1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        i1 i1Var = this.f33795a;
        i1Var.f33847b.removeViewImmediate(i1Var.d);
        i1Var.f33849f.d.release();
        i1Var.v = null;
        i1Var.f33853w = true;
        i1Var.f33854x = false;
        i1Var.J = null;
        i1Var.H = false;
    }
}
