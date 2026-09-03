package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y extends AnimatorListenerAdapter {
    public final t f30008a;
    public final k0 f30009b;

    public y(k0 k0Var, t tVar) {
        this.f30009b = k0Var;
        this.f30008a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k0 k0Var = this.f30009b;
        k0Var.K0 = null;
        this.f30008a.B = false;
        t tVar = k0Var.B;
        if (tVar != null) {
            if (tVar.getParent() != null) {
                k0Var.removeView(k0Var.B);
                k0Var.B.e();
            }
            k0Var.B = null;
        }
    }
}
