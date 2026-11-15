package org.telegram.ui;

import android.animation.ValueAnimator;
public final class q3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f50452a;
    public final t3 f50453b;

    public q3(t3 t3Var, int i7) {
        this.f50452a = i7;
        this.f50453b = t3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50452a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t3 t3Var = this.f50453b;
                t3Var.J = floatValue;
                t3Var.f51334c.invalidate();
                t3Var.u();
                t3Var.r();
                return;
            case 1:
                t3 t3Var2 = this.f50453b;
                t3Var2.getClass();
                t3Var2.f51341x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t3Var2.A();
                t3Var2.u();
                t3Var2.r();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t3 t3Var3 = this.f50453b;
                t3Var3.f51342y = floatValue2;
                if (!t3Var3.f51337n) {
                    t3Var3.A();
                }
                t3Var3.u();
                t3Var3.r();
                return;
        }
    }
}
