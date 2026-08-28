package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final int f33442a;
    public final k0 f33443b;

    public b0(k0 k0Var, int i9) {
        this.f33442a = i9;
        this.f33443b = k0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33442a) {
            case 0:
                super.onAnimationEnd(animator);
                k0 k0Var = this.f33443b;
                k0Var.F0 = null;
                k0Var.E0 = 0.0f;
                k0Var.invalidate();
                return;
            default:
                k0 k0Var2 = this.f33443b;
                k0Var2.f33628x0 = null;
                k0Var2.f33623u0 = 1.0f;
                k0Var2.f33614n0 = 0.0f;
                k0Var2.f33615o0 = 0.0f;
                k0Var2.invalidate();
                return;
        }
    }
}
