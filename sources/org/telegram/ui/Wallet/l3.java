package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class l3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42738a;
    public final o3 f42739b;

    public l3(o3 o3Var, int i7) {
        this.f42738a = i7;
        this.f42739b = o3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42738a) {
            case 0:
                o3 o3Var = this.f42739b;
                o3Var.getClass();
                o3Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o3Var.e();
                return;
            default:
                o3 o3Var2 = this.f42739b;
                o3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o3Var2.Q = floatValue;
                o3Var2.f42948r.setUseGyroscope(floatValue);
                return;
        }
    }
}
