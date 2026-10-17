package org.telegram.ui;

import android.animation.ValueAnimator;
public final class kv implements ValueAnimator.AnimatorUpdateListener {
    public final int f38685a;
    public final ey f38686b;
    public final float f38687c;

    public kv(ey eyVar, float f7, int i10) {
        this.f38685a = i10;
        this.f38686b = eyVar;
        this.f38687c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38685a) {
            case 0:
                ey.V(this.f38686b, this.f38687c, valueAnimator);
                return;
            default:
                ey.C0(this.f38686b, this.f38687c, valueAnimator);
                return;
        }
    }
}
