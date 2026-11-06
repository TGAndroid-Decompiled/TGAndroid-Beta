package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class m3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42744a;
    public final p3 f42745b;

    public m3(p3 p3Var, int i7) {
        this.f42744a = i7;
        this.f42745b = p3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42744a) {
            case 0:
                p3 p3Var = this.f42745b;
                p3Var.getClass();
                p3Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3Var.e();
                return;
            default:
                p3 p3Var2 = this.f42745b;
                p3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3Var2.Q = floatValue;
                p3Var2.f42962r.setUseGyroscope(floatValue);
                return;
        }
    }
}
