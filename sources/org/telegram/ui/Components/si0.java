package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class si0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28285a;
    public final ui0 f28286b;

    public si0(ui0 ui0Var, int i10) {
        this.f28285a = i10;
        this.f28286b = ui0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28285a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui0 ui0Var = this.f28286b;
                ui0Var.v = floatValue;
                org.telegram.ui.Cells.s2 s2Var = ui0Var.H;
                if (s2Var != null) {
                    s2Var.invalidate();
                }
                xl0 xl0Var = ui0Var.I;
                if (xl0Var != null) {
                    xl0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui0 ui0Var2 = this.f28286b;
                ui0Var2.f28838w = floatValue2;
                org.telegram.ui.Cells.s2 s2Var2 = ui0Var2.H;
                if (s2Var2 != null) {
                    s2Var2.invalidate();
                }
                xl0 xl0Var2 = ui0Var2.I;
                if (xl0Var2 != null) {
                    xl0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui0 ui0Var3 = this.f28286b;
                ui0Var3.f28832p = floatValue3;
                org.telegram.ui.Cells.s2 s2Var3 = ui0Var3.H;
                if (s2Var3 != null) {
                    s2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui0 ui0Var4 = this.f28286b;
                ui0Var4.f28831o = floatValue4;
                org.telegram.ui.Cells.s2 s2Var4 = ui0Var4.H;
                if (s2Var4 != null) {
                    s2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui0 ui0Var5 = this.f28286b;
                ui0Var5.f28839x = floatValue5;
                org.telegram.ui.Cells.s2 s2Var5 = ui0Var5.H;
                if (s2Var5 != null) {
                    s2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                ui0 ui0Var6 = this.f28286b;
                ui0Var6.getClass();
                ui0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.s2 s2Var6 = ui0Var6.H;
                if (s2Var6 != null) {
                    s2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                ui0 ui0Var7 = this.f28286b;
                ui0Var7.getClass();
                ui0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui0Var7.F = true;
                org.telegram.ui.Cells.s2 s2Var7 = ui0Var7.H;
                if (s2Var7 != null) {
                    s2Var7.invalidate();
                    return;
                }
                return;
            default:
                ui0 ui0Var8 = this.f28286b;
                ui0Var8.getClass();
                ui0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui0Var8.F = false;
                org.telegram.ui.Cells.s2 s2Var8 = ui0Var8.H;
                if (s2Var8 != null) {
                    s2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
