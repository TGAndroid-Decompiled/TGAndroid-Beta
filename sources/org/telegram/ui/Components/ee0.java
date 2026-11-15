package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ee0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34281a;
    public final ge0 f34282b;

    public ee0(ge0 ge0Var, int i7) {
        this.f34281a = i7;
        this.f34282b = ge0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34281a) {
            case 0:
                ge0 ge0Var = this.f34282b;
                ge0Var.getClass();
                ge0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ge0Var.invalidate();
                return;
            default:
                ge0 ge0Var2 = this.f34282b;
                ge0Var2.getClass();
                ge0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ge0Var2.invalidate();
                return;
        }
    }
}
