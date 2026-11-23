package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class xg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41998a;
    public final yg0 f41999b;

    public xg0(yg0 yg0Var, int i7) {
        this.f41998a = i7;
        this.f41999b = yg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41998a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg0 yg0Var = this.f41999b;
                yg0Var.v = floatValue;
                org.telegram.ui.Cells.u2 u2Var = yg0Var.H;
                if (u2Var != null) {
                    u2Var.invalidate();
                }
                ek0 ek0Var = yg0Var.I;
                if (ek0Var != null) {
                    ek0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg0 yg0Var2 = this.f41999b;
                yg0Var2.f42483w = floatValue2;
                org.telegram.ui.Cells.u2 u2Var2 = yg0Var2.H;
                if (u2Var2 != null) {
                    u2Var2.invalidate();
                }
                ek0 ek0Var2 = yg0Var2.I;
                if (ek0Var2 != null) {
                    ek0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg0 yg0Var3 = this.f41999b;
                yg0Var3.f42477p = floatValue3;
                org.telegram.ui.Cells.u2 u2Var3 = yg0Var3.H;
                if (u2Var3 != null) {
                    u2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg0 yg0Var4 = this.f41999b;
                yg0Var4.f42476o = floatValue4;
                org.telegram.ui.Cells.u2 u2Var4 = yg0Var4.H;
                if (u2Var4 != null) {
                    u2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg0 yg0Var5 = this.f41999b;
                yg0Var5.f42484x = floatValue5;
                org.telegram.ui.Cells.u2 u2Var5 = yg0Var5.H;
                if (u2Var5 != null) {
                    u2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                yg0 yg0Var6 = this.f41999b;
                yg0Var6.getClass();
                yg0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.u2 u2Var6 = yg0Var6.H;
                if (u2Var6 != null) {
                    u2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                yg0 yg0Var7 = this.f41999b;
                yg0Var7.getClass();
                yg0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg0Var7.F = true;
                org.telegram.ui.Cells.u2 u2Var7 = yg0Var7.H;
                if (u2Var7 != null) {
                    u2Var7.invalidate();
                    return;
                }
                return;
            default:
                yg0 yg0Var8 = this.f41999b;
                yg0Var8.getClass();
                yg0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg0Var8.F = false;
                org.telegram.ui.Cells.u2 u2Var8 = yg0Var8.H;
                if (u2Var8 != null) {
                    u2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
