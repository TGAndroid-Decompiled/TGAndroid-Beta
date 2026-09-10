package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final m0 f28057a;

    public b0(m0 m0Var) {
        this.f28057a = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m0 m0Var = this.f28057a;
        m0Var.N0 = null;
        m0Var.f28271y.E = false;
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
