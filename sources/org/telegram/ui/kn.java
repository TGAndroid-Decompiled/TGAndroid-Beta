package org.telegram.ui;

import android.animation.ValueAnimator;
public final class kn implements ValueAnimator.AnimatorUpdateListener {
    public final int f38643a;
    public final org.telegram.ui.Components.wc0 f38644b;

    public kn(org.telegram.ui.Components.wc0 wc0Var, int i10) {
        this.f38643a = i10;
        this.f38644b = wc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38643a) {
            case 0:
                this.f38644b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f38644b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f38644b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
