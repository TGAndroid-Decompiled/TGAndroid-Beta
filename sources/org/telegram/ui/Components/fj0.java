package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class fj0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26330a;
    public final hj0 f26331b;

    public fj0(hj0 hj0Var, int i10) {
        this.f26330a = i10;
        this.f26331b = hj0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26330a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hj0 hj0Var = this.f26331b;
                hj0Var.v = floatValue;
                org.telegram.ui.Cells.q2 q2Var = hj0Var.H;
                if (q2Var != null) {
                    q2Var.invalidate();
                }
                lm0 lm0Var = hj0Var.I;
                if (lm0Var != null) {
                    lm0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hj0 hj0Var2 = this.f26331b;
                hj0Var2.f27064w = floatValue2;
                org.telegram.ui.Cells.q2 q2Var2 = hj0Var2.H;
                if (q2Var2 != null) {
                    q2Var2.invalidate();
                }
                lm0 lm0Var2 = hj0Var2.I;
                if (lm0Var2 != null) {
                    lm0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hj0 hj0Var3 = this.f26331b;
                hj0Var3.f27058p = floatValue3;
                org.telegram.ui.Cells.q2 q2Var3 = hj0Var3.H;
                if (q2Var3 != null) {
                    q2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hj0 hj0Var4 = this.f26331b;
                hj0Var4.f27057o = floatValue4;
                org.telegram.ui.Cells.q2 q2Var4 = hj0Var4.H;
                if (q2Var4 != null) {
                    q2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hj0 hj0Var5 = this.f26331b;
                hj0Var5.f27065x = floatValue5;
                org.telegram.ui.Cells.q2 q2Var5 = hj0Var5.H;
                if (q2Var5 != null) {
                    q2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                hj0 hj0Var6 = this.f26331b;
                hj0Var6.getClass();
                hj0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.q2 q2Var6 = hj0Var6.H;
                if (q2Var6 != null) {
                    q2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                hj0 hj0Var7 = this.f26331b;
                hj0Var7.getClass();
                hj0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hj0Var7.F = true;
                org.telegram.ui.Cells.q2 q2Var7 = hj0Var7.H;
                if (q2Var7 != null) {
                    q2Var7.invalidate();
                    return;
                }
                return;
            default:
                hj0 hj0Var8 = this.f26331b;
                hj0Var8.getClass();
                hj0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hj0Var8.F = false;
                org.telegram.ui.Cells.q2 q2Var8 = hj0Var8.H;
                if (q2Var8 != null) {
                    q2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
