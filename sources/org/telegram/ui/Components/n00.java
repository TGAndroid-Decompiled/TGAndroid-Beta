package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class n00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27253a;
    public final u00 f27254b;

    public n00(u00 u00Var, int i10) {
        this.f27253a = i10;
        this.f27254b = u00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27253a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u00 u00Var = this.f27254b;
                u00Var.f29231x = floatValue;
                u00Var.invalidate();
                return;
            default:
                u00 u00Var2 = this.f27254b;
                u00Var2.getClass();
                u00Var2.f29232y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u00Var2.invalidate();
                return;
        }
    }
}
