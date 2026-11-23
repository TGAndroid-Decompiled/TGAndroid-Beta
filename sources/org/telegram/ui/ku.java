package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ku implements ValueAnimator.AnimatorUpdateListener {
    public final int f49386a;
    public final cx f49387b;
    public final float f49388c;

    public ku(cx cxVar, float f10, int i7) {
        this.f49386a = i7;
        this.f49387b = cxVar;
        this.f49388c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49386a) {
            case 0:
                cx.o0(this.f49387b, this.f49388c, valueAnimator);
                return;
            default:
                cx.H0(this.f49387b, this.f49388c, valueAnimator);
                return;
        }
    }
}
