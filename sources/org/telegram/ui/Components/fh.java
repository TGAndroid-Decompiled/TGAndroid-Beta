package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class fh implements ValueAnimator.AnimatorUpdateListener {
    public final int f24244a;
    public final wi f24245b;

    public fh(wi wiVar, int i10) {
        this.f24244a = i10;
        this.f24245b = wiVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24244a) {
            case 0:
                this.f24245b.b2();
                return;
            case 1:
                this.f24245b.D0.invalidate();
                return;
            case 2:
                wi.m(this.f24245b, valueAnimator);
                return;
            case 3:
                wi wiVar = this.f24245b;
                wiVar.getClass();
                wiVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f24245b.b2();
                return;
        }
    }
}
