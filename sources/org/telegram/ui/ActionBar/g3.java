package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class g3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29041a;
    public final m3 f29042b;

    public g3(m3 m3Var, int i7) {
        this.f29041a = i7;
        this.f29042b = m3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29041a) {
            case 0:
                m3 m3Var = this.f29042b;
                m3Var.getClass();
                m3Var.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m3Var.invalidate();
                return;
            case 1:
                m3 m3Var2 = this.f29042b;
                m3Var2.getClass();
                m3Var2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            default:
                m3 m3Var3 = this.f29042b;
                m3Var3.getClass();
                m3Var3.f29304e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m3Var3.invalidate();
                return;
        }
    }
}
