package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class pf0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31668a;
    public final rf0 f31669b;

    public pf0(rf0 rf0Var, int i10) {
        this.f31668a = i10;
        this.f31669b = rf0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31668a) {
            case 0:
                rf0 rf0Var = this.f31669b;
                rf0Var.getClass();
                rf0Var.f32292y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rf0Var.invalidate();
                return;
            default:
                rf0 rf0Var2 = this.f31669b;
                rf0Var2.getClass();
                rf0Var2.f32292y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rf0Var2.invalidate();
                return;
        }
    }
}
