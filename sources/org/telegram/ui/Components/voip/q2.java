package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39435a;
    public final r2 f39436b;

    public q2(r2 r2Var, int i7) {
        this.f39435a = i7;
        this.f39436b = r2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39435a) {
            case 0:
                r2 r2Var = this.f39436b;
                r2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                r2Var.d = intValue;
                r2Var.f39455e = intValue;
                r2Var.f39456f = intValue;
                r2Var.h = intValue;
                r2Var.f39457n = intValue;
                r2Var.invalidate();
                return;
            default:
                r2 r2Var2 = this.f39436b;
                r2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var2.d = org.telegram.messenger.g0.W1(floatValue, r2Var2.F, org.telegram.messenger.g0.L(56.0f));
                r2Var2.f39455e = org.telegram.messenger.g0.W1(floatValue, r2Var2.F, org.telegram.messenger.g0.L(36.0f));
                r2Var2.f39456f = org.telegram.messenger.g0.W1(floatValue, r2Var2.F, org.telegram.messenger.g0.L(60.0f));
                r2Var2.h = org.telegram.messenger.g0.W1(floatValue, r2Var2.F, org.telegram.messenger.g0.L(36.0f));
                r2Var2.f39457n = org.telegram.messenger.g0.W1(floatValue, r2Var2.F, org.telegram.messenger.g0.L(64.0f));
                r2Var2.f39458r = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(50.0f));
                r2Var2.f39459s = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(20.0f));
                r2Var2.f39460w = org.telegram.messenger.g0.W1(floatValue, 0, 0);
                r2Var2.f39461x = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(-20.0f));
                r2Var2.f39462y = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(-40.0f));
                r2Var2.invalidate();
                return;
        }
    }
}
