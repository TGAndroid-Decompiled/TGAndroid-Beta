package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ku implements ValueAnimator.AnimatorUpdateListener {
    public final int f49382a;
    public final cx f49383b;
    public final float f49384c;

    public ku(cx cxVar, float f10, int i7) {
        this.f49382a = i7;
        this.f49383b = cxVar;
        this.f49384c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49382a) {
            case 0:
                cx.o0(this.f49383b, this.f49384c, valueAnimator);
                return;
            default:
                cx.H0(this.f49383b, this.f49384c, valueAnimator);
                return;
        }
    }
}
