package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ev0 extends AnimatorListenerAdapter {
    public final int f34853a;
    public final fv0 f34854b;

    public ev0(fv0 fv0Var, int i7) {
        this.f34853a = i7;
        this.f34854b = fv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34853a) {
            case 0:
                fv0 fv0Var = this.f34854b;
                fv0Var.E = 1.0f;
                fv0Var.invalidate();
                fv0Var.H = null;
                return;
            case 1:
                fv0 fv0Var2 = this.f34854b;
                fv0Var2.m(((Float) fv0Var2.f35206w.getAnimatedValue()).floatValue());
                fv0Var2.f35206w = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f34854b.G = null;
                return;
        }
    }
}
