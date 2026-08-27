package org.telegram.ui;

import android.animation.ValueAnimator;

public final class nv implements ValueAnimator.AnimatorUpdateListener {

    public final int f40944a;

    public final gy f40945b;

    public final float f40946c;

    public nv(gy gyVar, float f10, int i10) {
        this.f40944a = i10;
        this.f40945b = gyVar;
        this.f40946c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40944a) {
            case 0:
                gy.V(this.f40945b, this.f40946c, valueAnimator);
                break;
            default:
                gy.E0(this.f40945b, this.f40946c, valueAnimator);
                break;
        }
    }
}
