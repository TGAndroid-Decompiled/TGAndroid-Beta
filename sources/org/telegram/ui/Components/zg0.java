package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class zg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33938a;
    public final ch0 f33939b;

    public zg0(ch0 ch0Var, int i10) {
        this.f33938a = i10;
        this.f33939b = ch0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33938a) {
            case 0:
                ch0 ch0Var = this.f33939b;
                ch0Var.getClass();
                ch0Var.f25941b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ch0Var.c(true);
                return;
            default:
                ch0 ch0Var2 = this.f33939b;
                ch0Var2.getClass();
                ch0Var2.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ch0Var2.c(true);
                return;
        }
    }
}
