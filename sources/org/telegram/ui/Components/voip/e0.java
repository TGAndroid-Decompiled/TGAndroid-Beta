package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e0 extends AnimatorListenerAdapter {
    public final int f32020a;
    public final n0 f32021b;

    public e0(n0 n0Var, int i10) {
        this.f32020a = i10;
        this.f32021b = n0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32020a) {
            case 0:
                super.onAnimationEnd(animator);
                n0 n0Var = this.f32021b;
                n0Var.J0 = null;
                n0Var.I0 = 0.0f;
                n0Var.invalidate();
                return;
            default:
                n0 n0Var2 = this.f32021b;
                n0Var2.B0 = null;
                n0Var2.f32210y0 = 1.0f;
                n0Var2.f32199r0 = 0.0f;
                n0Var2.f32201s0 = 0.0f;
                n0Var2.invalidate();
                return;
        }
    }
}
