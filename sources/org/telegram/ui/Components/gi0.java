package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class gi0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26418a;
    public final ii0 f26419b;

    public gi0(ii0 ii0Var, int i10) {
        this.f26418a = i10;
        this.f26419b = ii0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26418a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ii0 ii0Var = this.f26419b;
                ii0Var.v = floatValue;
                org.telegram.ui.Cells.r2 r2Var = ii0Var.H;
                if (r2Var != null) {
                    r2Var.invalidate();
                }
                ll0 ll0Var = ii0Var.I;
                if (ll0Var != null) {
                    ll0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ii0 ii0Var2 = this.f26419b;
                ii0Var2.f27169w = floatValue2;
                org.telegram.ui.Cells.r2 r2Var2 = ii0Var2.H;
                if (r2Var2 != null) {
                    r2Var2.invalidate();
                }
                ll0 ll0Var2 = ii0Var2.I;
                if (ll0Var2 != null) {
                    ll0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ii0 ii0Var3 = this.f26419b;
                ii0Var3.f27163p = floatValue3;
                org.telegram.ui.Cells.r2 r2Var3 = ii0Var3.H;
                if (r2Var3 != null) {
                    r2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ii0 ii0Var4 = this.f26419b;
                ii0Var4.f27162o = floatValue4;
                org.telegram.ui.Cells.r2 r2Var4 = ii0Var4.H;
                if (r2Var4 != null) {
                    r2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ii0 ii0Var5 = this.f26419b;
                ii0Var5.f27170x = floatValue5;
                org.telegram.ui.Cells.r2 r2Var5 = ii0Var5.H;
                if (r2Var5 != null) {
                    r2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                ii0 ii0Var6 = this.f26419b;
                ii0Var6.getClass();
                ii0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.r2 r2Var6 = ii0Var6.H;
                if (r2Var6 != null) {
                    r2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                ii0 ii0Var7 = this.f26419b;
                ii0Var7.getClass();
                ii0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ii0Var7.F = true;
                org.telegram.ui.Cells.r2 r2Var7 = ii0Var7.H;
                if (r2Var7 != null) {
                    r2Var7.invalidate();
                    return;
                }
                return;
            default:
                ii0 ii0Var8 = this.f26419b;
                ii0Var8.getClass();
                ii0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ii0Var8.F = false;
                org.telegram.ui.Cells.r2 r2Var8 = ii0Var8.H;
                if (r2Var8 != null) {
                    r2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
