package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final k0 f33965a;

    public z(k0 k0Var) {
        this.f33965a = k0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k0 k0Var = this.f33965a;
        k0Var.J0 = null;
        k0Var.f33629y.A = false;
        t tVar = k0Var.A;
        if (tVar != null) {
            if (tVar.getParent() != null) {
                k0Var.removeView(k0Var.A);
                k0Var.A.e();
            }
            k0Var.A = null;
        }
    }
}
