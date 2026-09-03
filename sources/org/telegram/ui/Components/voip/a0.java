package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final l0 f31951a;

    public a0(l0 l0Var) {
        this.f31951a = l0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        l0 l0Var = this.f31951a;
        l0Var.K0 = null;
        l0Var.f32176y.B = false;
        u uVar = l0Var.B;
        if (uVar != null) {
            if (uVar.getParent() != null) {
                l0Var.removeView(l0Var.B);
                l0Var.B.e();
            }
            l0Var.B = null;
        }
    }
}
