package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class uq0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40146a;
    public final tr0 f40147b;
    public final ys0 f40148c;

    public uq0(ys0 ys0Var, tr0 tr0Var, int i7) {
        this.f40146a = i7;
        this.f40148c = ys0Var;
        this.f40147b = tr0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40146a) {
            case 0:
                this.f40148c.f42126q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f40147b.h.invalidate();
                return;
            default:
                this.f40148c.f42126q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f40147b.h.invalidate();
                return;
        }
    }
}
