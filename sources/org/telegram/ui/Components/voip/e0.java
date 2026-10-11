package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e0 extends AnimatorListenerAdapter {
    public final int f31956a;
    public final n0 f31957b;

    public e0(n0 n0Var, int i10) {
        this.f31956a = i10;
        this.f31957b = n0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31956a) {
            case 0:
                super.onAnimationEnd(animator);
                n0 n0Var = this.f31957b;
                n0Var.J0 = null;
                n0Var.I0 = 0.0f;
                n0Var.invalidate();
                return;
            default:
                n0 n0Var2 = this.f31957b;
                n0Var2.B0 = null;
                n0Var2.f32146y0 = 1.0f;
                n0Var2.f32135r0 = 0.0f;
                n0Var2.f32137s0 = 0.0f;
                n0Var2.invalidate();
                return;
        }
    }
}
