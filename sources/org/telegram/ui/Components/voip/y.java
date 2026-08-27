package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class y extends AnimatorListenerAdapter {

    public final t f33992a;

    public final k0 f33993b;

    public y(k0 k0Var, t tVar) {
        this.f33993b = k0Var;
        this.f33992a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k0 k0Var = this.f33993b;
        k0Var.J0 = null;
        this.f33992a.A = false;
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
