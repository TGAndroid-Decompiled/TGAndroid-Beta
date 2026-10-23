package org.telegram.ui;

import android.animation.ValueAnimator;
public final class kv implements ValueAnimator.AnimatorUpdateListener {
    public final int f39075a;
    public final ey f39076b;
    public final float f39077c;

    public kv(ey eyVar, float f7, int i10) {
        this.f39075a = i10;
        this.f39076b = eyVar;
        this.f39077c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39075a) {
            case 0:
                ey.V(this.f39076b, this.f39077c, valueAnimator);
                return;
            default:
                ey.B0(this.f39076b, this.f39077c, valueAnimator);
                return;
        }
    }
}
