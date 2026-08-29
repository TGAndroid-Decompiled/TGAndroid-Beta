package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class wz implements ValueAnimator.AnimatorUpdateListener {
    public final int f34517a;
    public final d00 f34518b;

    public wz(d00 d00Var, int i10) {
        this.f34517a = i10;
        this.f34518b = d00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34517a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d00 d00Var = this.f34518b;
                d00Var.f27624x = floatValue;
                d00Var.invalidate();
                return;
            default:
                d00 d00Var2 = this.f34518b;
                d00Var2.getClass();
                d00Var2.f27625y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d00Var2.invalidate();
                return;
        }
    }
}
