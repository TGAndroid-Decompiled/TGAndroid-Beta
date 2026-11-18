package org.telegram.ui;

import android.animation.ValueAnimator;
public final class lu implements ValueAnimator.AnimatorUpdateListener {
    public final int f49695a;
    public final cx f49696b;

    public lu(cx cxVar, int i7) {
        this.f49695a = i7;
        this.f49696b = cxVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49695a) {
            case 0:
                this.f49696b.X4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                cx cxVar = this.f49696b;
                cxVar.getClass();
                cxVar.Z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                cx cxVar2 = this.f49696b;
                cxVar2.getClass();
                cxVar2.T4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
