package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class m3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34897a;
    public final p3 f34898b;

    public m3(p3 p3Var, int i10) {
        this.f34897a = i10;
        this.f34898b = p3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34897a) {
            case 0:
                p3 p3Var = this.f34898b;
                p3Var.getClass();
                p3Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3Var.e();
                return;
            default:
                p3 p3Var2 = this.f34898b;
                p3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3Var2.Q = floatValue;
                p3Var2.f35022r.setUseGyroscope(floatValue);
                return;
        }
    }
}
