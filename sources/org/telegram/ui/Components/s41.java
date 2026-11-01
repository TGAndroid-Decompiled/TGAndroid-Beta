package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class s41 implements ValueAnimator.AnimatorUpdateListener {
    public int f30175a = 0;
    public final int f30176b;
    public final x41 f30177c;

    public s41(x41 x41Var, int i10) {
        this.f30177c = x41Var;
        this.f30176b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f30176b);
        x41 x41Var = this.f30177c;
        x41Var.N = true;
        x41Var.f32415n.scrollBy(0, floatValue - this.f30175a);
        x41Var.N = false;
        this.f30175a = floatValue;
    }
}
