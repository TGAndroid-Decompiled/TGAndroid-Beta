package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class gj0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26613a;
    public final ij0 f26614b;

    public gj0(ij0 ij0Var, int i10) {
        this.f26613a = i10;
        this.f26614b = ij0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26613a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ij0 ij0Var = this.f26614b;
                ij0Var.v = floatValue;
                org.telegram.ui.Cells.q2 q2Var = ij0Var.H;
                if (q2Var != null) {
                    q2Var.invalidate();
                }
                mm0 mm0Var = ij0Var.I;
                if (mm0Var != null) {
                    mm0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ij0 ij0Var2 = this.f26614b;
                ij0Var2.f27352w = floatValue2;
                org.telegram.ui.Cells.q2 q2Var2 = ij0Var2.H;
                if (q2Var2 != null) {
                    q2Var2.invalidate();
                }
                mm0 mm0Var2 = ij0Var2.I;
                if (mm0Var2 != null) {
                    mm0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ij0 ij0Var3 = this.f26614b;
                ij0Var3.f27346p = floatValue3;
                org.telegram.ui.Cells.q2 q2Var3 = ij0Var3.H;
                if (q2Var3 != null) {
                    q2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ij0 ij0Var4 = this.f26614b;
                ij0Var4.f27345o = floatValue4;
                org.telegram.ui.Cells.q2 q2Var4 = ij0Var4.H;
                if (q2Var4 != null) {
                    q2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ij0 ij0Var5 = this.f26614b;
                ij0Var5.f27353x = floatValue5;
                org.telegram.ui.Cells.q2 q2Var5 = ij0Var5.H;
                if (q2Var5 != null) {
                    q2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                ij0 ij0Var6 = this.f26614b;
                ij0Var6.getClass();
                ij0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.q2 q2Var6 = ij0Var6.H;
                if (q2Var6 != null) {
                    q2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                ij0 ij0Var7 = this.f26614b;
                ij0Var7.getClass();
                ij0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ij0Var7.F = true;
                org.telegram.ui.Cells.q2 q2Var7 = ij0Var7.H;
                if (q2Var7 != null) {
                    q2Var7.invalidate();
                    return;
                }
                return;
            default:
                ij0 ij0Var8 = this.f26614b;
                ij0Var8.getClass();
                ij0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ij0Var8.F = false;
                org.telegram.ui.Cells.q2 q2Var8 = ij0Var8.H;
                if (q2Var8 != null) {
                    q2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
