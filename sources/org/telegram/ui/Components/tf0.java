package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class tf0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28105a;
    public final vf0 f28106b;

    public tf0(vf0 vf0Var, int i10) {
        this.f28105a = i10;
        this.f28106b = vf0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28105a) {
            case 0:
                vf0 vf0Var = this.f28106b;
                vf0Var.getClass();
                vf0Var.f28704y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vf0Var.invalidate();
                return;
            default:
                vf0 vf0Var2 = this.f28106b;
                vf0Var2.getClass();
                vf0Var2.f28704y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vf0Var2.invalidate();
                return;
        }
    }
}
