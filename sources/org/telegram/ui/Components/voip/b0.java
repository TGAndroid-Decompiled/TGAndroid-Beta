package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final m0 f29174a;

    public b0(m0 m0Var) {
        this.f29174a = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m0 m0Var = this.f29174a;
        m0Var.N0 = null;
        m0Var.f29384y.E = false;
        u uVar = m0Var.E;
        if (uVar != null) {
            if (uVar.getParent() != null) {
                m0Var.removeView(m0Var.E);
                m0Var.E.e();
            }
            m0Var.E = null;
        }
    }
}
