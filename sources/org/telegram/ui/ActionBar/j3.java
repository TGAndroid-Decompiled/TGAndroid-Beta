package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class j3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f20438a;
    public final q3 f20439b;

    public j3(q3 q3Var, int i10) {
        this.f20438a = i10;
        this.f20439b = q3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f20438a) {
            case 0:
                q3 q3Var = this.f20439b;
                q3Var.getClass();
                q3Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q3Var.invalidate();
                return;
            case 1:
                q3 q3Var2 = this.f20439b;
                q3Var2.getClass();
                q3Var2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            default:
                q3 q3Var3 = this.f20439b;
                q3Var3.getClass();
                q3Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q3Var3.invalidate();
                return;
        }
    }
}
