package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class cr0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34167a;
    public final bs0 f34168b;
    public final gt0 f34169c;

    public cr0(gt0 gt0Var, bs0 bs0Var, int i7) {
        this.f34167a = i7;
        this.f34169c = gt0Var;
        this.f34168b = bs0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34167a) {
            case 0:
                this.f34169c.f35618q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f34168b.h.invalidate();
                return;
            default:
                this.f34169c.f35618q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f34168b.h.invalidate();
                return;
        }
    }
}
