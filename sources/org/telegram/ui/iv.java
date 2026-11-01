package org.telegram.ui;

import android.animation.ValueAnimator;
public final class iv implements ValueAnimator.AnimatorUpdateListener {
    public final int f38193a;
    public final zx f38194b;
    public final float f38195c;

    public iv(zx zxVar, float f7, int i10) {
        this.f38193a = i10;
        this.f38194b = zxVar;
        this.f38195c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38193a) {
            case 0:
                zx.a0(this.f38194b, this.f38195c, valueAnimator);
                return;
            default:
                zx.G0(this.f38194b, this.f38195c, valueAnimator);
                return;
        }
    }
}
