package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class s2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29970a;
    public final u2 f29971b;

    public s2(u2 u2Var, int i7) {
        this.f29970a = i7;
        this.f29971b = u2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        switch (this.f29970a) {
            case 0:
                u2 u2Var = this.f29971b;
                x2 x2Var = u2Var.H;
                x2Var.f30190b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                x2Var.h0();
                x2Var.q0(x2Var.f30190b.getTranslationY());
                u2Var.invalidate();
                return;
            case 1:
                x2 x2Var2 = this.f29971b.H;
                n2 n2Var = x2Var2.f30193c;
                if (n2Var != null) {
                    n2Var.invalidate();
                }
                x2Var2.h0();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2 u2Var2 = this.f29971b;
                u2Var2.E = floatValue;
                x2 x2Var3 = u2Var2.H;
                x2Var3.f30190b.setTranslationX(floatValue);
                x2Var3.f30193c.invalidate();
                return;
            case 3:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2 u2Var3 = this.f29971b;
                u2Var3.E = floatValue2;
                x2 x2Var4 = u2Var3.H;
                x2Var4.f30190b.setTranslationX(floatValue2);
                x2Var4.f30193c.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2 x2Var5 = this.f29971b.H;
                w2 w2Var = x2Var5.Z;
                if (x2Var5.f30218p0) {
                    i7 = (int) (x2Var5.f30219q0 * floatValue3);
                } else {
                    i7 = 0;
                }
                w2Var.setAlpha(i7);
                return;
        }
    }
}
