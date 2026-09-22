package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d0 extends AnimatorListenerAdapter {
    public final int f28900a;
    public final m0 f28901b;

    public d0(m0 m0Var, int i10) {
        this.f28900a = i10;
        this.f28901b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28900a) {
            case 0:
                super.onAnimationEnd(animator);
                m0 m0Var = this.f28901b;
                m0Var.J0 = null;
                m0Var.I0 = 0.0f;
                m0Var.invalidate();
                return;
            default:
                m0 m0Var2 = this.f28901b;
                m0Var2.B0 = null;
                m0Var2.f29086y0 = 1.0f;
                m0Var2.f29075r0 = 0.0f;
                m0Var2.f29077s0 = 0.0f;
                m0Var2.invalidate();
                return;
        }
    }
}
