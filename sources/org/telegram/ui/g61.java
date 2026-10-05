package org.telegram.ui;

import android.animation.ValueAnimator;
public final class g61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36531a;
    public final j61 f36532b;

    public g61(j61 j61Var, int i10) {
        this.f36531a = i10;
        this.f36532b = j61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36531a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j61 j61Var = this.f36532b;
                j61Var.N = floatValue;
                j61Var.V.f34739h0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j61 j61Var2 = this.f36532b;
                j61Var2.N = floatValue2;
                j61Var2.V.f34739h0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j61 j61Var3 = this.f36532b;
                j61Var3.N = floatValue3;
                j61Var3.V.f34739h0.invalidate();
                return;
        }
    }
}
