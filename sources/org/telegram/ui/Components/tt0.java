package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class tt0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33148a;
    public final tu0 f33149b;
    public final aw0 f33150c;

    public tt0(aw0 aw0Var, tu0 tu0Var, int i10) {
        this.f33148a = i10;
        this.f33150c = aw0Var;
        this.f33149b = tu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33148a) {
            case 0:
                this.f33150c.f26682p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f33149b.h.invalidate();
                return;
            default:
                this.f33150c.f26682p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f33149b.h.invalidate();
                return;
        }
    }
}
