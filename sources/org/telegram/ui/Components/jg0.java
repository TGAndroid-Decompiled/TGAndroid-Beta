package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class jg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34956a;
    public final kg0 f34957b;

    public jg0(kg0 kg0Var, int i7) {
        this.f34956a = i7;
        this.f34957b = kg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34956a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kg0 kg0Var = this.f34957b;
                kg0Var.v = floatValue;
                org.telegram.ui.Cells.t2 t2Var = kg0Var.H;
                if (t2Var != null) {
                    t2Var.invalidate();
                }
                pj0 pj0Var = kg0Var.I;
                if (pj0Var != null) {
                    pj0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kg0 kg0Var2 = this.f34957b;
                kg0Var2.f35303w = floatValue2;
                org.telegram.ui.Cells.t2 t2Var2 = kg0Var2.H;
                if (t2Var2 != null) {
                    t2Var2.invalidate();
                }
                pj0 pj0Var2 = kg0Var2.I;
                if (pj0Var2 != null) {
                    pj0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kg0 kg0Var3 = this.f34957b;
                kg0Var3.f35297p = floatValue3;
                org.telegram.ui.Cells.t2 t2Var3 = kg0Var3.H;
                if (t2Var3 != null) {
                    t2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kg0 kg0Var4 = this.f34957b;
                kg0Var4.f35296o = floatValue4;
                org.telegram.ui.Cells.t2 t2Var4 = kg0Var4.H;
                if (t2Var4 != null) {
                    t2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kg0 kg0Var5 = this.f34957b;
                kg0Var5.f35304x = floatValue5;
                org.telegram.ui.Cells.t2 t2Var5 = kg0Var5.H;
                if (t2Var5 != null) {
                    t2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                kg0 kg0Var6 = this.f34957b;
                kg0Var6.getClass();
                kg0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.t2 t2Var6 = kg0Var6.H;
                if (t2Var6 != null) {
                    t2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                kg0 kg0Var7 = this.f34957b;
                kg0Var7.getClass();
                kg0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kg0Var7.F = true;
                org.telegram.ui.Cells.t2 t2Var7 = kg0Var7.H;
                if (t2Var7 != null) {
                    t2Var7.invalidate();
                    return;
                }
                return;
            default:
                kg0 kg0Var8 = this.f34957b;
                kg0Var8.getClass();
                kg0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kg0Var8.F = false;
                org.telegram.ui.Cells.t2 t2Var8 = kg0Var8.H;
                if (t2Var8 != null) {
                    t2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
