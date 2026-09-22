package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class b00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22794a;
    public final i00 f22795b;

    public b00(i00 i00Var, int i10) {
        this.f22794a = i10;
        this.f22795b = i00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22794a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i00 i00Var = this.f22795b;
                i00Var.f24933x = floatValue;
                i00Var.invalidate();
                return;
            default:
                i00 i00Var2 = this.f22795b;
                i00Var2.getClass();
                i00Var2.f24934y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i00Var2.invalidate();
                return;
        }
    }
}
