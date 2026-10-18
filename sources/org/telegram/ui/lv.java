package org.telegram.ui;

import android.animation.ValueAnimator;
public final class lv implements ValueAnimator.AnimatorUpdateListener {
    public final int f38977a;
    public final ey f38978b;
    public final float f38979c;

    public lv(ey eyVar, float f7, int i10) {
        this.f38977a = i10;
        this.f38978b = eyVar;
        this.f38979c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38977a) {
            case 0:
                ey.V(this.f38978b, this.f38979c, valueAnimator);
                return;
            default:
                ey.C0(this.f38978b, this.f38979c, valueAnimator);
                return;
        }
    }
}
