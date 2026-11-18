package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class d41 implements ValueAnimator.AnimatorUpdateListener {
    public int f34275a = 0;
    public final int f34276b;
    public final h41 f34277c;

    public d41(h41 h41Var, int i7) {
        this.f34277c = h41Var;
        this.f34276b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f34276b);
        h41 h41Var = this.f34277c;
        h41Var.O = true;
        h41Var.f35719n.scrollBy(0, floatValue - this.f34275a);
        h41Var.O = false;
        this.f34275a = floatValue;
    }
}
