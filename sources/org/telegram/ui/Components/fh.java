package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class fh implements ValueAnimator.AnimatorUpdateListener {
    public final int f24184a;
    public final wi f24185b;

    public fh(wi wiVar, int i10) {
        this.f24184a = i10;
        this.f24185b = wiVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24184a) {
            case 0:
                this.f24185b.b2();
                return;
            case 1:
                this.f24185b.D0.invalidate();
                return;
            case 2:
                wi.m(this.f24185b, valueAnimator);
                return;
            case 3:
                wi wiVar = this.f24185b;
                wiVar.getClass();
                wiVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f24185b.b2();
                return;
        }
    }
}
