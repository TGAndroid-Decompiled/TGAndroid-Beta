package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28398a;
    public final s2 f28399b;

    public q2(s2 s2Var, int i7) {
        this.f28398a = i7;
        this.f28399b = s2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        switch (this.f28398a) {
            case 0:
                s2 s2Var = this.f28399b;
                v2 v2Var = s2Var.G;
                v2Var.f28616b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                v2Var.h0();
                v2Var.q0(v2Var.f28616b.getTranslationY());
                s2Var.invalidate();
                return;
            case 1:
                v2 v2Var2 = this.f28399b.G;
                l2 l2Var = v2Var2.f28619c;
                if (l2Var != null) {
                    l2Var.invalidate();
                }
                v2Var2.h0();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s2 s2Var2 = this.f28399b;
                s2Var2.D = floatValue;
                v2 v2Var3 = s2Var2.G;
                v2Var3.f28616b.setTranslationX(floatValue);
                v2Var3.f28619c.invalidate();
                return;
            case 3:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s2 s2Var3 = this.f28399b;
                s2Var3.D = floatValue2;
                v2 v2Var4 = s2Var3.G;
                v2Var4.f28616b.setTranslationX(floatValue2);
                v2Var4.f28619c.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2 v2Var5 = this.f28399b.G;
                u2 u2Var = v2Var5.Y;
                if (v2Var5.f28639o0) {
                    i7 = (int) (v2Var5.f28640p0 * floatValue3);
                } else {
                    i7 = 0;
                }
                u2Var.setAlpha(i7);
                return;
        }
    }
}
