package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class eh implements ValueAnimator.AnimatorUpdateListener {
    public final int f23684a;
    public final wi f23685b;

    public eh(wi wiVar, int i10) {
        this.f23684a = i10;
        this.f23685b = wiVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23684a) {
            case 0:
                this.f23685b.b2();
                return;
            case 1:
                this.f23685b.D0.invalidate();
                return;
            case 2:
                wi.m(this.f23685b, valueAnimator);
                return;
            case 3:
                wi wiVar = this.f23685b;
                wiVar.getClass();
                wiVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f23685b.b2();
                return;
        }
    }
}
