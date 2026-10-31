package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class e2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31411a;
    public final f2 f31412b;

    public e2(f2 f2Var, int i10) {
        this.f31411a = i10;
        this.f31412b = f2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31411a) {
            case 0:
                f2 f2Var = this.f31412b;
                f2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f2Var.d = intValue;
                f2Var.e = intValue;
                f2Var.f31426f = intValue;
                f2Var.h = intValue;
                f2Var.f31427n = intValue;
                f2Var.invalidate();
                return;
            default:
                f2 f2Var2 = this.f31412b;
                f2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f2Var2.d = org.telegram.messenger.i0.W1(floatValue, f2Var2.F, org.telegram.messenger.i0.L(56.0f));
                f2Var2.e = org.telegram.messenger.i0.W1(floatValue, f2Var2.F, org.telegram.messenger.i0.L(36.0f));
                f2Var2.f31426f = org.telegram.messenger.i0.W1(floatValue, f2Var2.F, org.telegram.messenger.i0.L(60.0f));
                f2Var2.h = org.telegram.messenger.i0.W1(floatValue, f2Var2.F, org.telegram.messenger.i0.L(36.0f));
                f2Var2.f31427n = org.telegram.messenger.i0.W1(floatValue, f2Var2.F, org.telegram.messenger.i0.L(64.0f));
                f2Var2.f31428r = org.telegram.messenger.i0.W1(floatValue, 0, org.telegram.messenger.i0.L(50.0f));
                f2Var2.f31429s = org.telegram.messenger.i0.W1(floatValue, 0, org.telegram.messenger.i0.L(20.0f));
                f2Var2.f31430w = org.telegram.messenger.i0.W1(floatValue, 0, 0);
                f2Var2.f31431x = org.telegram.messenger.i0.W1(floatValue, 0, org.telegram.messenger.i0.L(-20.0f));
                f2Var2.f31432y = org.telegram.messenger.i0.W1(floatValue, 0, org.telegram.messenger.i0.L(-40.0f));
                f2Var2.invalidate();
                return;
        }
    }
}
