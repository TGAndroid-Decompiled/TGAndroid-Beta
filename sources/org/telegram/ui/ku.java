package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ku implements ValueAnimator.AnimatorUpdateListener {
    public final int f49528a;
    public final bx f49529b;

    public ku(bx bxVar, int i7) {
        this.f49528a = i7;
        this.f49529b = bxVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49528a) {
            case 0:
                this.f49529b.X4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                bx bxVar = this.f49529b;
                bxVar.getClass();
                bxVar.Z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                bx bxVar2 = this.f49529b;
                bxVar2.getClass();
                bxVar2.T4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
