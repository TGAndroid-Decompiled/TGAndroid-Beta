package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class z00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30778a;
    public final a10 f30779b;

    public z00(a10 a10Var, int i10) {
        this.f30778a = i10;
        this.f30779b = a10Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30778a) {
            case 0:
                a10 a10Var = this.f30779b;
                a10Var.getClass();
                a10Var.f22501x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a10Var.invalidate();
                return;
            case 1:
                a10 a10Var2 = this.f30779b;
                a10Var2.getClass();
                a10Var2.f22499s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                a10Var2.invalidate();
                return;
            default:
                a10 a10Var3 = this.f30779b;
                a10Var3.getClass();
                a10Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a10Var3.invalidate();
                return;
        }
    }
}
