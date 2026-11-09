package org.telegram.ui;

import android.animation.ValueAnimator;
public final class iu implements ValueAnimator.AnimatorUpdateListener {
    public final int f46756a;
    public final yw f46757b;
    public final float f46758c;

    public iu(yw ywVar, float f10, int i7) {
        this.f46756a = i7;
        this.f46757b = ywVar;
        this.f46758c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46756a) {
            case 0:
                yw.a0(this.f46757b, this.f46758c, valueAnimator);
                return;
            default:
                yw.G0(this.f46757b, this.f46758c, valueAnimator);
                return;
        }
    }
}
