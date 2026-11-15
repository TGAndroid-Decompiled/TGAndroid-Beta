package org.telegram.ui;

import android.animation.ValueAnimator;
public final class q3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f50443a;
    public final t3 f50444b;

    public q3(t3 t3Var, int i7) {
        this.f50443a = i7;
        this.f50444b = t3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50443a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t3 t3Var = this.f50444b;
                t3Var.J = floatValue;
                t3Var.f51335c.invalidate();
                t3Var.u();
                t3Var.r();
                return;
            case 1:
                t3 t3Var2 = this.f50444b;
                t3Var2.getClass();
                t3Var2.f51342x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t3Var2.A();
                t3Var2.u();
                t3Var2.r();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t3 t3Var3 = this.f50444b;
                t3Var3.f51343y = floatValue2;
                if (!t3Var3.f51338n) {
                    t3Var3.A();
                }
                t3Var3.u();
                t3Var3.r();
                return;
        }
    }
}
