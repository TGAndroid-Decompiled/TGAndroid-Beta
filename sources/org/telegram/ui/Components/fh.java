package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class fh implements ValueAnimator.AnimatorUpdateListener {
    public final int f24168a;
    public final wi f24169b;

    public fh(wi wiVar, int i10) {
        this.f24168a = i10;
        this.f24169b = wiVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24168a) {
            case 0:
                this.f24169b.b2();
                return;
            case 1:
                this.f24169b.D0.invalidate();
                return;
            case 2:
                wi.m(this.f24169b, valueAnimator);
                return;
            case 3:
                wi wiVar = this.f24169b;
                wiVar.getClass();
                wiVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f24169b.b2();
                return;
        }
    }
}
