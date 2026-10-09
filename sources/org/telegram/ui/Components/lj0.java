package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class lj0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28465a;
    public final nj0 f28466b;

    public lj0(nj0 nj0Var, int i10) {
        this.f28465a = i10;
        this.f28466b = nj0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28465a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nj0 nj0Var = this.f28466b;
                nj0Var.v = floatValue;
                org.telegram.ui.Cells.s2 s2Var = nj0Var.H;
                if (s2Var != null) {
                    s2Var.invalidate();
                }
                qm0 qm0Var = nj0Var.I;
                if (qm0Var != null) {
                    qm0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nj0 nj0Var2 = this.f28466b;
                nj0Var2.f29192w = floatValue2;
                org.telegram.ui.Cells.s2 s2Var2 = nj0Var2.H;
                if (s2Var2 != null) {
                    s2Var2.invalidate();
                }
                qm0 qm0Var2 = nj0Var2.I;
                if (qm0Var2 != null) {
                    qm0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nj0 nj0Var3 = this.f28466b;
                nj0Var3.f29186p = floatValue3;
                org.telegram.ui.Cells.s2 s2Var3 = nj0Var3.H;
                if (s2Var3 != null) {
                    s2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nj0 nj0Var4 = this.f28466b;
                nj0Var4.f29185o = floatValue4;
                org.telegram.ui.Cells.s2 s2Var4 = nj0Var4.H;
                if (s2Var4 != null) {
                    s2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nj0 nj0Var5 = this.f28466b;
                nj0Var5.f29193x = floatValue5;
                org.telegram.ui.Cells.s2 s2Var5 = nj0Var5.H;
                if (s2Var5 != null) {
                    s2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                nj0 nj0Var6 = this.f28466b;
                nj0Var6.getClass();
                nj0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.s2 s2Var6 = nj0Var6.H;
                if (s2Var6 != null) {
                    s2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                nj0 nj0Var7 = this.f28466b;
                nj0Var7.getClass();
                nj0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nj0Var7.F = true;
                org.telegram.ui.Cells.s2 s2Var7 = nj0Var7.H;
                if (s2Var7 != null) {
                    s2Var7.invalidate();
                    return;
                }
                return;
            default:
                nj0 nj0Var8 = this.f28466b;
                nj0Var8.getClass();
                nj0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nj0Var8.F = false;
                org.telegram.ui.Cells.s2 s2Var8 = nj0Var8.H;
                if (s2Var8 != null) {
                    s2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
