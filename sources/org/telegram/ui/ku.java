package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ku implements ValueAnimator.AnimatorUpdateListener {
    public final int f49357a;
    public final cx f49358b;
    public final float f49359c;

    public ku(cx cxVar, float f10, int i7) {
        this.f49357a = i7;
        this.f49358b = cxVar;
        this.f49359c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49357a) {
            case 0:
                cx.o0(this.f49358b, this.f49359c, valueAnimator);
                return;
            default:
                cx.H0(this.f49358b, this.f49359c, valueAnimator);
                return;
        }
    }
}
