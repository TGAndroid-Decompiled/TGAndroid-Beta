package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31489a;
    public final g2 f31490b;

    public f2(g2 g2Var, int i10) {
        this.f31489a = i10;
        this.f31490b = g2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31489a) {
            case 0:
                g2 g2Var = this.f31490b;
                g2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                g2Var.d = intValue;
                g2Var.e = intValue;
                g2Var.f31516f = intValue;
                g2Var.h = intValue;
                g2Var.f31517n = intValue;
                g2Var.invalidate();
                return;
            default:
                g2 g2Var2 = this.f31490b;
                g2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g2Var2.d = org.telegram.messenger.i0.W1(floatValue, g2Var2.F, org.telegram.messenger.i0.L(56.0f));
                g2Var2.e = org.telegram.messenger.i0.W1(floatValue, g2Var2.F, org.telegram.messenger.i0.L(36.0f));
                g2Var2.f31516f = org.telegram.messenger.i0.W1(floatValue, g2Var2.F, org.telegram.messenger.i0.L(60.0f));
                g2Var2.h = org.telegram.messenger.i0.W1(floatValue, g2Var2.F, org.telegram.messenger.i0.L(36.0f));
                g2Var2.f31517n = org.telegram.messenger.i0.W1(floatValue, g2Var2.F, org.telegram.messenger.i0.L(64.0f));
                g2Var2.f31518r = org.telegram.messenger.i0.W1(floatValue, 0, org.telegram.messenger.i0.L(50.0f));
                g2Var2.f31519s = org.telegram.messenger.i0.W1(floatValue, 0, org.telegram.messenger.i0.L(20.0f));
                g2Var2.f31520w = org.telegram.messenger.i0.W1(floatValue, 0, 0);
                g2Var2.f31521x = org.telegram.messenger.i0.W1(floatValue, 0, org.telegram.messenger.i0.L(-20.0f));
                g2Var2.f31522y = org.telegram.messenger.i0.W1(floatValue, 0, org.telegram.messenger.i0.L(-40.0f));
                g2Var2.invalidate();
                return;
        }
    }
}
