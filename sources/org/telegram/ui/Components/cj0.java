package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class cj0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25222a;
    public final ej0 f25223b;

    public cj0(ej0 ej0Var, int i10) {
        this.f25222a = i10;
        this.f25223b = ej0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25222a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ej0 ej0Var = this.f25223b;
                ej0Var.v = floatValue;
                org.telegram.ui.Cells.r2 r2Var = ej0Var.H;
                if (r2Var != null) {
                    r2Var.invalidate();
                }
                im0 im0Var = ej0Var.I;
                if (im0Var != null) {
                    im0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ej0 ej0Var2 = this.f25223b;
                ej0Var2.f25941w = floatValue2;
                org.telegram.ui.Cells.r2 r2Var2 = ej0Var2.H;
                if (r2Var2 != null) {
                    r2Var2.invalidate();
                }
                im0 im0Var2 = ej0Var2.I;
                if (im0Var2 != null) {
                    im0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ej0 ej0Var3 = this.f25223b;
                ej0Var3.f25935p = floatValue3;
                org.telegram.ui.Cells.r2 r2Var3 = ej0Var3.H;
                if (r2Var3 != null) {
                    r2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ej0 ej0Var4 = this.f25223b;
                ej0Var4.f25934o = floatValue4;
                org.telegram.ui.Cells.r2 r2Var4 = ej0Var4.H;
                if (r2Var4 != null) {
                    r2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ej0 ej0Var5 = this.f25223b;
                ej0Var5.f25942x = floatValue5;
                org.telegram.ui.Cells.r2 r2Var5 = ej0Var5.H;
                if (r2Var5 != null) {
                    r2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                ej0 ej0Var6 = this.f25223b;
                ej0Var6.getClass();
                ej0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.r2 r2Var6 = ej0Var6.H;
                if (r2Var6 != null) {
                    r2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                ej0 ej0Var7 = this.f25223b;
                ej0Var7.getClass();
                ej0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ej0Var7.F = true;
                org.telegram.ui.Cells.r2 r2Var7 = ej0Var7.H;
                if (r2Var7 != null) {
                    r2Var7.invalidate();
                    return;
                }
                return;
            default:
                ej0 ej0Var8 = this.f25223b;
                ej0Var8.getClass();
                ej0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ej0Var8.F = false;
                org.telegram.ui.Cells.r2 r2Var8 = ej0Var8.H;
                if (r2Var8 != null) {
                    r2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
