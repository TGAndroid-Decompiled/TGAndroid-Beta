package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class t2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41366a;
    public final u2 f41367b;

    public t2(u2 u2Var, int i7) {
        this.f41366a = i7;
        this.f41367b = u2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41366a) {
            case 0:
                u2 u2Var = this.f41367b;
                u2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                u2Var.d = intValue;
                u2Var.f41393e = intValue;
                u2Var.f41394f = intValue;
                u2Var.h = intValue;
                u2Var.f41395n = intValue;
                u2Var.invalidate();
                return;
            default:
                u2 u2Var2 = this.f41367b;
                u2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var2.d = org.telegram.messenger.g0.W1(floatValue, u2Var2.G, org.telegram.messenger.g0.L(56.0f));
                u2Var2.f41393e = org.telegram.messenger.g0.W1(floatValue, u2Var2.G, org.telegram.messenger.g0.L(36.0f));
                u2Var2.f41394f = org.telegram.messenger.g0.W1(floatValue, u2Var2.G, org.telegram.messenger.g0.L(60.0f));
                u2Var2.h = org.telegram.messenger.g0.W1(floatValue, u2Var2.G, org.telegram.messenger.g0.L(36.0f));
                u2Var2.f41395n = org.telegram.messenger.g0.W1(floatValue, u2Var2.G, org.telegram.messenger.g0.L(64.0f));
                u2Var2.f41396r = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(50.0f));
                u2Var2.f41397s = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(20.0f));
                u2Var2.f41398w = org.telegram.messenger.g0.W1(floatValue, 0, 0);
                u2Var2.f41399x = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(-20.0f));
                u2Var2.f41400y = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(-40.0f));
                u2Var2.invalidate();
                return;
        }
    }
}
