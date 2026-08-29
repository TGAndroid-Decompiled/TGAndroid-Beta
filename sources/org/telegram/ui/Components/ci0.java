package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ci0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27488a;
    public final ei0 f27489b;

    public ci0(ei0 ei0Var, int i10) {
        this.f27488a = i10;
        this.f27489b = ei0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27488a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ei0 ei0Var = this.f27489b;
                ei0Var.v = floatValue;
                org.telegram.ui.Cells.p2 p2Var = ei0Var.H;
                if (p2Var != null) {
                    p2Var.invalidate();
                }
                jl0 jl0Var = ei0Var.I;
                if (jl0Var != null) {
                    jl0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ei0 ei0Var2 = this.f27489b;
                ei0Var2.f28088w = floatValue2;
                org.telegram.ui.Cells.p2 p2Var2 = ei0Var2.H;
                if (p2Var2 != null) {
                    p2Var2.invalidate();
                }
                jl0 jl0Var2 = ei0Var2.I;
                if (jl0Var2 != null) {
                    jl0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ei0 ei0Var3 = this.f27489b;
                ei0Var3.f28082p = floatValue3;
                org.telegram.ui.Cells.p2 p2Var3 = ei0Var3.H;
                if (p2Var3 != null) {
                    p2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ei0 ei0Var4 = this.f27489b;
                ei0Var4.f28081o = floatValue4;
                org.telegram.ui.Cells.p2 p2Var4 = ei0Var4.H;
                if (p2Var4 != null) {
                    p2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ei0 ei0Var5 = this.f27489b;
                ei0Var5.f28089x = floatValue5;
                org.telegram.ui.Cells.p2 p2Var5 = ei0Var5.H;
                if (p2Var5 != null) {
                    p2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                ei0 ei0Var6 = this.f27489b;
                ei0Var6.getClass();
                ei0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.p2 p2Var6 = ei0Var6.H;
                if (p2Var6 != null) {
                    p2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                ei0 ei0Var7 = this.f27489b;
                ei0Var7.getClass();
                ei0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ei0Var7.F = true;
                org.telegram.ui.Cells.p2 p2Var7 = ei0Var7.H;
                if (p2Var7 != null) {
                    p2Var7.invalidate();
                    return;
                }
                return;
            default:
                ei0 ei0Var8 = this.f27489b;
                ei0Var8.getClass();
                ei0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ei0Var8.F = false;
                org.telegram.ui.Cells.p2 p2Var8 = ei0Var8.H;
                if (p2Var8 != null) {
                    p2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
