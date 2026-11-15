package org.telegram.ui;

import android.animation.ValueAnimator;
public final class iu implements ValueAnimator.AnimatorUpdateListener {
    public final int f48129a;
    public final yw f48130b;
    public final float f48131c;

    public iu(yw ywVar, float f10, int i7) {
        this.f48129a = i7;
        this.f48130b = ywVar;
        this.f48131c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48129a) {
            case 0:
                yw.a0(this.f48130b, this.f48131c, valueAnimator);
                return;
            default:
                yw.G0(this.f48130b, this.f48131c, valueAnimator);
                return;
        }
    }
}
