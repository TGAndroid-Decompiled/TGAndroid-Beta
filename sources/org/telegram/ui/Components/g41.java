package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class g41 implements ValueAnimator.AnimatorUpdateListener {
    public int f35398a = 0;
    public final int f35399b;
    public final k41 f35400c;

    public g41(k41 k41Var, int i7) {
        this.f35400c = k41Var;
        this.f35399b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f35399b);
        k41 k41Var = this.f35400c;
        k41Var.O = true;
        k41Var.f36770n.scrollBy(0, floatValue - this.f35398a);
        k41Var.O = false;
        this.f35398a = floatValue;
    }
}
