package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e0 extends AnimatorListenerAdapter {
    public final int f31657a;
    public final n0 f31658b;

    public e0(n0 n0Var, int i10) {
        this.f31657a = i10;
        this.f31658b = n0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31657a) {
            case 0:
                super.onAnimationEnd(animator);
                n0 n0Var = this.f31658b;
                n0Var.J0 = null;
                n0Var.I0 = 0.0f;
                n0Var.invalidate();
                return;
            default:
                n0 n0Var2 = this.f31658b;
                n0Var2.B0 = null;
                n0Var2.f31846y0 = 1.0f;
                n0Var2.f31835r0 = 0.0f;
                n0Var2.f31837s0 = 0.0f;
                n0Var2.invalidate();
                return;
        }
    }
}
