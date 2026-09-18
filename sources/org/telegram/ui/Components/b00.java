package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class b00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22767a;
    public final i00 f22768b;

    public b00(i00 i00Var, int i10) {
        this.f22767a = i10;
        this.f22768b = i00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22767a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i00 i00Var = this.f22768b;
                i00Var.f24806x = floatValue;
                i00Var.invalidate();
                return;
            default:
                i00 i00Var2 = this.f22768b;
                i00Var2.getClass();
                i00Var2.f24807y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i00Var2.invalidate();
                return;
        }
    }
}
