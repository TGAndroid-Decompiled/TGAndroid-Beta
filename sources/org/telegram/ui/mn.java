package org.telegram.ui;

import android.animation.ValueAnimator;
public final class mn implements ValueAnimator.AnimatorUpdateListener {
    public final int f39630a;
    public final org.telegram.ui.Components.yc0 f39631b;

    public mn(org.telegram.ui.Components.yc0 yc0Var, int i10) {
        this.f39630a = i10;
        this.f39631b = yc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39630a) {
            case 0:
                this.f39631b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f39631b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f39631b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
