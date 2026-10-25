package org.telegram.ui;

import android.animation.ValueAnimator;
public final class i51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40148a;
    public final l51 f40149b;

    public i51(l51 l51Var, int i10) {
        this.f40148a = i10;
        this.f40149b = l51Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40148a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l51 l51Var = this.f40149b;
                l51Var.N = floatValue;
                l51Var.V.f38296h0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l51 l51Var2 = this.f40149b;
                l51Var2.N = floatValue2;
                l51Var2.V.f38296h0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l51 l51Var3 = this.f40149b;
                l51Var3.N = floatValue3;
                l51Var3.V.f38296h0.invalidate();
                return;
        }
    }
}
