package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class dh implements ValueAnimator.AnimatorUpdateListener {
    public final int f23322a;
    public final vi f23323b;

    public dh(vi viVar, int i10) {
        this.f23322a = i10;
        this.f23323b = viVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23322a) {
            case 0:
                this.f23323b.b2();
                return;
            case 1:
                this.f23323b.D0.invalidate();
                return;
            case 2:
                vi.m(this.f23323b, valueAnimator);
                return;
            case 3:
                vi viVar = this.f23323b;
                viVar.getClass();
                viVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f23323b.b2();
                return;
        }
    }
}
