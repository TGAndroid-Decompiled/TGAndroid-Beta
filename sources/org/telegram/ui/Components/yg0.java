package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class yg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42439a;
    public final zg0 f42440b;

    public yg0(zg0 zg0Var, int i7) {
        this.f42439a = i7;
        this.f42440b = zg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42439a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zg0 zg0Var = this.f42440b;
                zg0Var.v = floatValue;
                org.telegram.ui.Cells.u2 u2Var = zg0Var.H;
                if (u2Var != null) {
                    u2Var.invalidate();
                }
                ek0 ek0Var = zg0Var.I;
                if (ek0Var != null) {
                    ek0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zg0 zg0Var2 = this.f42440b;
                zg0Var2.f42832w = floatValue2;
                org.telegram.ui.Cells.u2 u2Var2 = zg0Var2.H;
                if (u2Var2 != null) {
                    u2Var2.invalidate();
                }
                ek0 ek0Var2 = zg0Var2.I;
                if (ek0Var2 != null) {
                    ek0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zg0 zg0Var3 = this.f42440b;
                zg0Var3.f42826p = floatValue3;
                org.telegram.ui.Cells.u2 u2Var3 = zg0Var3.H;
                if (u2Var3 != null) {
                    u2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zg0 zg0Var4 = this.f42440b;
                zg0Var4.f42825o = floatValue4;
                org.telegram.ui.Cells.u2 u2Var4 = zg0Var4.H;
                if (u2Var4 != null) {
                    u2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zg0 zg0Var5 = this.f42440b;
                zg0Var5.f42833x = floatValue5;
                org.telegram.ui.Cells.u2 u2Var5 = zg0Var5.H;
                if (u2Var5 != null) {
                    u2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                zg0 zg0Var6 = this.f42440b;
                zg0Var6.getClass();
                zg0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.u2 u2Var6 = zg0Var6.H;
                if (u2Var6 != null) {
                    u2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                zg0 zg0Var7 = this.f42440b;
                zg0Var7.getClass();
                zg0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zg0Var7.F = true;
                org.telegram.ui.Cells.u2 u2Var7 = zg0Var7.H;
                if (u2Var7 != null) {
                    u2Var7.invalidate();
                    return;
                }
                return;
            default:
                zg0 zg0Var8 = this.f42440b;
                zg0Var8.getClass();
                zg0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zg0Var8.F = false;
                org.telegram.ui.Cells.u2 u2Var8 = zg0Var8.H;
                if (u2Var8 != null) {
                    u2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
