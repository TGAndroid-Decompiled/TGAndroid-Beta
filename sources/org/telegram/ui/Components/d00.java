package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class d00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26086a;
    public final j00 f26087b;

    public d00(j00 j00Var, int i10) {
        this.f26086a = i10;
        this.f26087b = j00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26086a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j00 j00Var = this.f26087b;
                j00Var.f27947x = floatValue;
                j00Var.invalidate();
                return;
            default:
                j00 j00Var2 = this.f26087b;
                j00Var2.getClass();
                j00Var2.f27948y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j00Var2.invalidate();
                return;
        }
    }
}
