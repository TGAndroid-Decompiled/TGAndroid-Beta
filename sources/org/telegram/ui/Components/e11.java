package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class e11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33135a;
    public final h11 f33136b;

    public e11(h11 h11Var, int i7) {
        this.f33135a = i7;
        this.f33136b = h11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33135a) {
            case 0:
                di.b3 b3Var = this.f33136b.f34148f;
                b3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                b3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                b3Var.invalidate();
                return;
            default:
                h11 h11Var = this.f33136b;
                h11Var.getClass();
                h11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h11Var.h();
                return;
        }
    }
}
