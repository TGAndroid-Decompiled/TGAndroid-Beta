package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class t31 implements ValueAnimator.AnimatorUpdateListener {
    public int f39502a = 0;
    public final int f39503b;
    public final x31 f39504c;

    public t31(x31 x31Var, int i7) {
        this.f39504c = x31Var;
        this.f39503b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f39503b);
        x31 x31Var = this.f39504c;
        x31Var.O = true;
        x31Var.f41552n.scrollBy(0, floatValue - this.f39502a);
        x31Var.O = false;
        this.f39502a = floatValue;
    }
}
