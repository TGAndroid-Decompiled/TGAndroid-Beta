package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ov implements ValueAnimator.AnimatorUpdateListener {
    public final int f35959a;
    public final ry f35960b;

    public ov(ry ryVar, int i10) {
        this.f35959a = i10;
        this.f35960b = ryVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35959a) {
            case 0:
                ry ryVar = this.f35960b;
                ryVar.getClass();
                ryVar.z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f35960b.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ry ryVar2 = this.f35960b;
                ryVar2.getClass();
                ryVar2.F4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
