package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class tk0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f33094a;
    public final fl0 f33095b;

    public tk0(fl0 fl0Var, float f7) {
        this.f33095b = fl0Var;
        this.f33094a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fl0 fl0Var = this.f33095b;
        fl0Var.f28255o0 = floatValue;
        fl0Var.f28254n0 = (1.0f - fl0Var.f28255o0) * this.f33094a;
        fl0Var.invalidate();
    }
}
