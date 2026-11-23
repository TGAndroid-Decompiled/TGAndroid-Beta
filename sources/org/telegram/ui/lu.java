package org.telegram.ui;

import android.animation.ValueAnimator;
public final class lu implements ValueAnimator.AnimatorUpdateListener {
    public final int f49676a;
    public final cx f49677b;

    public lu(cx cxVar, int i7) {
        this.f49676a = i7;
        this.f49677b = cxVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49676a) {
            case 0:
                this.f49677b.X4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                cx cxVar = this.f49677b;
                cxVar.getClass();
                cxVar.Z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                cx cxVar2 = this.f49677b;
                cxVar2.getClass();
                cxVar2.T4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
