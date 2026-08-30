package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ni0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27291a;
    public final pi0 f27292b;

    public ni0(pi0 pi0Var, int i10) {
        this.f27291a = i10;
        this.f27292b = pi0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27291a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pi0 pi0Var = this.f27292b;
                pi0Var.v = floatValue;
                org.telegram.ui.Cells.r2 r2Var = pi0Var.H;
                if (r2Var != null) {
                    r2Var.invalidate();
                }
                sl0 sl0Var = pi0Var.I;
                if (sl0Var != null) {
                    sl0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pi0 pi0Var2 = this.f27292b;
                pi0Var2.f27864w = floatValue2;
                org.telegram.ui.Cells.r2 r2Var2 = pi0Var2.H;
                if (r2Var2 != null) {
                    r2Var2.invalidate();
                }
                sl0 sl0Var2 = pi0Var2.I;
                if (sl0Var2 != null) {
                    sl0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pi0 pi0Var3 = this.f27292b;
                pi0Var3.f27858p = floatValue3;
                org.telegram.ui.Cells.r2 r2Var3 = pi0Var3.H;
                if (r2Var3 != null) {
                    r2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pi0 pi0Var4 = this.f27292b;
                pi0Var4.f27857o = floatValue4;
                org.telegram.ui.Cells.r2 r2Var4 = pi0Var4.H;
                if (r2Var4 != null) {
                    r2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pi0 pi0Var5 = this.f27292b;
                pi0Var5.f27865x = floatValue5;
                org.telegram.ui.Cells.r2 r2Var5 = pi0Var5.H;
                if (r2Var5 != null) {
                    r2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                pi0 pi0Var6 = this.f27292b;
                pi0Var6.getClass();
                pi0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.r2 r2Var6 = pi0Var6.H;
                if (r2Var6 != null) {
                    r2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                pi0 pi0Var7 = this.f27292b;
                pi0Var7.getClass();
                pi0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pi0Var7.F = true;
                org.telegram.ui.Cells.r2 r2Var7 = pi0Var7.H;
                if (r2Var7 != null) {
                    r2Var7.invalidate();
                    return;
                }
                return;
            default:
                pi0 pi0Var8 = this.f27292b;
                pi0Var8.getClass();
                pi0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pi0Var8.F = false;
                org.telegram.ui.Cells.r2 r2Var8 = pi0Var8.H;
                if (r2Var8 != null) {
                    r2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
