package org.telegram.ui;

import android.animation.ValueAnimator;

public final class iv implements ValueAnimator.AnimatorUpdateListener {

    public final int f39166a;

    public final gy f39167b;

    public iv(gy gyVar, int i10) {
        this.f39166a = i10;
        this.f39167b = gyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39166a) {
            case 0:
                gy gyVar = this.f39167b;
                gyVar.getClass();
                gyVar.z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.f39167b.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                gy gyVar2 = this.f39167b;
                gyVar2.getClass();
                gyVar2.F4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
