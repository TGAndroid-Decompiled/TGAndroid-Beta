package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class n31 implements ValueAnimator.AnimatorUpdateListener {
    public int f36156a = 0;
    public final int f36157b;
    public final s31 f36158c;

    public n31(s31 s31Var, int i7) {
        this.f36158c = s31Var;
        this.f36157b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.f36157b);
        s31 s31Var = this.f36158c;
        s31Var.N = true;
        s31Var.f37872n.scrollBy(0, floatValue - this.f36156a);
        s31Var.N = false;
        this.f36156a = floatValue;
    }
}
