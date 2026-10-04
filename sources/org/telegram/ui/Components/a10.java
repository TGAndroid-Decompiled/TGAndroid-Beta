package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class a10 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24415a;
    public final b10 f24416b;

    public a10(b10 b10Var, int i10) {
        this.f24415a = i10;
        this.f24416b = b10Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24415a) {
            case 0:
                b10 b10Var = this.f24416b;
                b10Var.getClass();
                b10Var.f24752x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b10Var.invalidate();
                return;
            case 1:
                b10 b10Var2 = this.f24416b;
                b10Var2.getClass();
                b10Var2.f24750s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                b10Var2.invalidate();
                return;
            default:
                b10 b10Var3 = this.f24416b;
                b10Var3.getClass();
                b10Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b10Var3.invalidate();
                return;
        }
    }
}
