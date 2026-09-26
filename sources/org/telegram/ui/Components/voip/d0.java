package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d0 extends AnimatorListenerAdapter {
    public final int f29216a;
    public final m0 f29217b;

    public d0(m0 m0Var, int i10) {
        this.f29216a = i10;
        this.f29217b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29216a) {
            case 0:
                super.onAnimationEnd(animator);
                m0 m0Var = this.f29217b;
                m0Var.J0 = null;
                m0Var.I0 = 0.0f;
                m0Var.invalidate();
                return;
            default:
                m0 m0Var2 = this.f29217b;
                m0Var2.B0 = null;
                m0Var2.f29409y0 = 1.0f;
                m0Var2.f29398r0 = 0.0f;
                m0Var2.f29400s0 = 0.0f;
                m0Var2.invalidate();
                return;
        }
    }
}
