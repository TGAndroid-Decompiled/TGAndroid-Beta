package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ws0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28834a;
    public final au0 f28835b;
    public final iv0 f28836c;

    public ws0(iv0 iv0Var, au0 au0Var, int i10) {
        this.f28834a = i10;
        this.f28836c = iv0Var;
        this.f28835b = au0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28834a) {
            case 0:
                this.f28836c.f24113n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f28835b.h.invalidate();
                return;
            default:
                this.f28836c.f24113n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f28835b.h.invalidate();
                return;
        }
    }
}
