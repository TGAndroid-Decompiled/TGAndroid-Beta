package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final int f33649a;
    public final l0 f33650b;

    public c0(l0 l0Var, int i10) {
        this.f33649a = i10;
        this.f33650b = l0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33649a) {
            case 0:
                super.onAnimationEnd(animator);
                l0 l0Var = this.f33650b;
                l0Var.F0 = null;
                l0Var.E0 = 0.0f;
                l0Var.invalidate();
                return;
            default:
                l0 l0Var2 = this.f33650b;
                l0Var2.f33826x0 = null;
                l0Var2.f33821u0 = 1.0f;
                l0Var2.f33812n0 = 0.0f;
                l0Var2.f33813o0 = 0.0f;
                l0Var2.invalidate();
                return;
        }
    }
}
