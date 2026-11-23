package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fv0 extends AnimatorListenerAdapter {
    public final int f35281a;
    public final gv0 f35282b;

    public fv0(gv0 gv0Var, int i7) {
        this.f35281a = i7;
        this.f35282b = gv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35281a) {
            case 0:
                gv0 gv0Var = this.f35282b;
                gv0Var.E = 1.0f;
                gv0Var.invalidate();
                gv0Var.H = null;
                return;
            case 1:
                gv0 gv0Var2 = this.f35282b;
                gv0Var2.m(((Float) gv0Var2.f35638w.getAnimatedValue()).floatValue());
                gv0Var2.f35638w = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f35282b.G = null;
                return;
        }
    }
}
