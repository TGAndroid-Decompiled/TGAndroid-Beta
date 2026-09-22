package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ti0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28474a;
    public final vi0 f28475b;

    public ti0(vi0 vi0Var, int i10) {
        this.f28474a = i10;
        this.f28475b = vi0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28474a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi0 vi0Var = this.f28475b;
                vi0Var.v = floatValue;
                org.telegram.ui.Cells.s2 s2Var = vi0Var.H;
                if (s2Var != null) {
                    s2Var.invalidate();
                }
                yl0 yl0Var = vi0Var.I;
                if (yl0Var != null) {
                    yl0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi0 vi0Var2 = this.f28475b;
                vi0Var2.f29186w = floatValue2;
                org.telegram.ui.Cells.s2 s2Var2 = vi0Var2.H;
                if (s2Var2 != null) {
                    s2Var2.invalidate();
                }
                yl0 yl0Var2 = vi0Var2.I;
                if (yl0Var2 != null) {
                    yl0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi0 vi0Var3 = this.f28475b;
                vi0Var3.f29180p = floatValue3;
                org.telegram.ui.Cells.s2 s2Var3 = vi0Var3.H;
                if (s2Var3 != null) {
                    s2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi0 vi0Var4 = this.f28475b;
                vi0Var4.f29179o = floatValue4;
                org.telegram.ui.Cells.s2 s2Var4 = vi0Var4.H;
                if (s2Var4 != null) {
                    s2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi0 vi0Var5 = this.f28475b;
                vi0Var5.f29187x = floatValue5;
                org.telegram.ui.Cells.s2 s2Var5 = vi0Var5.H;
                if (s2Var5 != null) {
                    s2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                vi0 vi0Var6 = this.f28475b;
                vi0Var6.getClass();
                vi0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.s2 s2Var6 = vi0Var6.H;
                if (s2Var6 != null) {
                    s2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                vi0 vi0Var7 = this.f28475b;
                vi0Var7.getClass();
                vi0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi0Var7.F = true;
                org.telegram.ui.Cells.s2 s2Var7 = vi0Var7.H;
                if (s2Var7 != null) {
                    s2Var7.invalidate();
                    return;
                }
                return;
            default:
                vi0 vi0Var8 = this.f28475b;
                vi0Var8.getClass();
                vi0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi0Var8.F = false;
                org.telegram.ui.Cells.s2 s2Var8 = vi0Var8.H;
                if (s2Var8 != null) {
                    s2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
