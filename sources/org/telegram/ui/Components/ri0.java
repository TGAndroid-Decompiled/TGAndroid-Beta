package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ri0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27905a;
    public final ti0 f27906b;

    public ri0(ti0 ti0Var, int i10) {
        this.f27905a = i10;
        this.f27906b = ti0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27905a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti0 ti0Var = this.f27906b;
                ti0Var.v = floatValue;
                org.telegram.ui.Cells.s2 s2Var = ti0Var.H;
                if (s2Var != null) {
                    s2Var.invalidate();
                }
                wl0 wl0Var = ti0Var.I;
                if (wl0Var != null) {
                    wl0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti0 ti0Var2 = this.f27906b;
                ti0Var2.f28415w = floatValue2;
                org.telegram.ui.Cells.s2 s2Var2 = ti0Var2.H;
                if (s2Var2 != null) {
                    s2Var2.invalidate();
                }
                wl0 wl0Var2 = ti0Var2.I;
                if (wl0Var2 != null) {
                    wl0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti0 ti0Var3 = this.f27906b;
                ti0Var3.f28409p = floatValue3;
                org.telegram.ui.Cells.s2 s2Var3 = ti0Var3.H;
                if (s2Var3 != null) {
                    s2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti0 ti0Var4 = this.f27906b;
                ti0Var4.f28408o = floatValue4;
                org.telegram.ui.Cells.s2 s2Var4 = ti0Var4.H;
                if (s2Var4 != null) {
                    s2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti0 ti0Var5 = this.f27906b;
                ti0Var5.f28416x = floatValue5;
                org.telegram.ui.Cells.s2 s2Var5 = ti0Var5.H;
                if (s2Var5 != null) {
                    s2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                ti0 ti0Var6 = this.f27906b;
                ti0Var6.getClass();
                ti0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.s2 s2Var6 = ti0Var6.H;
                if (s2Var6 != null) {
                    s2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                ti0 ti0Var7 = this.f27906b;
                ti0Var7.getClass();
                ti0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti0Var7.F = true;
                org.telegram.ui.Cells.s2 s2Var7 = ti0Var7.H;
                if (s2Var7 != null) {
                    s2Var7.invalidate();
                    return;
                }
                return;
            default:
                ti0 ti0Var8 = this.f27906b;
                ti0Var8.getClass();
                ti0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti0Var8.F = false;
                org.telegram.ui.Cells.s2 s2Var8 = ti0Var8.H;
                if (s2Var8 != null) {
                    s2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
