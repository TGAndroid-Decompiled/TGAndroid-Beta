package org.telegram.ui;

import android.animation.ValueAnimator;
public final class i61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34374a;
    public final l61 f34375b;

    public i61(l61 l61Var, int i10) {
        this.f34374a = i10;
        this.f34375b = l61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34374a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l61 l61Var = this.f34375b;
                l61Var.N = floatValue;
                l61Var.V.f32585h0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l61 l61Var2 = this.f34375b;
                l61Var2.N = floatValue2;
                l61Var2.V.f32585h0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l61 l61Var3 = this.f34375b;
                l61Var3.N = floatValue3;
                l61Var3.V.f32585h0.invalidate();
                return;
        }
    }
}
