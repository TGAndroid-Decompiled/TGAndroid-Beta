package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class wg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41713a;
    public final xg0 f41714b;

    public wg0(xg0 xg0Var, int i7) {
        this.f41713a = i7;
        this.f41714b = xg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41713a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xg0 xg0Var = this.f41714b;
                xg0Var.v = floatValue;
                org.telegram.ui.Cells.t2 t2Var = xg0Var.H;
                if (t2Var != null) {
                    t2Var.invalidate();
                }
                ck0 ck0Var = xg0Var.I;
                if (ck0Var != null) {
                    ck0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xg0 xg0Var2 = this.f41714b;
                xg0Var2.f42039w = floatValue2;
                org.telegram.ui.Cells.t2 t2Var2 = xg0Var2.H;
                if (t2Var2 != null) {
                    t2Var2.invalidate();
                }
                ck0 ck0Var2 = xg0Var2.I;
                if (ck0Var2 != null) {
                    ck0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xg0 xg0Var3 = this.f41714b;
                xg0Var3.f42033p = floatValue3;
                org.telegram.ui.Cells.t2 t2Var3 = xg0Var3.H;
                if (t2Var3 != null) {
                    t2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xg0 xg0Var4 = this.f41714b;
                xg0Var4.f42032o = floatValue4;
                org.telegram.ui.Cells.t2 t2Var4 = xg0Var4.H;
                if (t2Var4 != null) {
                    t2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xg0 xg0Var5 = this.f41714b;
                xg0Var5.f42040x = floatValue5;
                org.telegram.ui.Cells.t2 t2Var5 = xg0Var5.H;
                if (t2Var5 != null) {
                    t2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                xg0 xg0Var6 = this.f41714b;
                xg0Var6.getClass();
                xg0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.t2 t2Var6 = xg0Var6.H;
                if (t2Var6 != null) {
                    t2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                xg0 xg0Var7 = this.f41714b;
                xg0Var7.getClass();
                xg0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xg0Var7.F = true;
                org.telegram.ui.Cells.t2 t2Var7 = xg0Var7.H;
                if (t2Var7 != null) {
                    t2Var7.invalidate();
                    return;
                }
                return;
            default:
                xg0 xg0Var8 = this.f41714b;
                xg0Var8.getClass();
                xg0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xg0Var8.F = false;
                org.telegram.ui.Cells.t2 t2Var8 = xg0Var8.H;
                if (t2Var8 != null) {
                    t2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
