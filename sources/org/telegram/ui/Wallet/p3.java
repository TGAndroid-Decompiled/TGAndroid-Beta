package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class p3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f44793a;
    public final w3 f44794b;

    public p3(w3 w3Var, int i7) {
        this.f44793a = i7;
        this.f44794b = w3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f44793a) {
            case 0:
                w3 w3Var = this.f44794b;
                w3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3Var.R = floatValue;
                w3Var.f45251r.setUseGyroscope(floatValue);
                return;
            default:
                w3 w3Var2 = this.f44794b;
                w3Var2.getClass();
                w3Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3Var2.e();
                return;
        }
    }
}
