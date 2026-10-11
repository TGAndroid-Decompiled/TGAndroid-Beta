package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class nj0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29065a;
    public final pj0 f29066b;

    public nj0(pj0 pj0Var, int i10) {
        this.f29065a = i10;
        this.f29066b = pj0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29065a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pj0 pj0Var = this.f29066b;
                pj0Var.v = floatValue;
                org.telegram.ui.Cells.s2 s2Var = pj0Var.H;
                if (s2Var != null) {
                    s2Var.invalidate();
                }
                sm0 sm0Var = pj0Var.I;
                if (sm0Var != null) {
                    sm0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pj0 pj0Var2 = this.f29066b;
                pj0Var2.f29757w = floatValue2;
                org.telegram.ui.Cells.s2 s2Var2 = pj0Var2.H;
                if (s2Var2 != null) {
                    s2Var2.invalidate();
                }
                sm0 sm0Var2 = pj0Var2.I;
                if (sm0Var2 != null) {
                    sm0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pj0 pj0Var3 = this.f29066b;
                pj0Var3.f29751p = floatValue3;
                org.telegram.ui.Cells.s2 s2Var3 = pj0Var3.H;
                if (s2Var3 != null) {
                    s2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pj0 pj0Var4 = this.f29066b;
                pj0Var4.f29750o = floatValue4;
                org.telegram.ui.Cells.s2 s2Var4 = pj0Var4.H;
                if (s2Var4 != null) {
                    s2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pj0 pj0Var5 = this.f29066b;
                pj0Var5.f29758x = floatValue5;
                org.telegram.ui.Cells.s2 s2Var5 = pj0Var5.H;
                if (s2Var5 != null) {
                    s2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                pj0 pj0Var6 = this.f29066b;
                pj0Var6.getClass();
                pj0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.s2 s2Var6 = pj0Var6.H;
                if (s2Var6 != null) {
                    s2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                pj0 pj0Var7 = this.f29066b;
                pj0Var7.getClass();
                pj0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pj0Var7.F = true;
                org.telegram.ui.Cells.s2 s2Var7 = pj0Var7.H;
                if (s2Var7 != null) {
                    s2Var7.invalidate();
                    return;
                }
                return;
            default:
                pj0 pj0Var8 = this.f29066b;
                pj0Var8.getClass();
                pj0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pj0Var8.F = false;
                org.telegram.ui.Cells.s2 s2Var8 = pj0Var8.H;
                if (s2Var8 != null) {
                    s2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
