package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class e11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33138a;
    public final h11 f33139b;

    public e11(h11 h11Var, int i7) {
        this.f33138a = i7;
        this.f33139b = h11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33138a) {
            case 0:
                di.b3 b3Var = this.f33139b.f34128f;
                b3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                b3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                b3Var.invalidate();
                return;
            default:
                h11 h11Var = this.f33139b;
                h11Var.getClass();
                h11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h11Var.h();
                return;
        }
    }
}
