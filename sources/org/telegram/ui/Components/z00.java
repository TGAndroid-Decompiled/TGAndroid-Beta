package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class z00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30812a;
    public final a10 f30813b;

    public z00(a10 a10Var, int i10) {
        this.f30812a = i10;
        this.f30813b = a10Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30812a) {
            case 0:
                a10 a10Var = this.f30813b;
                a10Var.getClass();
                a10Var.f22502x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a10Var.invalidate();
                return;
            case 1:
                a10 a10Var2 = this.f30813b;
                a10Var2.getClass();
                a10Var2.f22500s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                a10Var2.invalidate();
                return;
            default:
                a10 a10Var3 = this.f30813b;
                a10Var3.getClass();
                a10Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a10Var3.invalidate();
                return;
        }
    }
}
