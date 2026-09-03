package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class pi0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30103a;
    public final ri0 f30104b;

    public pi0(ri0 ri0Var, int i10) {
        this.f30103a = i10;
        this.f30104b = ri0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30103a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ri0 ri0Var = this.f30104b;
                ri0Var.v = floatValue;
                org.telegram.ui.Cells.r2 r2Var = ri0Var.H;
                if (r2Var != null) {
                    r2Var.invalidate();
                }
                sl0 sl0Var = ri0Var.I;
                if (sl0Var != null) {
                    sl0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ri0 ri0Var2 = this.f30104b;
                ri0Var2.f30777w = floatValue2;
                org.telegram.ui.Cells.r2 r2Var2 = ri0Var2.H;
                if (r2Var2 != null) {
                    r2Var2.invalidate();
                }
                sl0 sl0Var2 = ri0Var2.I;
                if (sl0Var2 != null) {
                    sl0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ri0 ri0Var3 = this.f30104b;
                ri0Var3.f30771p = floatValue3;
                org.telegram.ui.Cells.r2 r2Var3 = ri0Var3.H;
                if (r2Var3 != null) {
                    r2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ri0 ri0Var4 = this.f30104b;
                ri0Var4.f30770o = floatValue4;
                org.telegram.ui.Cells.r2 r2Var4 = ri0Var4.H;
                if (r2Var4 != null) {
                    r2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ri0 ri0Var5 = this.f30104b;
                ri0Var5.f30778x = floatValue5;
                org.telegram.ui.Cells.r2 r2Var5 = ri0Var5.H;
                if (r2Var5 != null) {
                    r2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                ri0 ri0Var6 = this.f30104b;
                ri0Var6.getClass();
                ri0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.r2 r2Var6 = ri0Var6.H;
                if (r2Var6 != null) {
                    r2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                ri0 ri0Var7 = this.f30104b;
                ri0Var7.getClass();
                ri0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ri0Var7.F = true;
                org.telegram.ui.Cells.r2 r2Var7 = ri0Var7.H;
                if (r2Var7 != null) {
                    r2Var7.invalidate();
                    return;
                }
                return;
            default:
                ri0 ri0Var8 = this.f30104b;
                ri0Var8.getClass();
                ri0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ri0Var8.F = false;
                org.telegram.ui.Cells.r2 r2Var8 = ri0Var8.H;
                if (r2Var8 != null) {
                    r2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
