package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final u f34145a;
    public final l0 f34146b;

    public z(l0 l0Var, u uVar) {
        this.f34146b = l0Var;
        this.f34145a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        l0 l0Var = this.f34146b;
        l0Var.J0 = null;
        this.f34145a.A = false;
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
