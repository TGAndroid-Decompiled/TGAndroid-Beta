package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class g41 implements ValueAnimator.AnimatorUpdateListener {
    public int f35417a = 0;
    public final int f35418b;
    public final k41 f35419c;

    public g41(k41 k41Var, int i7) {
        this.f35419c = k41Var;
        this.f35418b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f35418b);
        k41 k41Var = this.f35419c;
        k41Var.O = true;
        k41Var.f36772n.scrollBy(0, floatValue - this.f35417a);
        k41Var.O = false;
        this.f35417a = floatValue;
    }
}
