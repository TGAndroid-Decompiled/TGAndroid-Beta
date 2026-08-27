package org.telegram.ui;

import android.animation.ValueAnimator;

public final class ln implements ValueAnimator.AnimatorUpdateListener {

    public final int f40160a;

    public final org.telegram.ui.Components.nb0 f40161b;

    public ln(org.telegram.ui.Components.nb0 nb0Var, int i10) {
        this.f40160a = i10;
        this.f40161b = nb0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40160a) {
            case 0:
                this.f40161b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.f40161b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                this.f40161b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
