package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class i20 implements ValueAnimator.AnimatorUpdateListener {

    public final int f29208a;

    public final n20 f29209b;

    public i20(n20 n20Var, int i10) {
        this.f29208a = i10;
        this.f29209b = n20Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29208a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n20 n20Var = this.f29209b;
                n20Var.f30825r.x = (int) fFloatValue;
                n20Var.h();
                k20 k20Var = n20Var.f30819a;
                if (k20Var.getParent() != null) {
                    n20Var.f30824n.updateViewLayout(k20Var, n20Var.f30825r);
                }
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n20 n20Var2 = this.f29209b;
                n20Var2.f30825r.y = (int) fFloatValue2;
                k20 k20Var2 = n20Var2.f30819a;
                if (k20Var2.getParent() != null) {
                    n20Var2.f30824n.updateViewLayout(k20Var2, n20Var2.f30825r);
                }
                break;
        }
    }
}
