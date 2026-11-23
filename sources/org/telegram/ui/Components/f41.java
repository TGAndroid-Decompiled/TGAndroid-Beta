package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class f41 implements ValueAnimator.AnimatorUpdateListener {
    public int f34999a = 0;
    public final int f35000b;
    public final j41 f35001c;

    public f41(j41 j41Var, int i7) {
        this.f35001c = j41Var;
        this.f35000b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f35000b);
        j41 j41Var = this.f35001c;
        j41Var.O = true;
        j41Var.f36265n.scrollBy(0, floatValue - this.f34999a);
        j41Var.O = false;
        this.f34999a = floatValue;
    }
}
