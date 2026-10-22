package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class rk0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f29948a;
    public final dl0 f29949b;

    public rk0(dl0 dl0Var, float f7) {
        this.f29949b = dl0Var;
        this.f29948a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dl0 dl0Var = this.f29949b;
        dl0Var.f25553o0 = floatValue;
        dl0Var.f25552n0 = (1.0f - dl0Var.f25553o0) * this.f29948a;
        dl0Var.invalidate();
    }
}
