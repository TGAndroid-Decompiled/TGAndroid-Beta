package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class hh implements ValueAnimator.AnimatorUpdateListener {
    public final int f23629a;
    public final yi f23630b;

    public hh(yi yiVar, int i10) {
        this.f23629a = i10;
        this.f23630b = yiVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23629a) {
            case 0:
                this.f23630b.b2();
                return;
            case 1:
                this.f23630b.D0.invalidate();
                return;
            case 2:
                yi.m(this.f23630b, valueAnimator);
                return;
            case 3:
                yi yiVar = this.f23630b;
                yiVar.getClass();
                yiVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f23630b.b2();
                return;
        }
    }
}
