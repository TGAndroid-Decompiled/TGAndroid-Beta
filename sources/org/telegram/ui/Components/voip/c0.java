package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final int f31368a;
    public final l0 f31369b;

    public c0(l0 l0Var, int i10) {
        this.f31368a = i10;
        this.f31369b = l0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31368a) {
            case 0:
                super.onAnimationEnd(animator);
                l0 l0Var = this.f31369b;
                l0Var.J0 = null;
                l0Var.I0 = 0.0f;
                l0Var.invalidate();
                return;
            default:
                l0 l0Var2 = this.f31369b;
                l0Var2.B0 = null;
                l0Var2.f31549y0 = 1.0f;
                l0Var2.f31538r0 = 0.0f;
                l0Var2.f31540s0 = 0.0f;
                l0Var2.invalidate();
                return;
        }
    }
}
