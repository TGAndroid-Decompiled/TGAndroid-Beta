package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class o3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f20476a;
    public final w3 f20477b;

    public o3(w3 w3Var, int i10) {
        this.f20476a = i10;
        this.f20477b = w3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f20476a) {
            case 0:
                w3 w3Var = this.f20477b;
                w3Var.getClass();
                w3Var.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3Var.invalidate();
                return;
            case 1:
                w3 w3Var2 = this.f20477b;
                w3Var2.getClass();
                w3Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3Var2.invalidate();
                return;
            default:
                w3 w3Var3 = this.f20477b;
                w3Var3.getClass();
                w3Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
