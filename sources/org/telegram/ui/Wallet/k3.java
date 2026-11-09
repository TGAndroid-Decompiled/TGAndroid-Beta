package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class k3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42657a;
    public final n3 f42658b;

    public k3(n3 n3Var, int i7) {
        this.f42657a = i7;
        this.f42658b = n3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42657a) {
            case 0:
                n3 n3Var = this.f42658b;
                n3Var.getClass();
                n3Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n3Var.e();
                return;
            default:
                n3 n3Var2 = this.f42658b;
                n3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n3Var2.Q = floatValue;
                n3Var2.f42866r.setUseGyroscope(floatValue);
                return;
        }
    }
}
