package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class gj0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28593a;
    public final ij0 f28594b;

    public gj0(ij0 ij0Var, int i10) {
        this.f28593a = i10;
        this.f28594b = ij0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28593a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ij0 ij0Var = this.f28594b;
                ij0Var.v = floatValue;
                org.telegram.ui.Cells.p2 p2Var = ij0Var.H;
                if (p2Var != null) {
                    p2Var.invalidate();
                }
                nm0 nm0Var = ij0Var.I;
                if (nm0Var != null) {
                    nm0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ij0 ij0Var2 = this.f28594b;
                ij0Var2.f29368w = floatValue2;
                org.telegram.ui.Cells.p2 p2Var2 = ij0Var2.H;
                if (p2Var2 != null) {
                    p2Var2.invalidate();
                }
                nm0 nm0Var2 = ij0Var2.I;
                if (nm0Var2 != null) {
                    nm0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ij0 ij0Var3 = this.f28594b;
                ij0Var3.f29362p = floatValue3;
                org.telegram.ui.Cells.p2 p2Var3 = ij0Var3.H;
                if (p2Var3 != null) {
                    p2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ij0 ij0Var4 = this.f28594b;
                ij0Var4.f29361o = floatValue4;
                org.telegram.ui.Cells.p2 p2Var4 = ij0Var4.H;
                if (p2Var4 != null) {
                    p2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ij0 ij0Var5 = this.f28594b;
                ij0Var5.f29369x = floatValue5;
                org.telegram.ui.Cells.p2 p2Var5 = ij0Var5.H;
                if (p2Var5 != null) {
                    p2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                ij0 ij0Var6 = this.f28594b;
                ij0Var6.getClass();
                ij0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.p2 p2Var6 = ij0Var6.H;
                if (p2Var6 != null) {
                    p2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                ij0 ij0Var7 = this.f28594b;
                ij0Var7.getClass();
                ij0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ij0Var7.F = true;
                org.telegram.ui.Cells.p2 p2Var7 = ij0Var7.H;
                if (p2Var7 != null) {
                    p2Var7.invalidate();
                    return;
                }
                return;
            default:
                ij0 ij0Var8 = this.f28594b;
                ij0Var8.getClass();
                ij0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ij0Var8.F = false;
                org.telegram.ui.Cells.p2 p2Var8 = ij0Var8.H;
                if (p2Var8 != null) {
                    p2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
