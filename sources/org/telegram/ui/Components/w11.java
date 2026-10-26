package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class w11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34339a;
    public final x11 f34340b;

    public w11(x11 x11Var, int i10) {
        this.f34339a = i10;
        this.f34340b = x11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34339a) {
            case 0:
                x11 x11Var = this.f34340b;
                x11Var.getClass();
                x11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x11Var.invalidate();
                return;
            case 1:
                x11 x11Var2 = this.f34340b;
                x11Var2.getClass();
                x11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x11Var2.invalidate();
                return;
            case 2:
                x11 x11Var3 = this.f34340b;
                x11Var3.getClass();
                x11Var3.f34586f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x11Var3.invalidate();
                return;
            case 3:
                x11 x11Var4 = this.f34340b;
                x11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x11Var4.f34589s = floatValue;
                x11Var4.f34590w = (int) ((x11Var4.h * floatValue) + 0);
                x11Var4.invalidate();
                return;
            default:
                x11 x11Var5 = this.f34340b;
                x11Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x11Var5.v = floatValue2;
                int i10 = x11Var5.f34588r;
                x11Var5.f34591x = i10 + ((int) Math.ceil((x11Var5.f34587n - i10) * floatValue2));
                x11Var5.invalidate();
                return;
        }
    }
}
