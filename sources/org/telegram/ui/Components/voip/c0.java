package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final int f31404a;
    public final l0 f31405b;

    public c0(l0 l0Var, int i10) {
        this.f31404a = i10;
        this.f31405b = l0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31404a) {
            case 0:
                super.onAnimationEnd(animator);
                l0 l0Var = this.f31405b;
                l0Var.J0 = null;
                l0Var.I0 = 0.0f;
                l0Var.invalidate();
                return;
            default:
                l0 l0Var2 = this.f31405b;
                l0Var2.B0 = null;
                l0Var2.f31585y0 = 1.0f;
                l0Var2.f31574r0 = 0.0f;
                l0Var2.f31576s0 = 0.0f;
                l0Var2.invalidate();
                return;
        }
    }
}
