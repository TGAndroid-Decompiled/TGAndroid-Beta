package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class i3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42613a;
    public final p3 f42614b;

    public i3(p3 p3Var, int i7) {
        this.f42613a = i7;
        this.f42614b = p3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42613a) {
            case 0:
                p3 p3Var = this.f42614b;
                p3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3Var.Q = floatValue;
                p3Var.f42971r.setUseGyroscope(floatValue);
                return;
            default:
                p3 p3Var2 = this.f42614b;
                p3Var2.getClass();
                p3Var2.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3Var2.e();
                return;
        }
    }
}
