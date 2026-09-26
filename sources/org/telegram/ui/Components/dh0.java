package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class dh0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23701a;
    public final gh0 f23702b;

    public dh0(gh0 gh0Var, int i10) {
        this.f23701a = i10;
        this.f23702b = gh0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23701a) {
            case 0:
                gh0 gh0Var = this.f23702b;
                gh0Var.getClass();
                gh0Var.f24502b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gh0Var.c(true);
                return;
            default:
                gh0 gh0Var2 = this.f23702b;
                gh0Var2.getClass();
                gh0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gh0Var2.c(true);
                return;
        }
    }
}
