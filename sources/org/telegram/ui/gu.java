package org.telegram.ui;

import android.animation.ValueAnimator;
public final class gu implements ValueAnimator.AnimatorUpdateListener {
    public final int f46092a;
    public final ww f46093b;
    public final float f46094c;

    public gu(ww wwVar, float f10, int i7) {
        this.f46092a = i7;
        this.f46093b = wwVar;
        this.f46094c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46092a) {
            case 0:
                ww.a0(this.f46093b, this.f46094c, valueAnimator);
                return;
            default:
                ww.G0(this.f46093b, this.f46094c, valueAnimator);
                return;
        }
    }
}
