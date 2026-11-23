package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class p3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f44759a;
    public final w3 f44760b;

    public p3(w3 w3Var, int i7) {
        this.f44759a = i7;
        this.f44760b = w3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f44759a) {
            case 0:
                w3 w3Var = this.f44760b;
                w3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3Var.R = floatValue;
                w3Var.f45216r.setUseGyroscope(floatValue);
                return;
            default:
                w3 w3Var2 = this.f44760b;
                w3Var2.getClass();
                w3Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3Var2.e();
                return;
        }
    }
}
