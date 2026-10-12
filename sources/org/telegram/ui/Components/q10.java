package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class q10 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29647a;
    public final r10 f29648b;

    public q10(r10 r10Var, int i10) {
        this.f29647a = i10;
        this.f29648b = r10Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29647a) {
            case 0:
                r10 r10Var = this.f29648b;
                r10Var.getClass();
                r10Var.f29984x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r10Var.invalidate();
                return;
            case 1:
                r10 r10Var2 = this.f29648b;
                r10Var2.getClass();
                r10Var2.f29982s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                r10Var2.invalidate();
                return;
            default:
                r10 r10Var3 = this.f29648b;
                r10Var3.getClass();
                r10Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r10Var3.invalidate();
                return;
        }
    }
}
