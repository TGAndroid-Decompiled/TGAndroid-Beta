package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class mg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37245a;
    public final ng0 f37246b;

    public mg0(ng0 ng0Var, int i7) {
        this.f37245a = i7;
        this.f37246b = ng0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37245a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ng0 ng0Var = this.f37246b;
                ng0Var.v = floatValue;
                org.telegram.ui.Cells.t2 t2Var = ng0Var.H;
                if (t2Var != null) {
                    t2Var.invalidate();
                }
                uj0 uj0Var = ng0Var.I;
                if (uj0Var != null) {
                    uj0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ng0 ng0Var2 = this.f37246b;
                ng0Var2.f37598w = floatValue2;
                org.telegram.ui.Cells.t2 t2Var2 = ng0Var2.H;
                if (t2Var2 != null) {
                    t2Var2.invalidate();
                }
                uj0 uj0Var2 = ng0Var2.I;
                if (uj0Var2 != null) {
                    uj0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ng0 ng0Var3 = this.f37246b;
                ng0Var3.f37592p = floatValue3;
                org.telegram.ui.Cells.t2 t2Var3 = ng0Var3.H;
                if (t2Var3 != null) {
                    t2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ng0 ng0Var4 = this.f37246b;
                ng0Var4.f37591o = floatValue4;
                org.telegram.ui.Cells.t2 t2Var4 = ng0Var4.H;
                if (t2Var4 != null) {
                    t2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ng0 ng0Var5 = this.f37246b;
                ng0Var5.f37599x = floatValue5;
                org.telegram.ui.Cells.t2 t2Var5 = ng0Var5.H;
                if (t2Var5 != null) {
                    t2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                ng0 ng0Var6 = this.f37246b;
                ng0Var6.getClass();
                ng0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.t2 t2Var6 = ng0Var6.H;
                if (t2Var6 != null) {
                    t2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                ng0 ng0Var7 = this.f37246b;
                ng0Var7.getClass();
                ng0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ng0Var7.F = true;
                org.telegram.ui.Cells.t2 t2Var7 = ng0Var7.H;
                if (t2Var7 != null) {
                    t2Var7.invalidate();
                    return;
                }
                return;
            default:
                ng0 ng0Var8 = this.f37246b;
                ng0Var8.getClass();
                ng0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ng0Var8.F = false;
                org.telegram.ui.Cells.t2 t2Var8 = ng0Var8.H;
                if (t2Var8 != null) {
                    t2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
