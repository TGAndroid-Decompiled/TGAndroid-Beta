package org.telegram.ui;

import android.animation.ValueAnimator;
public final class o61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36237a;
    public final r61 f36238b;

    public o61(r61 r61Var, int i10) {
        this.f36237a = i10;
        this.f36238b = r61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36237a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r61 r61Var = this.f36238b;
                r61Var.N = floatValue;
                r61Var.V.f34461h0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r61 r61Var2 = this.f36238b;
                r61Var2.N = floatValue2;
                r61Var2.V.f34461h0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r61 r61Var3 = this.f36238b;
                r61Var3.N = floatValue3;
                r61Var3.V.f34461h0.invalidate();
                return;
        }
    }
}
