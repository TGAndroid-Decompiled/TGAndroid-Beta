package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ku implements ValueAnimator.AnimatorUpdateListener {
    public final int f49341a;
    public final cx f49342b;
    public final float f49343c;

    public ku(cx cxVar, float f10, int i7) {
        this.f49341a = i7;
        this.f49342b = cxVar;
        this.f49343c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49341a) {
            case 0:
                cx.o0(this.f49342b, this.f49343c, valueAnimator);
                return;
            default:
                cx.H0(this.f49342b, this.f49343c, valueAnimator);
                return;
        }
    }
}
