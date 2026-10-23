package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class e61 implements ValueAnimator.AnimatorUpdateListener {
    public int f25899a = 0;
    public final int f25900b;
    public final i61 f25901c;

    public e61(i61 i61Var, int i10) {
        this.f25901c = i61Var;
        this.f25900b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f25900b);
        i61 i61Var = this.f25901c;
        i61Var.N = true;
        i61Var.f27223n.scrollBy(0, floatValue - this.f25899a);
        i61Var.N = false;
        this.f25899a = floatValue;
    }
}
