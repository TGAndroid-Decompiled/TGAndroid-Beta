package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final k0 f30049a;

    public z(k0 k0Var) {
        this.f30049a = k0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k0 k0Var = this.f30049a;
        k0Var.K0 = null;
        k0Var.f29743y.B = false;
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
