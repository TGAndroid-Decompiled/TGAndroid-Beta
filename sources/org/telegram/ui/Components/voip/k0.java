package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final u f29336a;
    public final u f29337b;
    public final m0 f29338c;

    public k0(m0 m0Var, u uVar, u uVar2) {
        this.f29338c = m0Var;
        this.f29336a = uVar;
        this.f29337b = uVar2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m0 m0Var = this.f29338c;
        m0Var.N0 = null;
        this.f29336a.E = false;
        u uVar = m0Var.E;
        if (uVar != null) {
            if (uVar.getParent() != null) {
                m0Var.removeView(m0Var.E);
                this.f29337b.e();
            }
            m0Var.E = null;
        }
    }
}
