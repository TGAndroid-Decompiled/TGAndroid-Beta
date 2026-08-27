package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

public final class n3 implements ValueAnimator.AnimatorUpdateListener {

    public final int f23689a;

    public final v3 f23690b;

    public n3(v3 v3Var, int i10) {
        this.f23689a = i10;
        this.f23690b = v3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23689a) {
            case 0:
                v3 v3Var = this.f23690b;
                v3Var.getClass();
                v3Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3Var.invalidate();
                break;
            case 1:
                v3 v3Var2 = this.f23690b;
                v3Var2.getClass();
                v3Var2.f23890e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3Var2.invalidate();
                break;
            default:
                v3 v3Var3 = this.f23690b;
                v3Var3.getClass();
                v3Var3.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
