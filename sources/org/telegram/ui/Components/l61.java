package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class l61 implements ValueAnimator.AnimatorUpdateListener {
    public int f30091a = 0;
    public final int f30092b;
    public final p61 f30093c;

    public l61(p61 p61Var, int i10) {
        this.f30093c = p61Var;
        this.f30092b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f30092b);
        p61 p61Var = this.f30093c;
        p61Var.N = true;
        p61Var.f31455n.scrollBy(0, floatValue - this.f30091a);
        p61Var.N = false;
        this.f30091a = floatValue;
    }
}
