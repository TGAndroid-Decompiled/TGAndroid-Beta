package org.telegram.ui;

import android.animation.ValueAnimator;
public final class lv implements ValueAnimator.AnimatorUpdateListener {
    public final int f40312a;
    public final fy f40313b;
    public final float f40314c;

    public lv(fy fyVar, float f9, int i10) {
        this.f40312a = i10;
        this.f40313b = fyVar;
        this.f40314c = f9;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40312a) {
            case 0:
                fy.V(this.f40313b, this.f40314c, valueAnimator);
                return;
            default:
                fy.E0(this.f40313b, this.f40314c, valueAnimator);
                return;
        }
    }
}
