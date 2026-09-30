package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class e00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23812a;
    public final l00 f23813b;

    public e00(l00 l00Var, int i10) {
        this.f23812a = i10;
        this.f23813b = l00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23812a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l00 l00Var = this.f23813b;
                l00Var.f25864x = floatValue;
                l00Var.invalidate();
                return;
            default:
                l00 l00Var2 = this.f23813b;
                l00Var2.getClass();
                l00Var2.f25865y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l00Var2.invalidate();
                return;
        }
    }
}
