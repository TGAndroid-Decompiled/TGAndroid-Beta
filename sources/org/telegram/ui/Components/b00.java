package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class b00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23529a;
    public final h00 f23530b;

    public b00(h00 h00Var, int i10) {
        this.f23529a = i10;
        this.f23530b = h00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23529a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h00 h00Var = this.f23530b;
                h00Var.f25302x = floatValue;
                h00Var.invalidate();
                return;
            default:
                h00 h00Var2 = this.f23530b;
                h00Var2.getClass();
                h00Var2.f25303y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h00Var2.invalidate();
                return;
        }
    }
}
