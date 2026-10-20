package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final int f31364a;
    public final l0 f31365b;

    public c0(l0 l0Var, int i10) {
        this.f31364a = i10;
        this.f31365b = l0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31364a) {
            case 0:
                super.onAnimationEnd(animator);
                l0 l0Var = this.f31365b;
                l0Var.J0 = null;
                l0Var.I0 = 0.0f;
                l0Var.invalidate();
                return;
            default:
                l0 l0Var2 = this.f31365b;
                l0Var2.B0 = null;
                l0Var2.f31545y0 = 1.0f;
                l0Var2.f31534r0 = 0.0f;
                l0Var2.f31536s0 = 0.0f;
                l0Var2.invalidate();
                return;
        }
    }
}
