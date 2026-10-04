package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final u f31925a;
    public final u f31926b;
    public final m0 f31927c;

    public k0(m0 m0Var, u uVar, u uVar2) {
        this.f31927c = m0Var;
        this.f31925a = uVar;
        this.f31926b = uVar2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m0 m0Var = this.f31927c;
        m0Var.N0 = null;
        this.f31925a.E = false;
        u uVar = m0Var.E;
        if (uVar != null) {
            if (uVar.getParent() != null) {
                m0Var.removeView(m0Var.E);
                this.f31926b.e();
            }
            m0Var.E = null;
        }
    }
}
