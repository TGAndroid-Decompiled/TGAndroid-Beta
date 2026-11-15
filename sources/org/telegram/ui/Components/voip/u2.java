package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class u2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40987a;
    public final v2 f40988b;

    public u2(v2 v2Var, int i7) {
        this.f40987a = i7;
        this.f40988b = v2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40987a) {
            case 0:
                v2 v2Var = this.f40988b;
                v2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                v2Var.d = intValue;
                v2Var.f41014e = intValue;
                v2Var.f41015f = intValue;
                v2Var.h = intValue;
                v2Var.f41016n = intValue;
                v2Var.invalidate();
                return;
            default:
                v2 v2Var2 = this.f40988b;
                v2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var2.d = org.telegram.messenger.g0.W1(floatValue, v2Var2.G, org.telegram.messenger.g0.L(56.0f));
                v2Var2.f41014e = org.telegram.messenger.g0.W1(floatValue, v2Var2.G, org.telegram.messenger.g0.L(36.0f));
                v2Var2.f41015f = org.telegram.messenger.g0.W1(floatValue, v2Var2.G, org.telegram.messenger.g0.L(60.0f));
                v2Var2.h = org.telegram.messenger.g0.W1(floatValue, v2Var2.G, org.telegram.messenger.g0.L(36.0f));
                v2Var2.f41016n = org.telegram.messenger.g0.W1(floatValue, v2Var2.G, org.telegram.messenger.g0.L(64.0f));
                v2Var2.f41017r = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(50.0f));
                v2Var2.f41018s = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(20.0f));
                v2Var2.f41019w = org.telegram.messenger.g0.W1(floatValue, 0, 0);
                v2Var2.f41020x = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(-20.0f));
                v2Var2.f41021y = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(-40.0f));
                v2Var2.invalidate();
                return;
        }
    }
}
