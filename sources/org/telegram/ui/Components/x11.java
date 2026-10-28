package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class x11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34637a;
    public final y11 f34638b;

    public x11(y11 y11Var, int i10) {
        this.f34637a = i10;
        this.f34638b = y11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34637a) {
            case 0:
                y11 y11Var = this.f34638b;
                y11Var.getClass();
                y11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y11Var.invalidate();
                return;
            case 1:
                y11 y11Var2 = this.f34638b;
                y11Var2.getClass();
                y11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y11Var2.invalidate();
                return;
            case 2:
                y11 y11Var3 = this.f34638b;
                y11Var3.getClass();
                y11Var3.f34940f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y11Var3.invalidate();
                return;
            case 3:
                y11 y11Var4 = this.f34638b;
                y11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y11Var4.f34943s = floatValue;
                y11Var4.f34944w = (int) ((y11Var4.h * floatValue) + 0);
                y11Var4.invalidate();
                return;
            default:
                y11 y11Var5 = this.f34638b;
                y11Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y11Var5.v = floatValue2;
                int i10 = y11Var5.f34942r;
                y11Var5.f34945x = i10 + ((int) Math.ceil((y11Var5.f34941n - i10) * floatValue2));
                y11Var5.invalidate();
                return;
        }
    }
}
