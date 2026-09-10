package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final t f28045a;
    public final m0 f28046b;

    public a0(m0 m0Var, t tVar) {
        this.f28046b = m0Var;
        this.f28045a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m0 m0Var = this.f28046b;
        m0Var.N0 = null;
        this.f28045a.E = false;
        t tVar = m0Var.E;
        if (tVar != null) {
            if (tVar.getParent() != null) {
                m0Var.removeView(m0Var.E);
                m0Var.E.e();
            }
            m0Var.E = null;
        }
    }
}
