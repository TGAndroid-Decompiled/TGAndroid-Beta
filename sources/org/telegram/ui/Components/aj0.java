package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class aj0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f24421a;
    public final mj0 f24422b;

    public aj0(mj0 mj0Var, float f7) {
        this.f24422b = mj0Var;
        this.f24421a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        mj0 mj0Var = this.f24422b;
        mj0Var.f28526o0 = floatValue;
        mj0Var.f28525n0 = (1.0f - mj0Var.f28526o0) * this.f24421a;
        mj0Var.invalidate();
    }
}
