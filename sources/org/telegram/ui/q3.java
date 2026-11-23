package org.telegram.ui;

import android.animation.ValueAnimator;
public final class q3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f50974a;
    public final t3 f50975b;

    public q3(t3 t3Var, int i7) {
        this.f50974a = i7;
        this.f50975b = t3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50974a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t3 t3Var = this.f50975b;
                t3Var.J = floatValue;
                t3Var.f52140c.invalidate();
                t3Var.u();
                t3Var.r();
                return;
            case 1:
                t3 t3Var2 = this.f50975b;
                t3Var2.getClass();
                t3Var2.f52147x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t3Var2.A();
                t3Var2.u();
                t3Var2.r();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t3 t3Var3 = this.f50975b;
                t3Var3.f52148y = floatValue2;
                if (!t3Var3.f52143n) {
                    t3Var3.A();
                }
                t3Var3.u();
                t3Var3.r();
                return;
        }
    }
}
