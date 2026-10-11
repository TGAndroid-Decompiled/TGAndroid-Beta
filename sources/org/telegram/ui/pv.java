package org.telegram.ui;

import android.animation.ValueAnimator;
public final class pv implements ValueAnimator.AnimatorUpdateListener {
    public final int f40997a;
    public final sy f40998b;

    public pv(sy syVar, int i10) {
        this.f40997a = i10;
        this.f40998b = syVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40997a) {
            case 0:
                sy syVar = this.f40998b;
                syVar.getClass();
                syVar.w4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f40998b.A4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                sy syVar2 = this.f40998b;
                syVar2.getClass();
                syVar2.C4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
