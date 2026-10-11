package org.telegram.ui;

import android.animation.ValueAnimator;
public final class pv implements ValueAnimator.AnimatorUpdateListener {
    public final int f40963a;
    public final sy f40964b;

    public pv(sy syVar, int i10) {
        this.f40963a = i10;
        this.f40964b = syVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40963a) {
            case 0:
                sy syVar = this.f40964b;
                syVar.getClass();
                syVar.w4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f40964b.A4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                sy syVar2 = this.f40964b;
                syVar2.getClass();
                syVar2.C4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
