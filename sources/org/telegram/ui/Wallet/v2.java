package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class v2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35319a;
    public final y2 f35320b;

    public v2(y2 y2Var, int i10) {
        this.f35319a = i10;
        this.f35320b = y2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35319a) {
            case 0:
                y2 y2Var = this.f35320b;
                y2Var.getClass();
                y2Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y2Var.e();
                return;
            default:
                y2 y2Var2 = this.f35320b;
                y2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y2Var2.Q = floatValue;
                y2Var2.f35438r.setUseGyroscope(floatValue);
                return;
        }
    }
}
