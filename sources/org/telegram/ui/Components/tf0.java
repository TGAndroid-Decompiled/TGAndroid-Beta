package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class tf0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30623a;
    public final vf0 f30624b;

    public tf0(vf0 vf0Var, int i10) {
        this.f30623a = i10;
        this.f30624b = vf0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30623a) {
            case 0:
                vf0 vf0Var = this.f30624b;
                vf0Var.getClass();
                vf0Var.f31248y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vf0Var.invalidate();
                return;
            default:
                vf0 vf0Var2 = this.f30624b;
                vf0Var2.getClass();
                vf0Var2.f31248y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vf0Var2.invalidate();
                return;
        }
    }
}
