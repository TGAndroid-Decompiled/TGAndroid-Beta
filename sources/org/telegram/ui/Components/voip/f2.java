package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39343a;
    public final g2 f39344b;

    public f2(g2 g2Var, int i3) {
        this.f39343a = i3;
        this.f39344b = g2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39343a) {
            case 0:
                g2 g2Var = this.f39344b;
                g2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                g2Var.d = intValue;
                g2Var.f39371e = intValue;
                g2Var.f39372f = intValue;
                g2Var.h = intValue;
                g2Var.f39373n = intValue;
                g2Var.invalidate();
                return;
            default:
                g2 g2Var2 = this.f39344b;
                g2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g2Var2.d = org.telegram.messenger.g0.W1(floatValue, g2Var2.G, org.telegram.messenger.g0.L(56.0f));
                g2Var2.f39371e = org.telegram.messenger.g0.W1(floatValue, g2Var2.G, org.telegram.messenger.g0.L(36.0f));
                g2Var2.f39372f = org.telegram.messenger.g0.W1(floatValue, g2Var2.G, org.telegram.messenger.g0.L(60.0f));
                g2Var2.h = org.telegram.messenger.g0.W1(floatValue, g2Var2.G, org.telegram.messenger.g0.L(36.0f));
                g2Var2.f39373n = org.telegram.messenger.g0.W1(floatValue, g2Var2.G, org.telegram.messenger.g0.L(64.0f));
                g2Var2.f39374r = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(50.0f));
                g2Var2.f39375s = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(20.0f));
                g2Var2.f39376w = org.telegram.messenger.g0.W1(floatValue, 0, 0);
                g2Var2.f39377x = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(-20.0f));
                g2Var2.f39378y = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(-40.0f));
                g2Var2.invalidate();
                return;
        }
    }
}
