package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class d00 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25306a;
    public final f00 f25307b;

    public d00(f00 f00Var, int i10) {
        this.f25306a = i10;
        this.f25307b = f00Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25306a) {
            case 0:
                f00 f00Var = this.f25307b;
                f00Var.getClass();
                f00Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f00Var.invalidate();
                return;
            case 1:
                f00 f00Var2 = this.f25307b;
                f00Var2.getClass();
                f00Var2.f25993w = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                f00Var2.invalidate();
                return;
            default:
                f00 f00Var3 = this.f25307b;
                f00Var3.getClass();
                f00Var3.f25990n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f00Var3.invalidate();
                return;
        }
    }
}
