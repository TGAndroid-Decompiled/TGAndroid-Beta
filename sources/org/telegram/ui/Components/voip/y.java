package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y extends AnimatorListenerAdapter {
    public final t f33942a;
    public final k0 f33943b;

    public y(k0 k0Var, t tVar) {
        this.f33943b = k0Var;
        this.f33942a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k0 k0Var = this.f33943b;
        k0Var.J0 = null;
        this.f33942a.A = false;
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
