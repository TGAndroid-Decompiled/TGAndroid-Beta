package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class g2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22399a;
    public final q2 f22400b;

    public g2(q2 q2Var, int i10) {
        this.f22399a = i10;
        this.f22400b = q2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22399a) {
            case 0:
                q2 q2Var = this.f22400b;
                q2Var.getClass();
                q2Var.V3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var.invalidate();
                return;
            case 1:
                q2 q2Var2 = this.f22400b;
                q2Var2.getClass();
                q2Var2.W3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var2.invalidate();
                return;
            default:
                q2 q2Var3 = this.f22400b;
                q2Var3.getClass();
                q2Var3.f23045y4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var3.invalidate();
                return;
        }
    }
}
