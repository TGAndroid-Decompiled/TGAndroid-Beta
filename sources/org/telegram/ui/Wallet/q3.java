package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class q3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f44921a;
    public final x3 f44922b;

    public q3(x3 x3Var, int i7) {
        this.f44921a = i7;
        this.f44922b = x3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f44921a) {
            case 0:
                x3 x3Var = this.f44922b;
                x3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3Var.R = floatValue;
                x3Var.f45378r.setUseGyroscope(floatValue);
                return;
            default:
                x3 x3Var2 = this.f44922b;
                x3Var2.getClass();
                x3Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3Var2.e();
                return;
        }
    }
}
