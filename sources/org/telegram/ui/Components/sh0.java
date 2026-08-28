package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class sh0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32465a;
    public final uh0 f32466b;

    public sh0(uh0 uh0Var, int i9) {
        this.f32465a = i9;
        this.f32466b = uh0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32465a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uh0 uh0Var = this.f32466b;
                uh0Var.v = floatValue;
                org.telegram.ui.Cells.r2 r2Var = uh0Var.H;
                if (r2Var != null) {
                    r2Var.invalidate();
                }
                wk0 wk0Var = uh0Var.I;
                if (wk0Var != null) {
                    wk0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uh0 uh0Var2 = this.f32466b;
                uh0Var2.f33025w = floatValue2;
                org.telegram.ui.Cells.r2 r2Var2 = uh0Var2.H;
                if (r2Var2 != null) {
                    r2Var2.invalidate();
                }
                wk0 wk0Var2 = uh0Var2.I;
                if (wk0Var2 != null) {
                    wk0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uh0 uh0Var3 = this.f32466b;
                uh0Var3.f33019p = floatValue3;
                org.telegram.ui.Cells.r2 r2Var3 = uh0Var3.H;
                if (r2Var3 != null) {
                    r2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uh0 uh0Var4 = this.f32466b;
                uh0Var4.f33018o = floatValue4;
                org.telegram.ui.Cells.r2 r2Var4 = uh0Var4.H;
                if (r2Var4 != null) {
                    r2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uh0 uh0Var5 = this.f32466b;
                uh0Var5.f33026x = floatValue5;
                org.telegram.ui.Cells.r2 r2Var5 = uh0Var5.H;
                if (r2Var5 != null) {
                    r2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                uh0 uh0Var6 = this.f32466b;
                uh0Var6.getClass();
                uh0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.r2 r2Var6 = uh0Var6.H;
                if (r2Var6 != null) {
                    r2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                uh0 uh0Var7 = this.f32466b;
                uh0Var7.getClass();
                uh0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uh0Var7.F = true;
                org.telegram.ui.Cells.r2 r2Var7 = uh0Var7.H;
                if (r2Var7 != null) {
                    r2Var7.invalidate();
                    return;
                }
                return;
            default:
                uh0 uh0Var8 = this.f32466b;
                uh0Var8.getClass();
                uh0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uh0Var8.F = false;
                org.telegram.ui.Cells.r2 r2Var8 = uh0Var8.H;
                if (r2Var8 != null) {
                    r2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
