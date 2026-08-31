package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class d00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26128a;
    public final j00 f26129b;

    public d00(j00 j00Var, int i10) {
        this.f26128a = i10;
        this.f26129b = j00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26128a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j00 j00Var = this.f26129b;
                j00Var.f27961x = floatValue;
                j00Var.invalidate();
                return;
            default:
                j00 j00Var2 = this.f26129b;
                j00Var2.getClass();
                j00Var2.f27962y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j00Var2.invalidate();
                return;
        }
    }
}
