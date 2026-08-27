package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class b0 extends AnimatorListenerAdapter {

    public final int f33492a;

    public final k0 f33493b;

    public b0(k0 k0Var, int i10) {
        this.f33492a = i10;
        this.f33493b = k0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33492a) {
            case 0:
                super.onAnimationEnd(animator);
                k0 k0Var = this.f33493b;
                k0Var.F0 = null;
                k0Var.E0 = 0.0f;
                k0Var.invalidate();
                break;
            default:
                k0 k0Var2 = this.f33493b;
                k0Var2.f33678x0 = null;
                k0Var2.f33673u0 = 1.0f;
                k0Var2.f33664n0 = 0.0f;
                k0Var2.f33665o0 = 0.0f;
                k0Var2.invalidate();
                break;
        }
    }
}
