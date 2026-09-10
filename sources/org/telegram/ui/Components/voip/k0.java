package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final t f28208a;
    public final t f28209b;
    public final m0 f28210c;

    public k0(m0 m0Var, t tVar, t tVar2) {
        this.f28210c = m0Var;
        this.f28208a = tVar;
        this.f28209b = tVar2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m0 m0Var = this.f28210c;
        m0Var.N0 = null;
        this.f28208a.E = false;
        t tVar = m0Var.E;
        if (tVar != null) {
            if (tVar.getParent() != null) {
                m0Var.removeView(m0Var.E);
                this.f28209b.e();
            }
            m0Var.E = null;
        }
    }
}
