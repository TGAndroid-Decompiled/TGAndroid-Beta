package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class n3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23677a;
    public final v3 f23678b;

    public n3(v3 v3Var, int i9) {
        this.f23677a = i9;
        this.f23678b = v3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23677a) {
            case 0:
                v3 v3Var = this.f23678b;
                v3Var.getClass();
                v3Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3Var.invalidate();
                return;
            case 1:
                v3 v3Var2 = this.f23678b;
                v3Var2.getClass();
                v3Var2.f23860e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3Var2.invalidate();
                return;
            default:
                v3 v3Var3 = this.f23678b;
                v3Var3.getClass();
                v3Var3.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
