package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class n3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23697a;
    public final v3 f23698b;

    public n3(v3 v3Var, int i10) {
        this.f23697a = i10;
        this.f23698b = v3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23697a) {
            case 0:
                v3 v3Var = this.f23698b;
                v3Var.getClass();
                v3Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3Var.invalidate();
                return;
            case 1:
                v3 v3Var2 = this.f23698b;
                v3Var2.getClass();
                v3Var2.f23880e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3Var2.invalidate();
                return;
            default:
                v3 v3Var3 = this.f23698b;
                v3Var3.getClass();
                v3Var3.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
