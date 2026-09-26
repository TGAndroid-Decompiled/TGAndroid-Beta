package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final u f29415a;
    public final u f29416b;
    public final m0 f29417c;

    public k0(m0 m0Var, u uVar, u uVar2) {
        this.f29417c = m0Var;
        this.f29415a = uVar;
        this.f29416b = uVar2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m0 m0Var = this.f29417c;
        m0Var.N0 = null;
        this.f29415a.E = false;
        u uVar = m0Var.E;
        if (uVar != null) {
            if (uVar.getParent() != null) {
                m0Var.removeView(m0Var.E);
                this.f29416b.e();
            }
            m0Var.E = null;
        }
    }
}
