package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d0 extends AnimatorListenerAdapter {
    public final int f31801a;
    public final m0 f31802b;

    public d0(m0 m0Var, int i10) {
        this.f31801a = i10;
        this.f31802b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31801a) {
            case 0:
                super.onAnimationEnd(animator);
                m0 m0Var = this.f31802b;
                m0Var.J0 = null;
                m0Var.I0 = 0.0f;
                m0Var.invalidate();
                return;
            default:
                m0 m0Var2 = this.f31802b;
                m0Var2.B0 = null;
                m0Var2.f32008y0 = 1.0f;
                m0Var2.f31997r0 = 0.0f;
                m0Var2.f31999s0 = 0.0f;
                m0Var2.invalidate();
                return;
        }
    }
}
