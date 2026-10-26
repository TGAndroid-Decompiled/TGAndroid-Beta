package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class v2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37373a;
    public final y2 f37374b;

    public v2(y2 y2Var, int i10) {
        this.f37373a = i10;
        this.f37374b = y2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37373a) {
            case 0:
                y2 y2Var = this.f37374b;
                y2Var.getClass();
                y2Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y2Var.e();
                return;
            default:
                y2 y2Var2 = this.f37374b;
                y2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y2Var2.Q = floatValue;
                y2Var2.f37501r.setUseGyroscope(floatValue);
                return;
        }
    }
}
