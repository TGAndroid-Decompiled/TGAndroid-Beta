package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class u2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40984a;
    public final v2 f40985b;

    public u2(v2 v2Var, int i7) {
        this.f40984a = i7;
        this.f40985b = v2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40984a) {
            case 0:
                v2 v2Var = this.f40985b;
                v2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                v2Var.d = intValue;
                v2Var.f41011e = intValue;
                v2Var.f41012f = intValue;
                v2Var.h = intValue;
                v2Var.f41013n = intValue;
                v2Var.invalidate();
                return;
            default:
                v2 v2Var2 = this.f40985b;
                v2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var2.d = org.telegram.messenger.g0.W1(floatValue, v2Var2.G, org.telegram.messenger.g0.L(56.0f));
                v2Var2.f41011e = org.telegram.messenger.g0.W1(floatValue, v2Var2.G, org.telegram.messenger.g0.L(36.0f));
                v2Var2.f41012f = org.telegram.messenger.g0.W1(floatValue, v2Var2.G, org.telegram.messenger.g0.L(60.0f));
                v2Var2.h = org.telegram.messenger.g0.W1(floatValue, v2Var2.G, org.telegram.messenger.g0.L(36.0f));
                v2Var2.f41013n = org.telegram.messenger.g0.W1(floatValue, v2Var2.G, org.telegram.messenger.g0.L(64.0f));
                v2Var2.f41014r = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(50.0f));
                v2Var2.f41015s = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(20.0f));
                v2Var2.f41016w = org.telegram.messenger.g0.W1(floatValue, 0, 0);
                v2Var2.f41017x = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(-20.0f));
                v2Var2.f41018y = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(-40.0f));
                v2Var2.invalidate();
                return;
        }
    }
}
