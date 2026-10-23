package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final int f31550a;
    public final l0 f31551b;

    public c0(l0 l0Var, int i10) {
        this.f31550a = i10;
        this.f31551b = l0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31550a) {
            case 0:
                super.onAnimationEnd(animator);
                l0 l0Var = this.f31551b;
                l0Var.J0 = null;
                l0Var.I0 = 0.0f;
                l0Var.invalidate();
                return;
            default:
                l0 l0Var2 = this.f31551b;
                l0Var2.B0 = null;
                l0Var2.f31731y0 = 1.0f;
                l0Var2.f31720r0 = 0.0f;
                l0Var2.f31722s0 = 0.0f;
                l0Var2.invalidate();
                return;
        }
    }
}
