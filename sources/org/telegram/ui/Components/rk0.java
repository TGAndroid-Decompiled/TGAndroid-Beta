package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class rk0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f29945a;
    public final dl0 f29946b;

    public rk0(dl0 dl0Var, float f7) {
        this.f29946b = dl0Var;
        this.f29945a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dl0 dl0Var = this.f29946b;
        dl0Var.f25550o0 = floatValue;
        dl0Var.f25549n0 = (1.0f - dl0Var.f25550o0) * this.f29945a;
        dl0Var.invalidate();
    }
}
