package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class oi0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27574a;
    public final qi0 f27575b;

    public oi0(qi0 qi0Var, int i10) {
        this.f27574a = i10;
        this.f27575b = qi0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27574a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qi0 qi0Var = this.f27575b;
                qi0Var.v = floatValue;
                org.telegram.ui.Cells.q2 q2Var = qi0Var.H;
                if (q2Var != null) {
                    q2Var.invalidate();
                }
                rl0 rl0Var = qi0Var.I;
                if (rl0Var != null) {
                    rl0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qi0 qi0Var2 = this.f27575b;
                qi0Var2.f28188w = floatValue2;
                org.telegram.ui.Cells.q2 q2Var2 = qi0Var2.H;
                if (q2Var2 != null) {
                    q2Var2.invalidate();
                }
                rl0 rl0Var2 = qi0Var2.I;
                if (rl0Var2 != null) {
                    rl0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qi0 qi0Var3 = this.f27575b;
                qi0Var3.f28182p = floatValue3;
                org.telegram.ui.Cells.q2 q2Var3 = qi0Var3.H;
                if (q2Var3 != null) {
                    q2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qi0 qi0Var4 = this.f27575b;
                qi0Var4.f28181o = floatValue4;
                org.telegram.ui.Cells.q2 q2Var4 = qi0Var4.H;
                if (q2Var4 != null) {
                    q2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qi0 qi0Var5 = this.f27575b;
                qi0Var5.f28189x = floatValue5;
                org.telegram.ui.Cells.q2 q2Var5 = qi0Var5.H;
                if (q2Var5 != null) {
                    q2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                qi0 qi0Var6 = this.f27575b;
                qi0Var6.getClass();
                qi0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.q2 q2Var6 = qi0Var6.H;
                if (q2Var6 != null) {
                    q2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                qi0 qi0Var7 = this.f27575b;
                qi0Var7.getClass();
                qi0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qi0Var7.F = true;
                org.telegram.ui.Cells.q2 q2Var7 = qi0Var7.H;
                if (q2Var7 != null) {
                    q2Var7.invalidate();
                    return;
                }
                return;
            default:
                qi0 qi0Var8 = this.f27575b;
                qi0Var8.getClass();
                qi0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qi0Var8.F = false;
                org.telegram.ui.Cells.q2 q2Var8 = qi0Var8.H;
                if (q2Var8 != null) {
                    q2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
