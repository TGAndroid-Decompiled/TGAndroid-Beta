package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class oj0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29225a;
    public final qj0 f29226b;

    public oj0(qj0 qj0Var, int i10) {
        this.f29225a = i10;
        this.f29226b = qj0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29225a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qj0 qj0Var = this.f29226b;
                qj0Var.v = floatValue;
                org.telegram.ui.Cells.s2 s2Var = qj0Var.H;
                if (s2Var != null) {
                    s2Var.invalidate();
                }
                wm0 wm0Var = qj0Var.I;
                if (wm0Var != null) {
                    wm0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qj0 qj0Var2 = this.f29226b;
                qj0Var2.f29847w = floatValue2;
                org.telegram.ui.Cells.s2 s2Var2 = qj0Var2.H;
                if (s2Var2 != null) {
                    s2Var2.invalidate();
                }
                wm0 wm0Var2 = qj0Var2.I;
                if (wm0Var2 != null) {
                    wm0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qj0 qj0Var3 = this.f29226b;
                qj0Var3.f29841p = floatValue3;
                org.telegram.ui.Cells.s2 s2Var3 = qj0Var3.H;
                if (s2Var3 != null) {
                    s2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qj0 qj0Var4 = this.f29226b;
                qj0Var4.f29840o = floatValue4;
                org.telegram.ui.Cells.s2 s2Var4 = qj0Var4.H;
                if (s2Var4 != null) {
                    s2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qj0 qj0Var5 = this.f29226b;
                qj0Var5.f29848x = floatValue5;
                org.telegram.ui.Cells.s2 s2Var5 = qj0Var5.H;
                if (s2Var5 != null) {
                    s2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                qj0 qj0Var6 = this.f29226b;
                qj0Var6.getClass();
                qj0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.s2 s2Var6 = qj0Var6.H;
                if (s2Var6 != null) {
                    s2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                qj0 qj0Var7 = this.f29226b;
                qj0Var7.getClass();
                qj0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qj0Var7.F = true;
                org.telegram.ui.Cells.s2 s2Var7 = qj0Var7.H;
                if (s2Var7 != null) {
                    s2Var7.invalidate();
                    return;
                }
                return;
            default:
                qj0 qj0Var8 = this.f29226b;
                qj0Var8.getClass();
                qj0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qj0Var8.F = false;
                org.telegram.ui.Cells.s2 s2Var8 = qj0Var8.H;
                if (s2Var8 != null) {
                    s2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
