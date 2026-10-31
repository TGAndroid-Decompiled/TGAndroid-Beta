package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class u2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f21343a;
    public final w2 f21344b;

    public u2(w2 w2Var, int i10) {
        this.f21343a = i10;
        this.f21344b = w2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.f21343a) {
            case 0:
                w2 w2Var = this.f21344b;
                z2 z2Var = w2Var.G;
                z2Var.f21586b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                z2Var.h0();
                z2Var.q0(z2Var.f21586b.getTranslationY());
                w2Var.invalidate();
                return;
            case 1:
                z2 z2Var2 = this.f21344b.G;
                p2 p2Var = z2Var2.f21589c;
                if (p2Var != null) {
                    p2Var.invalidate();
                }
                z2Var2.h0();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2 w2Var2 = this.f21344b;
                w2Var2.D = floatValue;
                z2 z2Var3 = w2Var2.G;
                z2Var3.f21586b.setTranslationX(floatValue);
                z2Var3.f21589c.invalidate();
                return;
            case 3:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2 w2Var3 = this.f21344b;
                w2Var3.D = floatValue2;
                z2 z2Var4 = w2Var3.G;
                z2Var4.f21586b.setTranslationX(floatValue2);
                z2Var4.f21589c.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2 z2Var5 = this.f21344b.G;
                y2 y2Var = z2Var5.Y;
                if (z2Var5.f21608o0) {
                    i10 = (int) (z2Var5.f21609p0 * floatValue3);
                } else {
                    i10 = 0;
                }
                y2Var.setAlpha(i10);
                return;
        }
    }
}
