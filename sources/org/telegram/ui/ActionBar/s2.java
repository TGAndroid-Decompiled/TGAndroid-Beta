package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class s2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29972a;
    public final u2 f29973b;

    public s2(u2 u2Var, int i7) {
        this.f29972a = i7;
        this.f29973b = u2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        switch (this.f29972a) {
            case 0:
                u2 u2Var = this.f29973b;
                x2 x2Var = u2Var.H;
                x2Var.f30192b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                x2Var.h0();
                x2Var.q0(x2Var.f30192b.getTranslationY());
                u2Var.invalidate();
                return;
            case 1:
                x2 x2Var2 = this.f29973b.H;
                n2 n2Var = x2Var2.f30195c;
                if (n2Var != null) {
                    n2Var.invalidate();
                }
                x2Var2.h0();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2 u2Var2 = this.f29973b;
                u2Var2.E = floatValue;
                x2 x2Var3 = u2Var2.H;
                x2Var3.f30192b.setTranslationX(floatValue);
                x2Var3.f30195c.invalidate();
                return;
            case 3:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2 u2Var3 = this.f29973b;
                u2Var3.E = floatValue2;
                x2 x2Var4 = u2Var3.H;
                x2Var4.f30192b.setTranslationX(floatValue2);
                x2Var4.f30195c.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2 x2Var5 = this.f29973b.H;
                w2 w2Var = x2Var5.Z;
                if (x2Var5.f30220p0) {
                    i7 = (int) (x2Var5.f30221q0 * floatValue3);
                } else {
                    i7 = 0;
                }
                w2Var.setAlpha(i7);
                return;
        }
    }
}
