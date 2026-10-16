package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class hj0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25341a;
    public final jj0 f25342b;

    public hj0(jj0 jj0Var, int i10) {
        this.f25341a = i10;
        this.f25342b = jj0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25341a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jj0 jj0Var = this.f25342b;
                jj0Var.v = floatValue;
                org.telegram.ui.Cells.s2 s2Var = jj0Var.H;
                if (s2Var != null) {
                    s2Var.invalidate();
                }
                mm0 mm0Var = jj0Var.I;
                if (mm0Var != null) {
                    mm0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jj0 jj0Var2 = this.f25342b;
                jj0Var2.f26062w = floatValue2;
                org.telegram.ui.Cells.s2 s2Var2 = jj0Var2.H;
                if (s2Var2 != null) {
                    s2Var2.invalidate();
                }
                mm0 mm0Var2 = jj0Var2.I;
                if (mm0Var2 != null) {
                    mm0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jj0 jj0Var3 = this.f25342b;
                jj0Var3.f26056p = floatValue3;
                org.telegram.ui.Cells.s2 s2Var3 = jj0Var3.H;
                if (s2Var3 != null) {
                    s2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jj0 jj0Var4 = this.f25342b;
                jj0Var4.f26055o = floatValue4;
                org.telegram.ui.Cells.s2 s2Var4 = jj0Var4.H;
                if (s2Var4 != null) {
                    s2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jj0 jj0Var5 = this.f25342b;
                jj0Var5.f26063x = floatValue5;
                org.telegram.ui.Cells.s2 s2Var5 = jj0Var5.H;
                if (s2Var5 != null) {
                    s2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                jj0 jj0Var6 = this.f25342b;
                jj0Var6.getClass();
                jj0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.s2 s2Var6 = jj0Var6.H;
                if (s2Var6 != null) {
                    s2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                jj0 jj0Var7 = this.f25342b;
                jj0Var7.getClass();
                jj0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jj0Var7.F = true;
                org.telegram.ui.Cells.s2 s2Var7 = jj0Var7.H;
                if (s2Var7 != null) {
                    s2Var7.invalidate();
                    return;
                }
                return;
            default:
                jj0 jj0Var8 = this.f25342b;
                jj0Var8.getClass();
                jj0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jj0Var8.F = false;
                org.telegram.ui.Cells.s2 s2Var8 = jj0Var8.H;
                if (s2Var8 != null) {
                    s2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
