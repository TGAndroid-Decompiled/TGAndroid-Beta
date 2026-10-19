package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final int f31415a;
    public final l0 f31416b;

    public c0(l0 l0Var, int i10) {
        this.f31415a = i10;
        this.f31416b = l0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31415a) {
            case 0:
                super.onAnimationEnd(animator);
                l0 l0Var = this.f31416b;
                l0Var.J0 = null;
                l0Var.I0 = 0.0f;
                l0Var.invalidate();
                return;
            default:
                l0 l0Var2 = this.f31416b;
                l0Var2.B0 = null;
                l0Var2.f31596y0 = 1.0f;
                l0Var2.f31585r0 = 0.0f;
                l0Var2.f31587s0 = 0.0f;
                l0Var2.invalidate();
                return;
        }
    }
}
