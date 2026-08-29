package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final l0 f33606a;

    public a0(l0 l0Var) {
        this.f33606a = l0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        l0 l0Var = this.f33606a;
        l0Var.J0 = null;
        l0Var.f33827y.A = false;
        u uVar = l0Var.A;
        if (uVar != null) {
            if (uVar.getParent() != null) {
                l0Var.removeView(l0Var.A);
                l0Var.A.e();
            }
            l0Var.A = null;
        }
    }
}
