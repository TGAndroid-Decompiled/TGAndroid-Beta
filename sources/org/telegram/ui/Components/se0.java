package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class se0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38024a;
    public final ve0 f38025b;

    public se0(ve0 ve0Var, int i7) {
        this.f38024a = i7;
        this.f38025b = ve0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38024a) {
            case 0:
                ve0 ve0Var = this.f38025b;
                ve0Var.getClass();
                ve0Var.f38932b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ve0Var.c(true);
                return;
            default:
                ve0 ve0Var2 = this.f38025b;
                ve0Var2.getClass();
                ve0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ve0Var2.c(true);
                return;
        }
    }
}
