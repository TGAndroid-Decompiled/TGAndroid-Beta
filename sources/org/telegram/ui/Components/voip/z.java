package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final t f31950a;
    public final l0 f31951b;

    public z(l0 l0Var, t tVar) {
        this.f31951b = l0Var;
        this.f31950a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        l0 l0Var = this.f31951b;
        l0Var.N0 = null;
        this.f31950a.E = false;
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
