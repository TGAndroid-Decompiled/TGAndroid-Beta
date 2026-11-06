package org.telegram.ui;

import android.animation.ValueAnimator;
public final class q3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f49060a;
    public final t3 f49061b;

    public q3(t3 t3Var, int i7) {
        this.f49060a = i7;
        this.f49061b = t3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49060a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t3 t3Var = this.f49061b;
                t3Var.I = floatValue;
                t3Var.f49876c.invalidate();
                t3Var.u();
                t3Var.r();
                return;
            case 1:
                t3 t3Var2 = this.f49061b;
                t3Var2.getClass();
                t3Var2.f49883x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t3Var2.A();
                t3Var2.u();
                t3Var2.r();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t3 t3Var3 = this.f49061b;
                t3Var3.f49884y = floatValue2;
                if (!t3Var3.f49879n) {
                    t3Var3.A();
                }
                t3Var3.u();
                t3Var3.r();
                return;
        }
    }
}
