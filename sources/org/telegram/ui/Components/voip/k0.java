package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final u f29031a;
    public final u f29032b;
    public final m0 f29033c;

    public k0(m0 m0Var, u uVar, u uVar2) {
        this.f29033c = m0Var;
        this.f29031a = uVar;
        this.f29032b = uVar2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m0 m0Var = this.f29033c;
        m0Var.N0 = null;
        this.f29031a.E = false;
        u uVar = m0Var.E;
        if (uVar != null) {
            if (uVar.getParent() != null) {
                m0Var.removeView(m0Var.E);
                this.f29032b.e();
            }
            m0Var.E = null;
        }
    }
}
