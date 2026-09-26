package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class z00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30747a;
    public final a10 f30748b;

    public z00(a10 a10Var, int i10) {
        this.f30747a = i10;
        this.f30748b = a10Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30747a) {
            case 0:
                a10 a10Var = this.f30748b;
                a10Var.getClass();
                a10Var.f22500x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a10Var.invalidate();
                return;
            case 1:
                a10 a10Var2 = this.f30748b;
                a10Var2.getClass();
                a10Var2.f22498s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                a10Var2.invalidate();
                return;
            default:
                a10 a10Var3 = this.f30748b;
                a10Var3.getClass();
                a10Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a10Var3.invalidate();
                return;
        }
    }
}
