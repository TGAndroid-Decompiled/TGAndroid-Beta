package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final t f31638a;
    public final t f31639b;
    public final l0 f31640c;

    public j0(l0 l0Var, t tVar, t tVar2) {
        this.f31640c = l0Var;
        this.f31638a = tVar;
        this.f31639b = tVar2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        l0 l0Var = this.f31640c;
        l0Var.N0 = null;
        this.f31638a.E = false;
        t tVar = l0Var.E;
        if (tVar != null) {
            if (tVar.getParent() != null) {
                l0Var.removeView(l0Var.E);
                this.f31639b.e();
            }
            l0Var.E = null;
        }
    }
}
