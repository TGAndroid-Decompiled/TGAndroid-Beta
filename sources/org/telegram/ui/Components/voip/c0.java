package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final n0 f31621a;

    public c0(n0 n0Var) {
        this.f31621a = n0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n0 n0Var = this.f31621a;
        n0Var.N0 = null;
        n0Var.f31845y.E = false;
        u uVar = n0Var.E;
        if (uVar != null) {
            if (uVar.getParent() != null) {
                n0Var.removeView(n0Var.E);
                n0Var.E.e();
            }
            n0Var.E = null;
        }
    }
}
