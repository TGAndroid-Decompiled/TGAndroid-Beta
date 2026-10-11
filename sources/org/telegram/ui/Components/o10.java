package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class o10 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29345a;
    public final p10 f29346b;

    public o10(p10 p10Var, int i10) {
        this.f29345a = i10;
        this.f29346b = p10Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29345a) {
            case 0:
                p10 p10Var = this.f29346b;
                p10Var.getClass();
                p10Var.f29686x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p10Var.invalidate();
                return;
            case 1:
                p10 p10Var2 = this.f29346b;
                p10Var2.getClass();
                p10Var2.f29684s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                p10Var2.invalidate();
                return;
            default:
                p10 p10Var3 = this.f29346b;
                p10Var3.getClass();
                p10Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p10Var3.invalidate();
                return;
        }
    }
}
