package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class tj0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f28141a;
    public final fk0 f28142b;

    public tj0(fk0 fk0Var, float f7) {
        this.f28142b = fk0Var;
        this.f28141a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fk0 fk0Var = this.f28142b;
        fk0Var.f23993o0 = floatValue;
        fk0Var.f23992n0 = (1.0f - fk0Var.f23993o0) * this.f28141a;
        fk0Var.invalidate();
    }
}
