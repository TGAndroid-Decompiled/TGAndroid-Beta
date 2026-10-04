package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class e00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25868a;
    public final l00 f25869b;

    public e00(l00 l00Var, int i10) {
        this.f25868a = i10;
        this.f25869b = l00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25868a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l00 l00Var = this.f25869b;
                l00Var.f28237x = floatValue;
                l00Var.invalidate();
                return;
            default:
                l00 l00Var2 = this.f25869b;
                l00Var2.getClass();
                l00Var2.f28238y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l00Var2.invalidate();
                return;
        }
    }
}
