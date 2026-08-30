package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class o3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f20501a;
    public final w3 f20502b;

    public o3(w3 w3Var, int i10) {
        this.f20501a = i10;
        this.f20502b = w3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f20501a) {
            case 0:
                w3 w3Var = this.f20502b;
                w3Var.getClass();
                w3Var.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3Var.invalidate();
                return;
            case 1:
                w3 w3Var2 = this.f20502b;
                w3Var2.getClass();
                w3Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3Var2.invalidate();
                return;
            default:
                w3 w3Var3 = this.f20502b;
                w3Var3.getClass();
                w3Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
