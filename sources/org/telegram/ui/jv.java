package org.telegram.ui;

import android.animation.ValueAnimator;
public final class jv implements ValueAnimator.AnimatorUpdateListener {
    public final int f38610a;
    public final ay f38611b;
    public final float f38612c;

    public jv(ay ayVar, float f7, int i10) {
        this.f38610a = i10;
        this.f38611b = ayVar;
        this.f38612c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38610a) {
            case 0:
                ay.Z(this.f38611b, this.f38612c, valueAnimator);
                return;
            default:
                ay.F0(this.f38611b, this.f38612c, valueAnimator);
                return;
        }
    }
}
