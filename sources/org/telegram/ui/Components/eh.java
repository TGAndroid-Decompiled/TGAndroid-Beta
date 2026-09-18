package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class eh implements ValueAnimator.AnimatorUpdateListener {
    public final int f23879a;
    public final vi f23880b;

    public eh(vi viVar, int i10) {
        this.f23879a = i10;
        this.f23880b = viVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23879a) {
            case 0:
                this.f23880b.b2();
                return;
            case 1:
                this.f23880b.D0.invalidate();
                return;
            case 2:
                vi.m(this.f23880b, valueAnimator);
                return;
            case 3:
                vi viVar = this.f23880b;
                viVar.getClass();
                viVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f23880b.b2();
                return;
        }
    }
}
