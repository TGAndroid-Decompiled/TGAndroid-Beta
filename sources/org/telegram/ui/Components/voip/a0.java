package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final l0 f31396a;

    public a0(l0 l0Var) {
        this.f31396a = l0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        l0 l0Var = this.f31396a;
        l0Var.N0 = null;
        l0Var.f31628y.E = false;
        t tVar = l0Var.E;
        if (tVar != null) {
            if (tVar.getParent() != null) {
                l0Var.removeView(l0Var.E);
                l0Var.E.e();
            }
            l0Var.E = null;
        }
    }
}
