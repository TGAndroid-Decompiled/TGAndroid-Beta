package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final int f31990a;
    public final l0 f31991b;

    public c0(l0 l0Var, int i10) {
        this.f31990a = i10;
        this.f31991b = l0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31990a) {
            case 0:
                super.onAnimationEnd(animator);
                l0 l0Var = this.f31991b;
                l0Var.G0 = null;
                l0Var.F0 = 0.0f;
                l0Var.invalidate();
                return;
            default:
                l0 l0Var2 = this.f31991b;
                l0Var2.f32177y0 = null;
                l0Var2.f32171v0 = 1.0f;
                l0Var2.f32162o0 = 0.0f;
                l0Var2.f32163p0 = 0.0f;
                l0Var2.invalidate();
                return;
        }
    }
}
