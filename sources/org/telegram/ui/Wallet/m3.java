package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class m3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34896a;
    public final p3 f34897b;

    public m3(p3 p3Var, int i10) {
        this.f34896a = i10;
        this.f34897b = p3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34896a) {
            case 0:
                p3 p3Var = this.f34897b;
                p3Var.getClass();
                p3Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3Var.e();
                return;
            default:
                p3 p3Var2 = this.f34897b;
                p3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3Var2.Q = floatValue;
                p3Var2.f35021r.setUseGyroscope(floatValue);
                return;
        }
    }
}
