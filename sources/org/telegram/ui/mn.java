package org.telegram.ui;

import android.animation.ValueAnimator;
public final class mn implements ValueAnimator.AnimatorUpdateListener {
    public final int f39625a;
    public final org.telegram.ui.Components.wc0 f39626b;

    public mn(org.telegram.ui.Components.wc0 wc0Var, int i10) {
        this.f39625a = i10;
        this.f39626b = wc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39625a) {
            case 0:
                this.f39626b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f39626b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f39626b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
