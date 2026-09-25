package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class fh implements ValueAnimator.AnimatorUpdateListener {
    public final int f24185a;
    public final wi f24186b;

    public fh(wi wiVar, int i10) {
        this.f24185a = i10;
        this.f24186b = wiVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24185a) {
            case 0:
                this.f24186b.b2();
                return;
            case 1:
                this.f24186b.D0.invalidate();
                return;
            case 2:
                wi.m(this.f24186b, valueAnimator);
                return;
            case 3:
                wi wiVar = this.f24186b;
                wiVar.getClass();
                wiVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f24186b.b2();
                return;
        }
    }
}
