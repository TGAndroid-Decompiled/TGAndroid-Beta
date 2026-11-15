package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class t31 implements ValueAnimator.AnimatorUpdateListener {
    public int f39504a = 0;
    public final int f39505b;
    public final x31 f39506c;

    public t31(x31 x31Var, int i7) {
        this.f39506c = x31Var;
        this.f39505b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f39505b);
        x31 x31Var = this.f39506c;
        x31Var.O = true;
        x31Var.f41549n.scrollBy(0, floatValue - this.f39504a);
        x31Var.O = false;
        this.f39504a = floatValue;
    }
}
