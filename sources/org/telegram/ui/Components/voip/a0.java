package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final u f29269a;
    public final m0 f29270b;

    public a0(m0 m0Var, u uVar) {
        this.f29270b = m0Var;
        this.f29269a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m0 m0Var = this.f29270b;
        m0Var.N0 = null;
        this.f29269a.E = false;
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
