package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class kg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35339a;
    public final lg0 f35340b;

    public kg0(lg0 lg0Var, int i7) {
        this.f35339a = i7;
        this.f35340b = lg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35339a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lg0 lg0Var = this.f35340b;
                lg0Var.v = floatValue;
                org.telegram.ui.Cells.t2 t2Var = lg0Var.H;
                if (t2Var != null) {
                    t2Var.invalidate();
                }
                qj0 qj0Var = lg0Var.I;
                if (qj0Var != null) {
                    qj0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lg0 lg0Var2 = this.f35340b;
                lg0Var2.f35742w = floatValue2;
                org.telegram.ui.Cells.t2 t2Var2 = lg0Var2.H;
                if (t2Var2 != null) {
                    t2Var2.invalidate();
                }
                qj0 qj0Var2 = lg0Var2.I;
                if (qj0Var2 != null) {
                    qj0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lg0 lg0Var3 = this.f35340b;
                lg0Var3.f35736p = floatValue3;
                org.telegram.ui.Cells.t2 t2Var3 = lg0Var3.H;
                if (t2Var3 != null) {
                    t2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lg0 lg0Var4 = this.f35340b;
                lg0Var4.f35735o = floatValue4;
                org.telegram.ui.Cells.t2 t2Var4 = lg0Var4.H;
                if (t2Var4 != null) {
                    t2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lg0 lg0Var5 = this.f35340b;
                lg0Var5.f35743x = floatValue5;
                org.telegram.ui.Cells.t2 t2Var5 = lg0Var5.H;
                if (t2Var5 != null) {
                    t2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                lg0 lg0Var6 = this.f35340b;
                lg0Var6.getClass();
                lg0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.t2 t2Var6 = lg0Var6.H;
                if (t2Var6 != null) {
                    t2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                lg0 lg0Var7 = this.f35340b;
                lg0Var7.getClass();
                lg0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lg0Var7.F = true;
                org.telegram.ui.Cells.t2 t2Var7 = lg0Var7.H;
                if (t2Var7 != null) {
                    t2Var7.invalidate();
                    return;
                }
                return;
            default:
                lg0 lg0Var8 = this.f35340b;
                lg0Var8.getClass();
                lg0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lg0Var8.F = false;
                org.telegram.ui.Cells.t2 t2Var8 = lg0Var8.H;
                if (t2Var8 != null) {
                    t2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
