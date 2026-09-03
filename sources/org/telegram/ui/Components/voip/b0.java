package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final int f29542a;
    public final k0 f29543b;

    public b0(k0 k0Var, int i10) {
        this.f29542a = i10;
        this.f29543b = k0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29542a) {
            case 0:
                super.onAnimationEnd(animator);
                k0 k0Var = this.f29543b;
                k0Var.G0 = null;
                k0Var.F0 = 0.0f;
                k0Var.invalidate();
                return;
            default:
                k0 k0Var2 = this.f29543b;
                k0Var2.f29716y0 = null;
                k0Var2.f29710v0 = 1.0f;
                k0Var2.f29701o0 = 0.0f;
                k0Var2.f29702p0 = 0.0f;
                k0Var2.invalidate();
                return;
        }
    }
}
