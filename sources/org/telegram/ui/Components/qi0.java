package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class qi0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26425a;
    public final si0 f26426b;

    public qi0(si0 si0Var, int i10) {
        this.f26425a = i10;
        this.f26426b = si0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26425a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si0 si0Var = this.f26426b;
                si0Var.v = floatValue;
                org.telegram.ui.Cells.r2 r2Var = si0Var.H;
                if (r2Var != null) {
                    r2Var.invalidate();
                }
                vl0 vl0Var = si0Var.I;
                if (vl0Var != null) {
                    vl0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si0 si0Var2 = this.f26426b;
                si0Var2.f27080w = floatValue2;
                org.telegram.ui.Cells.r2 r2Var2 = si0Var2.H;
                if (r2Var2 != null) {
                    r2Var2.invalidate();
                }
                vl0 vl0Var2 = si0Var2.I;
                if (vl0Var2 != null) {
                    vl0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si0 si0Var3 = this.f26426b;
                si0Var3.f27074p = floatValue3;
                org.telegram.ui.Cells.r2 r2Var3 = si0Var3.H;
                if (r2Var3 != null) {
                    r2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si0 si0Var4 = this.f26426b;
                si0Var4.f27073o = floatValue4;
                org.telegram.ui.Cells.r2 r2Var4 = si0Var4.H;
                if (r2Var4 != null) {
                    r2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si0 si0Var5 = this.f26426b;
                si0Var5.f27081x = floatValue5;
                org.telegram.ui.Cells.r2 r2Var5 = si0Var5.H;
                if (r2Var5 != null) {
                    r2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                si0 si0Var6 = this.f26426b;
                si0Var6.getClass();
                si0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.r2 r2Var6 = si0Var6.H;
                if (r2Var6 != null) {
                    r2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                si0 si0Var7 = this.f26426b;
                si0Var7.getClass();
                si0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si0Var7.F = true;
                org.telegram.ui.Cells.r2 r2Var7 = si0Var7.H;
                if (r2Var7 != null) {
                    r2Var7.invalidate();
                    return;
                }
                return;
            default:
                si0 si0Var8 = this.f26426b;
                si0Var8.getClass();
                si0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si0Var8.F = false;
                org.telegram.ui.Cells.r2 r2Var8 = si0Var8.H;
                if (r2Var8 != null) {
                    r2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
