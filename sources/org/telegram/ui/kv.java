package org.telegram.ui;

import android.animation.ValueAnimator;
public final class kv implements ValueAnimator.AnimatorUpdateListener {
    public final int f39931a;
    public final dy f39932b;
    public final float f39933c;

    public kv(dy dyVar, float f10, int i9) {
        this.f39931a = i9;
        this.f39932b = dyVar;
        this.f39933c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39931a) {
            case 0:
                dy.U(this.f39932b, this.f39933c, valueAnimator);
                return;
            default:
                dy.D0(this.f39932b, this.f39933c, valueAnimator);
                return;
        }
    }
}
