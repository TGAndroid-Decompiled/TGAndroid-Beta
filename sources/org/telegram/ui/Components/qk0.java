package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class qk0 implements ValueAnimator.AnimatorUpdateListener {
    public final float f29710a;
    public final cl0 f29711b;

    public qk0(cl0 cl0Var, float f7) {
        this.f29711b = cl0Var;
        this.f29710a = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cl0 cl0Var = this.f29711b;
        cl0Var.f25292o0 = floatValue;
        cl0Var.f25291n0 = (1.0f - cl0Var.f25292o0) * this.f29710a;
        cl0Var.invalidate();
    }
}
