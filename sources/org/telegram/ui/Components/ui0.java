package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ui0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28868a;
    public final wi0 f28869b;

    public ui0(wi0 wi0Var, int i10) {
        this.f28868a = i10;
        this.f28869b = wi0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28868a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wi0 wi0Var = this.f28869b;
                wi0Var.v = floatValue;
                org.telegram.ui.Cells.s2 s2Var = wi0Var.H;
                if (s2Var != null) {
                    s2Var.invalidate();
                }
                zl0 zl0Var = wi0Var.I;
                if (zl0Var != null) {
                    zl0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wi0 wi0Var2 = this.f28869b;
                wi0Var2.f29990w = floatValue2;
                org.telegram.ui.Cells.s2 s2Var2 = wi0Var2.H;
                if (s2Var2 != null) {
                    s2Var2.invalidate();
                }
                zl0 zl0Var2 = wi0Var2.I;
                if (zl0Var2 != null) {
                    zl0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wi0 wi0Var3 = this.f28869b;
                wi0Var3.f29984p = floatValue3;
                org.telegram.ui.Cells.s2 s2Var3 = wi0Var3.H;
                if (s2Var3 != null) {
                    s2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wi0 wi0Var4 = this.f28869b;
                wi0Var4.f29983o = floatValue4;
                org.telegram.ui.Cells.s2 s2Var4 = wi0Var4.H;
                if (s2Var4 != null) {
                    s2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wi0 wi0Var5 = this.f28869b;
                wi0Var5.f29991x = floatValue5;
                org.telegram.ui.Cells.s2 s2Var5 = wi0Var5.H;
                if (s2Var5 != null) {
                    s2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                wi0 wi0Var6 = this.f28869b;
                wi0Var6.getClass();
                wi0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.s2 s2Var6 = wi0Var6.H;
                if (s2Var6 != null) {
                    s2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                wi0 wi0Var7 = this.f28869b;
                wi0Var7.getClass();
                wi0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wi0Var7.F = true;
                org.telegram.ui.Cells.s2 s2Var7 = wi0Var7.H;
                if (s2Var7 != null) {
                    s2Var7.invalidate();
                    return;
                }
                return;
            default:
                wi0 wi0Var8 = this.f28869b;
                wi0Var8.getClass();
                wi0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wi0Var8.F = false;
                org.telegram.ui.Cells.s2 s2Var8 = wi0Var8.H;
                if (s2Var8 != null) {
                    s2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
