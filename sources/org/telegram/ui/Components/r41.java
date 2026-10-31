package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class r41 implements ValueAnimator.AnimatorUpdateListener {
    public int f29830a = 0;
    public final int f29831b;
    public final w41 f29832c;

    public r41(w41 w41Var, int i10) {
        this.f29832c = w41Var;
        this.f29831b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f29831b);
        w41 w41Var = this.f29832c;
        w41Var.N = true;
        w41Var.f31999n.scrollBy(0, floatValue - this.f29830a);
        w41Var.N = false;
        this.f29830a = floatValue;
    }
}
