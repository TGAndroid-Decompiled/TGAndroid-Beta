package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class dj0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25511a;
    public final fj0 f25512b;

    public dj0(fj0 fj0Var, int i10) {
        this.f25511a = i10;
        this.f25512b = fj0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25511a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fj0 fj0Var = this.f25512b;
                fj0Var.v = floatValue;
                org.telegram.ui.Cells.r2 r2Var = fj0Var.H;
                if (r2Var != null) {
                    r2Var.invalidate();
                }
                jm0 jm0Var = fj0Var.I;
                if (jm0Var != null) {
                    jm0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fj0 fj0Var2 = this.f25512b;
                fj0Var2.f26269w = floatValue2;
                org.telegram.ui.Cells.r2 r2Var2 = fj0Var2.H;
                if (r2Var2 != null) {
                    r2Var2.invalidate();
                }
                jm0 jm0Var2 = fj0Var2.I;
                if (jm0Var2 != null) {
                    jm0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fj0 fj0Var3 = this.f25512b;
                fj0Var3.f26263p = floatValue3;
                org.telegram.ui.Cells.r2 r2Var3 = fj0Var3.H;
                if (r2Var3 != null) {
                    r2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fj0 fj0Var4 = this.f25512b;
                fj0Var4.f26262o = floatValue4;
                org.telegram.ui.Cells.r2 r2Var4 = fj0Var4.H;
                if (r2Var4 != null) {
                    r2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fj0 fj0Var5 = this.f25512b;
                fj0Var5.f26270x = floatValue5;
                org.telegram.ui.Cells.r2 r2Var5 = fj0Var5.H;
                if (r2Var5 != null) {
                    r2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                fj0 fj0Var6 = this.f25512b;
                fj0Var6.getClass();
                fj0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.r2 r2Var6 = fj0Var6.H;
                if (r2Var6 != null) {
                    r2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                fj0 fj0Var7 = this.f25512b;
                fj0Var7.getClass();
                fj0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fj0Var7.F = true;
                org.telegram.ui.Cells.r2 r2Var7 = fj0Var7.H;
                if (r2Var7 != null) {
                    r2Var7.invalidate();
                    return;
                }
                return;
            default:
                fj0 fj0Var8 = this.f25512b;
                fj0Var8.getClass();
                fj0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fj0Var8.F = false;
                org.telegram.ui.Cells.r2 r2Var8 = fj0Var8.H;
                if (r2Var8 != null) {
                    r2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
