package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class fh implements ValueAnimator.AnimatorUpdateListener {
    public final int f26070a;
    public final vi f26071b;

    public fh(vi viVar, int i10) {
        this.f26070a = i10;
        this.f26071b = viVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26070a) {
            case 0:
                this.f26071b.b2();
                return;
            case 1:
                this.f26071b.D0.invalidate();
                return;
            case 2:
                vi.m(this.f26071b, valueAnimator);
                return;
            case 3:
                vi viVar = this.f26071b;
                viVar.getClass();
                viVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f26071b.b2();
                return;
        }
    }
}
