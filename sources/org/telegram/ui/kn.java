package org.telegram.ui;

import android.animation.ValueAnimator;
public final class kn implements ValueAnimator.AnimatorUpdateListener {
    public final int f38644a;
    public final org.telegram.ui.Components.wc0 f38645b;

    public kn(org.telegram.ui.Components.wc0 wc0Var, int i10) {
        this.f38644a = i10;
        this.f38645b = wc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38644a) {
            case 0:
                this.f38645b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f38645b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f38645b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
