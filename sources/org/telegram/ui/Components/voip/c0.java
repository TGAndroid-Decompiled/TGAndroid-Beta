package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final int f31462a;
    public final l0 f31463b;

    public c0(l0 l0Var, int i10) {
        this.f31462a = i10;
        this.f31463b = l0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31462a) {
            case 0:
                super.onAnimationEnd(animator);
                l0 l0Var = this.f31463b;
                l0Var.J0 = null;
                l0Var.I0 = 0.0f;
                l0Var.invalidate();
                return;
            default:
                l0 l0Var2 = this.f31463b;
                l0Var2.B0 = null;
                l0Var2.f31656y0 = 1.0f;
                l0Var2.f31645r0 = 0.0f;
                l0Var2.f31647s0 = 0.0f;
                l0Var2.invalidate();
                return;
        }
    }
}
