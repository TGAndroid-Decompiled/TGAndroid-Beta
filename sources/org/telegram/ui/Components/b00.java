package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class b00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24512a;
    public final i00 f24513b;

    public b00(i00 i00Var, int i10) {
        this.f24512a = i10;
        this.f24513b = i00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24512a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i00 i00Var = this.f24513b;
                i00Var.f26947x = floatValue;
                i00Var.invalidate();
                return;
            default:
                i00 i00Var2 = this.f24513b;
                i00Var2.getClass();
                i00Var2.f26948y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i00Var2.invalidate();
                return;
        }
    }
}
