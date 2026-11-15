package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class h3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43909a;
    public final o3 f43910b;

    public h3(o3 o3Var, int i7) {
        this.f43909a = i7;
        this.f43910b = o3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43909a) {
            case 0:
                o3 o3Var = this.f43910b;
                o3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o3Var.R = floatValue;
                o3Var.f44229r.setUseGyroscope(floatValue);
                return;
            default:
                o3 o3Var2 = this.f43910b;
                o3Var2.getClass();
                o3Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o3Var2.e();
                return;
        }
    }
}
