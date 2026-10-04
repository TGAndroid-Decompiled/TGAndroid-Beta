package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class a10 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24420a;
    public final b10 f24421b;

    public a10(b10 b10Var, int i10) {
        this.f24420a = i10;
        this.f24421b = b10Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24420a) {
            case 0:
                b10 b10Var = this.f24421b;
                b10Var.getClass();
                b10Var.f24757x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b10Var.invalidate();
                return;
            case 1:
                b10 b10Var2 = this.f24421b;
                b10Var2.getClass();
                b10Var2.f24755s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                b10Var2.invalidate();
                return;
            default:
                b10 b10Var3 = this.f24421b;
                b10Var3.getClass();
                b10Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b10Var3.invalidate();
                return;
        }
    }
}
