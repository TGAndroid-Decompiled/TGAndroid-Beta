package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class qi0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27584a;
    public final si0 f27585b;

    public qi0(si0 si0Var, int i10) {
        this.f27584a = i10;
        this.f27585b = si0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27584a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si0 si0Var = this.f27585b;
                si0Var.v = floatValue;
                org.telegram.ui.Cells.s2 s2Var = si0Var.H;
                if (s2Var != null) {
                    s2Var.invalidate();
                }
                vl0 vl0Var = si0Var.I;
                if (vl0Var != null) {
                    vl0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si0 si0Var2 = this.f27585b;
                si0Var2.f28145w = floatValue2;
                org.telegram.ui.Cells.s2 s2Var2 = si0Var2.H;
                if (s2Var2 != null) {
                    s2Var2.invalidate();
                }
                vl0 vl0Var2 = si0Var2.I;
                if (vl0Var2 != null) {
                    vl0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si0 si0Var3 = this.f27585b;
                si0Var3.f28139p = floatValue3;
                org.telegram.ui.Cells.s2 s2Var3 = si0Var3.H;
                if (s2Var3 != null) {
                    s2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si0 si0Var4 = this.f27585b;
                si0Var4.f28138o = floatValue4;
                org.telegram.ui.Cells.s2 s2Var4 = si0Var4.H;
                if (s2Var4 != null) {
                    s2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si0 si0Var5 = this.f27585b;
                si0Var5.f28146x = floatValue5;
                org.telegram.ui.Cells.s2 s2Var5 = si0Var5.H;
                if (s2Var5 != null) {
                    s2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                si0 si0Var6 = this.f27585b;
                si0Var6.getClass();
                si0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.s2 s2Var6 = si0Var6.H;
                if (s2Var6 != null) {
                    s2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                si0 si0Var7 = this.f27585b;
                si0Var7.getClass();
                si0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si0Var7.F = true;
                org.telegram.ui.Cells.s2 s2Var7 = si0Var7.H;
                if (s2Var7 != null) {
                    s2Var7.invalidate();
                    return;
                }
                return;
            default:
                si0 si0Var8 = this.f27585b;
                si0Var8.getClass();
                si0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si0Var8.F = false;
                org.telegram.ui.Cells.s2 s2Var8 = si0Var8.H;
                if (s2Var8 != null) {
                    s2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
