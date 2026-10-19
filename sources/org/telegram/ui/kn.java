package org.telegram.ui;

import android.animation.ValueAnimator;
public final class kn implements ValueAnimator.AnimatorUpdateListener {
    public final int f38633a;
    public final org.telegram.ui.Components.wc0 f38634b;

    public kn(org.telegram.ui.Components.wc0 wc0Var, int i10) {
        this.f38633a = i10;
        this.f38634b = wc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38633a) {
            case 0:
                this.f38634b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f38634b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f38634b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
