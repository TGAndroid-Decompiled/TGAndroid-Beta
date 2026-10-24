package org.telegram.ui;

import android.animation.ValueAnimator;
public final class kv implements ValueAnimator.AnimatorUpdateListener {
    public final int f39053a;
    public final ey f39054b;
    public final float f39055c;

    public kv(ey eyVar, float f7, int i10) {
        this.f39053a = i10;
        this.f39054b = eyVar;
        this.f39055c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39053a) {
            case 0:
                ey.V(this.f39054b, this.f39055c, valueAnimator);
                return;
            default:
                ey.B0(this.f39054b, this.f39055c, valueAnimator);
                return;
        }
    }
}
