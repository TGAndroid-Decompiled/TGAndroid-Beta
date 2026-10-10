package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class mj0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28823a;
    public final oj0 f28824b;

    public mj0(oj0 oj0Var, int i10) {
        this.f28823a = i10;
        this.f28824b = oj0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28823a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oj0 oj0Var = this.f28824b;
                oj0Var.v = floatValue;
                org.telegram.ui.Cells.s2 s2Var = oj0Var.H;
                if (s2Var != null) {
                    s2Var.invalidate();
                }
                rm0 rm0Var = oj0Var.I;
                if (rm0Var != null) {
                    rm0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oj0 oj0Var2 = this.f28824b;
                oj0Var2.f29505w = floatValue2;
                org.telegram.ui.Cells.s2 s2Var2 = oj0Var2.H;
                if (s2Var2 != null) {
                    s2Var2.invalidate();
                }
                rm0 rm0Var2 = oj0Var2.I;
                if (rm0Var2 != null) {
                    rm0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oj0 oj0Var3 = this.f28824b;
                oj0Var3.f29499p = floatValue3;
                org.telegram.ui.Cells.s2 s2Var3 = oj0Var3.H;
                if (s2Var3 != null) {
                    s2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oj0 oj0Var4 = this.f28824b;
                oj0Var4.f29498o = floatValue4;
                org.telegram.ui.Cells.s2 s2Var4 = oj0Var4.H;
                if (s2Var4 != null) {
                    s2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oj0 oj0Var5 = this.f28824b;
                oj0Var5.f29506x = floatValue5;
                org.telegram.ui.Cells.s2 s2Var5 = oj0Var5.H;
                if (s2Var5 != null) {
                    s2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                oj0 oj0Var6 = this.f28824b;
                oj0Var6.getClass();
                oj0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.s2 s2Var6 = oj0Var6.H;
                if (s2Var6 != null) {
                    s2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                oj0 oj0Var7 = this.f28824b;
                oj0Var7.getClass();
                oj0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oj0Var7.F = true;
                org.telegram.ui.Cells.s2 s2Var7 = oj0Var7.H;
                if (s2Var7 != null) {
                    s2Var7.invalidate();
                    return;
                }
                return;
            default:
                oj0 oj0Var8 = this.f28824b;
                oj0Var8.getClass();
                oj0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oj0Var8.F = false;
                org.telegram.ui.Cells.s2 s2Var8 = oj0Var8.H;
                if (s2Var8 != null) {
                    s2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
