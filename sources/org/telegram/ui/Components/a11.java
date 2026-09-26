package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class a11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22502a;
    public final b11 f22503b;

    public a11(b11 b11Var, int i10) {
        this.f22502a = i10;
        this.f22503b = b11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22502a) {
            case 0:
                b11 b11Var = this.f22503b;
                b11Var.getClass();
                b11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b11Var.invalidate();
                return;
            case 1:
                b11 b11Var2 = this.f22503b;
                b11Var2.getClass();
                b11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b11Var2.invalidate();
                return;
            case 2:
                b11 b11Var3 = this.f22503b;
                b11Var3.getClass();
                b11Var3.f22859f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b11Var3.invalidate();
                return;
            case 3:
                b11 b11Var4 = this.f22503b;
                b11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b11Var4.f22862s = floatValue;
                b11Var4.f22863w = (int) ((b11Var4.h * floatValue) + 0);
                b11Var4.invalidate();
                return;
            default:
                b11 b11Var5 = this.f22503b;
                b11Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b11Var5.v = floatValue2;
                int i10 = b11Var5.f22861r;
                b11Var5.f22864x = i10 + ((int) Math.ceil((b11Var5.f22860n - i10) * floatValue2));
                b11Var5.invalidate();
                return;
        }
    }
}
