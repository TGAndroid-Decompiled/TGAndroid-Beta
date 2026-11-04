package org.telegram.ui;

import android.animation.ValueAnimator;
public final class eu implements ValueAnimator.AnimatorUpdateListener {
    public final int f45047a;
    public final uw f45048b;
    public final float f45049c;

    public eu(uw uwVar, float f10, int i3) {
        this.f45047a = i3;
        this.f45048b = uwVar;
        this.f45049c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45047a) {
            case 0:
                uw.a0(this.f45048b, this.f45049c, valueAnimator);
                return;
            default:
                uw.G0(this.f45048b, this.f45049c, valueAnimator);
                return;
        }
    }
}
