package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fv0 extends AnimatorListenerAdapter {
    public final int f35321a;
    public final gv0 f35322b;

    public fv0(gv0 gv0Var, int i7) {
        this.f35321a = i7;
        this.f35322b = gv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35321a) {
            case 0:
                gv0 gv0Var = this.f35322b;
                gv0Var.E = 1.0f;
                gv0Var.invalidate();
                gv0Var.H = null;
                return;
            case 1:
                gv0 gv0Var2 = this.f35322b;
                gv0Var2.m(((Float) gv0Var2.f35685w.getAnimatedValue()).floatValue());
                gv0Var2.f35685w = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f35322b.G = null;
                return;
        }
    }
}
