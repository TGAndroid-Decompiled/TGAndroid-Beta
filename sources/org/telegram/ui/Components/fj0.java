package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class fj0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28211a;
    public final hj0 f28212b;

    public fj0(hj0 hj0Var, int i10) {
        this.f28211a = i10;
        this.f28212b = hj0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28211a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hj0 hj0Var = this.f28212b;
                hj0Var.v = floatValue;
                org.telegram.ui.Cells.p2 p2Var = hj0Var.H;
                if (p2Var != null) {
                    p2Var.invalidate();
                }
                mm0 mm0Var = hj0Var.I;
                if (mm0Var != null) {
                    mm0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hj0 hj0Var2 = this.f28212b;
                hj0Var2.f28996w = floatValue2;
                org.telegram.ui.Cells.p2 p2Var2 = hj0Var2.H;
                if (p2Var2 != null) {
                    p2Var2.invalidate();
                }
                mm0 mm0Var2 = hj0Var2.I;
                if (mm0Var2 != null) {
                    mm0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hj0 hj0Var3 = this.f28212b;
                hj0Var3.f28990p = floatValue3;
                org.telegram.ui.Cells.p2 p2Var3 = hj0Var3.H;
                if (p2Var3 != null) {
                    p2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hj0 hj0Var4 = this.f28212b;
                hj0Var4.f28989o = floatValue4;
                org.telegram.ui.Cells.p2 p2Var4 = hj0Var4.H;
                if (p2Var4 != null) {
                    p2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hj0 hj0Var5 = this.f28212b;
                hj0Var5.f28997x = floatValue5;
                org.telegram.ui.Cells.p2 p2Var5 = hj0Var5.H;
                if (p2Var5 != null) {
                    p2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                hj0 hj0Var6 = this.f28212b;
                hj0Var6.getClass();
                hj0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.p2 p2Var6 = hj0Var6.H;
                if (p2Var6 != null) {
                    p2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                hj0 hj0Var7 = this.f28212b;
                hj0Var7.getClass();
                hj0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hj0Var7.F = true;
                org.telegram.ui.Cells.p2 p2Var7 = hj0Var7.H;
                if (p2Var7 != null) {
                    p2Var7.invalidate();
                    return;
                }
                return;
            default:
                hj0 hj0Var8 = this.f28212b;
                hj0Var8.getClass();
                hj0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hj0Var8.F = false;
                org.telegram.ui.Cells.p2 p2Var8 = hj0Var8.H;
                if (p2Var8 != null) {
                    p2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
