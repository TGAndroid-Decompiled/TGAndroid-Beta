package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class g41 implements ValueAnimator.AnimatorUpdateListener {
    public int f35379a = 0;
    public final int f35380b;
    public final k41 f35381c;

    public g41(k41 k41Var, int i7) {
        this.f35381c = k41Var;
        this.f35380b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f35380b);
        k41 k41Var = this.f35381c;
        k41Var.O = true;
        k41Var.f36738n.scrollBy(0, floatValue - this.f35379a);
        k41Var.O = false;
        this.f35379a = floatValue;
    }
}
