package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ku implements ValueAnimator.AnimatorUpdateListener {
    public final int f49335a;
    public final cx f49336b;
    public final float f49337c;

    public ku(cx cxVar, float f10, int i7) {
        this.f49335a = i7;
        this.f49336b = cxVar;
        this.f49337c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49335a) {
            case 0:
                cx.o0(this.f49336b, this.f49337c, valueAnimator);
                return;
            default:
                cx.H0(this.f49336b, this.f49337c, valueAnimator);
                return;
        }
    }
}
