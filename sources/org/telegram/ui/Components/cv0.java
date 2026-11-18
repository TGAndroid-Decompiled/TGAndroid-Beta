package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cv0 extends AnimatorListenerAdapter {
    public final int f34187a;
    public final dv0 f34188b;

    public cv0(dv0 dv0Var, int i7) {
        this.f34187a = i7;
        this.f34188b = dv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34187a) {
            case 0:
                dv0 dv0Var = this.f34188b;
                dv0Var.E = 1.0f;
                dv0Var.invalidate();
                dv0Var.H = null;
                return;
            case 1:
                dv0 dv0Var2 = this.f34188b;
                dv0Var2.m(((Float) dv0Var2.f34518w.getAnimatedValue()).floatValue());
                dv0Var2.f34518w = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f34188b.G = null;
                return;
        }
    }
}
