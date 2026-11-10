package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ju implements ValueAnimator.AnimatorUpdateListener {
    public final int f47075a;
    public final zw f47076b;
    public final float f47077c;

    public ju(zw zwVar, float f10, int i7) {
        this.f47075a = i7;
        this.f47076b = zwVar;
        this.f47077c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47075a) {
            case 0:
                zw.a0(this.f47076b, this.f47077c, valueAnimator);
                return;
            default:
                zw.G0(this.f47076b, this.f47077c, valueAnimator);
                return;
        }
    }
}
