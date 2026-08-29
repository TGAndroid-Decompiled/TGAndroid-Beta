package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final u f33768a;
    public final u f33769b;
    public final l0 f33770c;

    public j0(l0 l0Var, u uVar, u uVar2) {
        this.f33770c = l0Var;
        this.f33768a = uVar;
        this.f33769b = uVar2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        l0 l0Var = this.f33770c;
        l0Var.J0 = null;
        this.f33768a.A = false;
        u uVar = l0Var.A;
        if (uVar != null) {
            if (uVar.getParent() != null) {
                l0Var.removeView(l0Var.A);
                this.f33769b.e();
            }
            l0Var.A = null;
        }
    }
}
