package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final t f33871a;
    public final t f33872b;
    public final l0 f33873c;

    public j0(l0 l0Var, t tVar, t tVar2) {
        this.f33873c = l0Var;
        this.f33871a = tVar;
        this.f33872b = tVar2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        l0 l0Var = this.f33873c;
        l0Var.N0 = null;
        this.f33871a.E = false;
        t tVar = l0Var.E;
        if (tVar != null) {
            if (tVar.getParent() != null) {
                l0Var.removeView(l0Var.E);
                this.f33872b.e();
            }
            l0Var.E = null;
        }
    }
}
