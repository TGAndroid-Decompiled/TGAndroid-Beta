package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final u f29327a;
    public final u f29328b;
    public final m0 f29329c;

    public k0(m0 m0Var, u uVar, u uVar2) {
        this.f29329c = m0Var;
        this.f29327a = uVar;
        this.f29328b = uVar2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m0 m0Var = this.f29329c;
        m0Var.N0 = null;
        this.f29327a.E = false;
        u uVar = m0Var.E;
        if (uVar != null) {
            if (uVar.getParent() != null) {
                m0Var.removeView(m0Var.E);
                this.f29328b.e();
            }
            m0Var.E = null;
        }
    }
}
