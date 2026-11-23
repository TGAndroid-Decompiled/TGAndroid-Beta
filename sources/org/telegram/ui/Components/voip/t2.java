package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class t2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41329a;
    public final u2 f41330b;

    public t2(u2 u2Var, int i7) {
        this.f41329a = i7;
        this.f41330b = u2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41329a) {
            case 0:
                u2 u2Var = this.f41330b;
                u2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                u2Var.d = intValue;
                u2Var.f41356e = intValue;
                u2Var.f41357f = intValue;
                u2Var.h = intValue;
                u2Var.f41358n = intValue;
                u2Var.invalidate();
                return;
            default:
                u2 u2Var2 = this.f41330b;
                u2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var2.d = org.telegram.messenger.g0.W1(floatValue, u2Var2.G, org.telegram.messenger.g0.L(56.0f));
                u2Var2.f41356e = org.telegram.messenger.g0.W1(floatValue, u2Var2.G, org.telegram.messenger.g0.L(36.0f));
                u2Var2.f41357f = org.telegram.messenger.g0.W1(floatValue, u2Var2.G, org.telegram.messenger.g0.L(60.0f));
                u2Var2.h = org.telegram.messenger.g0.W1(floatValue, u2Var2.G, org.telegram.messenger.g0.L(36.0f));
                u2Var2.f41358n = org.telegram.messenger.g0.W1(floatValue, u2Var2.G, org.telegram.messenger.g0.L(64.0f));
                u2Var2.f41359r = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(50.0f));
                u2Var2.f41360s = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(20.0f));
                u2Var2.f41361w = org.telegram.messenger.g0.W1(floatValue, 0, 0);
                u2Var2.f41362x = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(-20.0f));
                u2Var2.f41363y = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(-40.0f));
                u2Var2.invalidate();
                return;
        }
    }
}
