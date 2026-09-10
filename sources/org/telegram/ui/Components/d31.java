package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class d31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22283a;
    public final f31 f22284b;

    public d31(f31 f31Var, int i10) {
        this.f22283a = i10;
        this.f22284b = f31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22283a) {
            case 0:
                org.telegram.ui.u7 u7Var = this.f22284b.f22838f;
                u7Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                u7Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                u7Var.invalidate();
                return;
            default:
                f31 f31Var = this.f22284b;
                f31Var.getClass();
                f31Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f31Var.h();
                return;
        }
    }
}
