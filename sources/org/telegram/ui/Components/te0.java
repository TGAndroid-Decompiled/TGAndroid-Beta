package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class te0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38391a;
    public final we0 f38392b;

    public te0(we0 we0Var, int i7) {
        this.f38391a = i7;
        this.f38392b = we0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38391a) {
            case 0:
                we0 we0Var = this.f38392b;
                we0Var.getClass();
                we0Var.f40040b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                we0Var.c(true);
                return;
            default:
                we0 we0Var2 = this.f38392b;
                we0Var2.getClass();
                we0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                we0Var2.c(true);
                return;
        }
    }
}
