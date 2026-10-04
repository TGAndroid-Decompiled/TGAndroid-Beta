package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class gh implements ValueAnimator.AnimatorUpdateListener {
    public final int f26867a;
    public final xi f26868b;

    public gh(xi xiVar, int i10) {
        this.f26867a = i10;
        this.f26868b = xiVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26867a) {
            case 0:
                this.f26868b.Y1();
                return;
            case 1:
                this.f26868b.D0.invalidate();
                return;
            case 2:
                xi.q(this.f26868b, valueAnimator);
                return;
            case 3:
                xi xiVar = this.f26868b;
                xiVar.getClass();
                xiVar.H1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f26868b.Y1();
                return;
        }
    }
}
