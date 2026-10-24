package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class n11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28760a;
    public final o11 f28761b;

    public n11(o11 o11Var, int i10) {
        this.f28760a = i10;
        this.f28761b = o11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28760a) {
            case 0:
                o11 o11Var = this.f28761b;
                o11Var.getClass();
                o11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o11Var.invalidate();
                return;
            case 1:
                o11 o11Var2 = this.f28761b;
                o11Var2.getClass();
                o11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o11Var2.invalidate();
                return;
            case 2:
                o11 o11Var3 = this.f28761b;
                o11Var3.getClass();
                o11Var3.f29127f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o11Var3.invalidate();
                return;
            case 3:
                o11 o11Var4 = this.f28761b;
                o11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o11Var4.f29130s = floatValue;
                o11Var4.f29131w = (int) ((o11Var4.h * floatValue) + 0);
                o11Var4.invalidate();
                return;
            default:
                o11 o11Var5 = this.f28761b;
                o11Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o11Var5.v = floatValue2;
                int i10 = o11Var5.f29129r;
                o11Var5.f29132x = i10 + ((int) Math.ceil((o11Var5.f29128n - i10) * floatValue2));
                o11Var5.invalidate();
                return;
        }
    }
}
