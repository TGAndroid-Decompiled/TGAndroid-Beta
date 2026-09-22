package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d0 extends AnimatorListenerAdapter {
    public final int f29268a;
    public final m0 f29269b;

    public d0(m0 m0Var, int i10) {
        this.f29268a = i10;
        this.f29269b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29268a) {
            case 0:
                super.onAnimationEnd(animator);
                m0 m0Var = this.f29269b;
                m0Var.J0 = null;
                m0Var.I0 = 0.0f;
                m0Var.invalidate();
                return;
            default:
                m0 m0Var2 = this.f29269b;
                m0Var2.B0 = null;
                m0Var2.f29454y0 = 1.0f;
                m0Var2.f29443r0 = 0.0f;
                m0Var2.f29445s0 = 0.0f;
                m0Var2.invalidate();
                return;
        }
    }
}
