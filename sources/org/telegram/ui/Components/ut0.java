package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ut0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33459a;
    public final uu0 f33460b;
    public final bw0 f33461c;

    public ut0(bw0 bw0Var, uu0 uu0Var, int i10) {
        this.f33459a = i10;
        this.f33461c = bw0Var;
        this.f33460b = uu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33459a) {
            case 0:
                this.f33461c.f26972p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f33460b.h.invalidate();
                return;
            default:
                this.f33461c.f26972p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f33460b.h.invalidate();
                return;
        }
    }
}
