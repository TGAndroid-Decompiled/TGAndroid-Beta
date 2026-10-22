package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class w2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35063a;
    public final z2 f35064b;

    public w2(z2 z2Var, int i10) {
        this.f35063a = i10;
        this.f35064b = z2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35063a) {
            case 0:
                z2 z2Var = this.f35064b;
                z2Var.getClass();
                z2Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2Var.e();
                return;
            default:
                z2 z2Var2 = this.f35064b;
                z2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2Var2.Q = floatValue;
                z2Var2.f35177r.setUseGyroscope(floatValue);
                return;
        }
    }
}
