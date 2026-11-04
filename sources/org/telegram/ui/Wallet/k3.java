package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class k3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42749a;
    public final n3 f42750b;

    public k3(n3 n3Var, int i3) {
        this.f42749a = i3;
        this.f42750b = n3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42749a) {
            case 0:
                n3 n3Var = this.f42750b;
                n3Var.getClass();
                n3Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n3Var.e();
                return;
            default:
                n3 n3Var2 = this.f42750b;
                n3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n3Var2.R = floatValue;
                n3Var2.f42919r.setUseGyroscope(floatValue);
                return;
        }
    }
}
