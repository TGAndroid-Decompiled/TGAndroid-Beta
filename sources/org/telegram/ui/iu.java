package org.telegram.ui;

import android.animation.ValueAnimator;
public final class iu implements ValueAnimator.AnimatorUpdateListener {
    public final int f48114a;
    public final yw f48115b;
    public final float f48116c;

    public iu(yw ywVar, float f10, int i7) {
        this.f48114a = i7;
        this.f48115b = ywVar;
        this.f48116c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48114a) {
            case 0:
                yw.a0(this.f48115b, this.f48116c, valueAnimator);
                return;
            default:
                yw.G0(this.f48115b, this.f48116c, valueAnimator);
                return;
        }
    }
}
