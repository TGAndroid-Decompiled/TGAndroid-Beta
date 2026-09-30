package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class fh implements ValueAnimator.AnimatorUpdateListener {
    public final int f24224a;
    public final wi f24225b;

    public fh(wi wiVar, int i10) {
        this.f24224a = i10;
        this.f24225b = wiVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24224a) {
            case 0:
                this.f24225b.b2();
                return;
            case 1:
                this.f24225b.D0.invalidate();
                return;
            case 2:
                wi.m(this.f24225b, valueAnimator);
                return;
            case 3:
                wi wiVar = this.f24225b;
                wiVar.getClass();
                wiVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f24225b.b2();
                return;
        }
    }
}
