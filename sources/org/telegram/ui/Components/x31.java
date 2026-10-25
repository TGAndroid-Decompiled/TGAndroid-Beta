package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class x31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34607a;
    public final z31 f34608b;

    public x31(z31 z31Var, int i10) {
        this.f34607a = i10;
        this.f34608b = z31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34607a) {
            case 0:
                di.h3 h3Var = this.f34608b.f35198f;
                h3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                h3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                h3Var.invalidate();
                return;
            default:
                z31 z31Var = this.f34608b;
                z31Var.getClass();
                z31Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z31Var.h();
                return;
        }
    }
}
