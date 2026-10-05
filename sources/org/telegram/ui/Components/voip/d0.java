package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d0 extends AnimatorListenerAdapter {
    public final int f31874a;
    public final m0 f31875b;

    public d0(m0 m0Var, int i10) {
        this.f31874a = i10;
        this.f31875b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31874a) {
            case 0:
                super.onAnimationEnd(animator);
                m0 m0Var = this.f31875b;
                m0Var.J0 = null;
                m0Var.I0 = 0.0f;
                m0Var.invalidate();
                return;
            default:
                m0 m0Var2 = this.f31875b;
                m0Var2.B0 = null;
                m0Var2.f32081y0 = 1.0f;
                m0Var2.f32070r0 = 0.0f;
                m0Var2.f32072s0 = 0.0f;
                m0Var2.invalidate();
                return;
        }
    }
}
