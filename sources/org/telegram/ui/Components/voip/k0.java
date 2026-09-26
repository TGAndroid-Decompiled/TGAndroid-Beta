package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final u f29332a;
    public final u f29333b;
    public final m0 f29334c;

    public k0(m0 m0Var, u uVar, u uVar2) {
        this.f29334c = m0Var;
        this.f29332a = uVar;
        this.f29333b = uVar2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m0 m0Var = this.f29334c;
        m0Var.N0 = null;
        this.f29332a.E = false;
        u uVar = m0Var.E;
        if (uVar != null) {
            if (uVar.getParent() != null) {
                m0Var.removeView(m0Var.E);
                this.f29333b.e();
            }
            m0Var.E = null;
        }
    }
}
