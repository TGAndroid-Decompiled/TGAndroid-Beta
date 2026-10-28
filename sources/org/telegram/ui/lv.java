package org.telegram.ui;

import android.animation.ValueAnimator;
public final class lv implements ValueAnimator.AnimatorUpdateListener {
    public final int f41267a;
    public final ey f41268b;
    public final float f41269c;

    public lv(ey eyVar, float f7, int i10) {
        this.f41267a = i10;
        this.f41268b = eyVar;
        this.f41269c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41267a) {
            case 0:
                ey.W(this.f41268b, this.f41269c, valueAnimator);
                return;
            default:
                ey.D0(this.f41268b, this.f41269c, valueAnimator);
                return;
        }
    }
}
