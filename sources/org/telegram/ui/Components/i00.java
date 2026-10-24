package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class i00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27215a;
    public final o00 f27216b;

    public i00(o00 o00Var, int i10) {
        this.f27215a = i10;
        this.f27216b = o00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27215a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o00 o00Var = this.f27216b;
                o00Var.f29110x = floatValue;
                o00Var.invalidate();
                return;
            default:
                o00 o00Var2 = this.f27216b;
                o00Var2.getClass();
                o00Var2.f29111y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o00Var2.invalidate();
                return;
        }
    }
}
