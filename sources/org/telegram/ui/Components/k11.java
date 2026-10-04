package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class k11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27938a;
    public final l11 f27939b;

    public k11(l11 l11Var, int i10) {
        this.f27938a = i10;
        this.f27939b = l11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27938a) {
            case 0:
                l11 l11Var = this.f27939b;
                l11Var.getClass();
                l11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l11Var.invalidate();
                return;
            case 1:
                l11 l11Var2 = this.f27939b;
                l11Var2.getClass();
                l11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l11Var2.invalidate();
                return;
            case 2:
                l11 l11Var3 = this.f27939b;
                l11Var3.getClass();
                l11Var3.f28257f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l11Var3.invalidate();
                return;
            case 3:
                l11 l11Var4 = this.f27939b;
                l11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l11Var4.f28260s = floatValue;
                l11Var4.f28261w = (int) ((l11Var4.h * floatValue) + 0);
                l11Var4.invalidate();
                return;
            default:
                l11 l11Var5 = this.f27939b;
                l11Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l11Var5.v = floatValue2;
                int i10 = l11Var5.f28259r;
                l11Var5.f28262x = i10 + ((int) Math.ceil((l11Var5.f28258n - i10) * floatValue2));
                l11Var5.invalidate();
                return;
        }
    }
}
