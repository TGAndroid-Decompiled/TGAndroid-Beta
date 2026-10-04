package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final u f31926a;
    public final u f31927b;
    public final m0 f31928c;

    public k0(m0 m0Var, u uVar, u uVar2) {
        this.f31928c = m0Var;
        this.f31926a = uVar;
        this.f31927b = uVar2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m0 m0Var = this.f31928c;
        m0Var.N0 = null;
        this.f31926a.E = false;
        u uVar = m0Var.E;
        if (uVar != null) {
            if (uVar.getParent() != null) {
                m0Var.removeView(m0Var.E);
                this.f31927b.e();
            }
            m0Var.E = null;
        }
    }
}
