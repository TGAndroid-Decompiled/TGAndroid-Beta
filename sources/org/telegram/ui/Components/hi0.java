package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class hi0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24672a;
    public final ji0 f24673b;

    public hi0(ji0 ji0Var, int i10) {
        this.f24672a = i10;
        this.f24673b = ji0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24672a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ji0 ji0Var = this.f24673b;
                ji0Var.v = floatValue;
                org.telegram.ui.Cells.r2 r2Var = ji0Var.H;
                if (r2Var != null) {
                    r2Var.invalidate();
                }
                ml0 ml0Var = ji0Var.I;
                if (ml0Var != null) {
                    ml0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ji0 ji0Var2 = this.f24673b;
                ji0Var2.f25299w = floatValue2;
                org.telegram.ui.Cells.r2 r2Var2 = ji0Var2.H;
                if (r2Var2 != null) {
                    r2Var2.invalidate();
                }
                ml0 ml0Var2 = ji0Var2.I;
                if (ml0Var2 != null) {
                    ml0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ji0 ji0Var3 = this.f24673b;
                ji0Var3.f25293p = floatValue3;
                org.telegram.ui.Cells.r2 r2Var3 = ji0Var3.H;
                if (r2Var3 != null) {
                    r2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ji0 ji0Var4 = this.f24673b;
                ji0Var4.f25292o = floatValue4;
                org.telegram.ui.Cells.r2 r2Var4 = ji0Var4.H;
                if (r2Var4 != null) {
                    r2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ji0 ji0Var5 = this.f24673b;
                ji0Var5.f25300x = floatValue5;
                org.telegram.ui.Cells.r2 r2Var5 = ji0Var5.H;
                if (r2Var5 != null) {
                    r2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                ji0 ji0Var6 = this.f24673b;
                ji0Var6.getClass();
                ji0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.r2 r2Var6 = ji0Var6.H;
                if (r2Var6 != null) {
                    r2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                ji0 ji0Var7 = this.f24673b;
                ji0Var7.getClass();
                ji0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ji0Var7.F = true;
                org.telegram.ui.Cells.r2 r2Var7 = ji0Var7.H;
                if (r2Var7 != null) {
                    r2Var7.invalidate();
                    return;
                }
                return;
            default:
                ji0 ji0Var8 = this.f24673b;
                ji0Var8.getClass();
                ji0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ji0Var8.F = false;
                org.telegram.ui.Cells.r2 r2Var8 = ji0Var8.H;
                if (r2Var8 != null) {
                    r2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
