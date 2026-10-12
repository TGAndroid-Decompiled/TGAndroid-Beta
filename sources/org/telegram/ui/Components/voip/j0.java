package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final t f30247a;
    public final t f30248b;
    public final l0 f30249c;

    public j0(l0 l0Var, t tVar, t tVar2) {
        this.f30249c = l0Var;
        this.f30247a = tVar;
        this.f30248b = tVar2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        l0 l0Var = this.f30249c;
        l0Var.N0 = null;
        this.f30247a.E = false;
        t tVar = l0Var.E;
        if (tVar != null) {
            if (tVar.getParent() != null) {
                l0Var.removeView(l0Var.E);
                this.f30248b.e();
            }
            l0Var.E = null;
        }
    }
}
