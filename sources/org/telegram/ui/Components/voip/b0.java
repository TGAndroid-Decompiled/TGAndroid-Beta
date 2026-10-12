package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final u f31607a;
    public final n0 f31608b;

    public b0(n0 n0Var, u uVar) {
        this.f31608b = n0Var;
        this.f31607a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n0 n0Var = this.f31608b;
        n0Var.N0 = null;
        this.f31607a.E = false;
        u uVar = n0Var.E;
        if (uVar != null) {
            if (uVar.getParent() != null) {
                n0Var.removeView(n0Var.E);
                n0Var.E.e();
            }
            n0Var.E = null;
        }
    }
}
