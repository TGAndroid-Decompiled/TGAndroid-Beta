package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class l01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28023a;
    public final m01 f28024b;

    public l01(m01 m01Var, int i10) {
        this.f28023a = i10;
        this.f28024b = m01Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28023a) {
            case 0:
                m01 m01Var = this.f28024b;
                m01Var.getClass();
                m01Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m01Var.invalidate();
                return;
            case 1:
                m01 m01Var2 = this.f28024b;
                m01Var2.getClass();
                m01Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m01Var2.invalidate();
                return;
            case 2:
                m01 m01Var3 = this.f28024b;
                m01Var3.getClass();
                m01Var3.f28334f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m01Var3.invalidate();
                return;
            case 3:
                m01 m01Var4 = this.f28024b;
                m01Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m01Var4.f28337s = floatValue;
                m01Var4.f28338w = (int) ((m01Var4.h * floatValue) + 0);
                m01Var4.invalidate();
                return;
            default:
                m01 m01Var5 = this.f28024b;
                m01Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m01Var5.v = floatValue2;
                int i10 = m01Var5.f28336r;
                m01Var5.f28339x = i10 + ((int) Math.ceil((m01Var5.f28335n - i10) * floatValue2));
                m01Var5.invalidate();
                return;
        }
    }
}
