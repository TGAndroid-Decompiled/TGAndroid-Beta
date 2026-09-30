package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d0 extends AnimatorListenerAdapter {
    public final int f29211a;
    public final m0 f29212b;

    public d0(m0 m0Var, int i10) {
        this.f29211a = i10;
        this.f29212b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29211a) {
            case 0:
                super.onAnimationEnd(animator);
                m0 m0Var = this.f29212b;
                m0Var.J0 = null;
                m0Var.I0 = 0.0f;
                m0Var.invalidate();
                return;
            default:
                m0 m0Var2 = this.f29212b;
                m0Var2.B0 = null;
                m0Var2.f29404y0 = 1.0f;
                m0Var2.f29393r0 = 0.0f;
                m0Var2.f29395s0 = 0.0f;
                m0Var2.invalidate();
                return;
        }
    }
}
