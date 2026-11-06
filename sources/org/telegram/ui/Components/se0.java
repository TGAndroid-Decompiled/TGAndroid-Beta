package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class se0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38028a;
    public final ve0 f38029b;

    public se0(ve0 ve0Var, int i7) {
        this.f38028a = i7;
        this.f38029b = ve0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38028a) {
            case 0:
                ve0 ve0Var = this.f38029b;
                ve0Var.getClass();
                ve0Var.f38953b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ve0Var.c(true);
                return;
            default:
                ve0 ve0Var2 = this.f38029b;
                ve0Var2.getClass();
                ve0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ve0Var2.c(true);
                return;
        }
    }
}
