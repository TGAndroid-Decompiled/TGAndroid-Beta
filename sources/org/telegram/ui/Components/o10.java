package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class o10 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29303a;
    public final p10 f29304b;

    public o10(p10 p10Var, int i10) {
        this.f29303a = i10;
        this.f29304b = p10Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29303a) {
            case 0:
                p10 p10Var = this.f29304b;
                p10Var.getClass();
                p10Var.f29654x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p10Var.invalidate();
                return;
            case 1:
                p10 p10Var2 = this.f29304b;
                p10Var2.getClass();
                p10Var2.f29652s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                p10Var2.invalidate();
                return;
            default:
                p10 p10Var3 = this.f29304b;
                p10Var3.getClass();
                p10Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p10Var3.invalidate();
                return;
        }
    }
}
