package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class mh0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28477a;
    public final nh0 f28478b;

    public mh0(nh0 nh0Var, int i10) {
        this.f28477a = i10;
        this.f28478b = nh0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28477a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nh0 nh0Var = this.f28478b;
                nh0Var.v = floatValue;
                org.telegram.ui.Cells.v2 v2Var = nh0Var.H;
                if (v2Var != null) {
                    v2Var.invalidate();
                }
                uk0 uk0Var = nh0Var.I;
                if (uk0Var != null) {
                    uk0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nh0 nh0Var2 = this.f28478b;
                nh0Var2.f28850w = floatValue2;
                org.telegram.ui.Cells.v2 v2Var2 = nh0Var2.H;
                if (v2Var2 != null) {
                    v2Var2.invalidate();
                }
                uk0 uk0Var2 = nh0Var2.I;
                if (uk0Var2 != null) {
                    uk0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nh0 nh0Var3 = this.f28478b;
                nh0Var3.f28844p = floatValue3;
                org.telegram.ui.Cells.v2 v2Var3 = nh0Var3.H;
                if (v2Var3 != null) {
                    v2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nh0 nh0Var4 = this.f28478b;
                nh0Var4.f28843o = floatValue4;
                org.telegram.ui.Cells.v2 v2Var4 = nh0Var4.H;
                if (v2Var4 != null) {
                    v2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nh0 nh0Var5 = this.f28478b;
                nh0Var5.f28851x = floatValue5;
                org.telegram.ui.Cells.v2 v2Var5 = nh0Var5.H;
                if (v2Var5 != null) {
                    v2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                nh0 nh0Var6 = this.f28478b;
                nh0Var6.getClass();
                nh0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.v2 v2Var6 = nh0Var6.H;
                if (v2Var6 != null) {
                    v2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                nh0 nh0Var7 = this.f28478b;
                nh0Var7.getClass();
                nh0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nh0Var7.F = true;
                org.telegram.ui.Cells.v2 v2Var7 = nh0Var7.H;
                if (v2Var7 != null) {
                    v2Var7.invalidate();
                    return;
                }
                return;
            default:
                nh0 nh0Var8 = this.f28478b;
                nh0Var8.getClass();
                nh0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nh0Var8.F = false;
                org.telegram.ui.Cells.v2 v2Var8 = nh0Var8.H;
                if (v2Var8 != null) {
                    v2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
