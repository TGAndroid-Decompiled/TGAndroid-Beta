package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ju implements ValueAnimator.AnimatorUpdateListener {
    public final int f49206a;
    public final bx f49207b;
    public final float f49208c;

    public ju(bx bxVar, float f10, int i7) {
        this.f49206a = i7;
        this.f49207b = bxVar;
        this.f49208c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49206a) {
            case 0:
                bx.o0(this.f49207b, this.f49208c, valueAnimator);
                return;
            default:
                bx.H0(this.f49207b, this.f49208c, valueAnimator);
                return;
        }
    }
}
