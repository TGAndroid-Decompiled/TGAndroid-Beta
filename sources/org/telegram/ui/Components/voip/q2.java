package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39577a;
    public final r2 f39578b;

    public q2(r2 r2Var, int i7) {
        this.f39577a = i7;
        this.f39578b = r2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39577a) {
            case 0:
                r2 r2Var = this.f39578b;
                r2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                r2Var.d = intValue;
                r2Var.f39597e = intValue;
                r2Var.f39598f = intValue;
                r2Var.h = intValue;
                r2Var.f39599n = intValue;
                r2Var.invalidate();
                return;
            default:
                r2 r2Var2 = this.f39578b;
                r2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var2.d = org.telegram.messenger.g0.W1(floatValue, r2Var2.F, org.telegram.messenger.g0.L(56.0f));
                r2Var2.f39597e = org.telegram.messenger.g0.W1(floatValue, r2Var2.F, org.telegram.messenger.g0.L(36.0f));
                r2Var2.f39598f = org.telegram.messenger.g0.W1(floatValue, r2Var2.F, org.telegram.messenger.g0.L(60.0f));
                r2Var2.h = org.telegram.messenger.g0.W1(floatValue, r2Var2.F, org.telegram.messenger.g0.L(36.0f));
                r2Var2.f39599n = org.telegram.messenger.g0.W1(floatValue, r2Var2.F, org.telegram.messenger.g0.L(64.0f));
                r2Var2.f39600r = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(50.0f));
                r2Var2.f39601s = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(20.0f));
                r2Var2.f39602w = org.telegram.messenger.g0.W1(floatValue, 0, 0);
                r2Var2.f39603x = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(-20.0f));
                r2Var2.f39604y = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(-40.0f));
                r2Var2.invalidate();
                return;
        }
    }
}
