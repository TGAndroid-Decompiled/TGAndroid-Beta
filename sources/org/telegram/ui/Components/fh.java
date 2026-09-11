package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class fh implements ValueAnimator.AnimatorUpdateListener {
    public final int f26043a;
    public final vi f26044b;

    public fh(vi viVar, int i10) {
        this.f26043a = i10;
        this.f26044b = viVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26043a) {
            case 0:
                this.f26044b.b2();
                return;
            case 1:
                this.f26044b.D0.invalidate();
                return;
            case 2:
                vi.m(this.f26044b, valueAnimator);
                return;
            case 3:
                vi viVar = this.f26044b;
                viVar.getClass();
                viVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f26044b.b2();
                return;
        }
    }
}
