package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class uh0 implements ValueAnimator.AnimatorUpdateListener {

    public final int f33084a;

    public final wh0 f33085b;

    public uh0(wh0 wh0Var, int i10) {
        this.f33084a = i10;
        this.f33085b = wh0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33084a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wh0 wh0Var = this.f33085b;
                wh0Var.v = fFloatValue;
                org.telegram.ui.Cells.p2 p2Var = wh0Var.H;
                if (p2Var != null) {
                    p2Var.invalidate();
                }
                zk0 zk0Var = wh0Var.I;
                if (zk0Var != null) {
                    zk0Var.invalidate();
                }
                break;
            case 1:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wh0 wh0Var2 = this.f33085b;
                wh0Var2.f34207w = fFloatValue2;
                org.telegram.ui.Cells.p2 p2Var2 = wh0Var2.H;
                if (p2Var2 != null) {
                    p2Var2.invalidate();
                }
                zk0 zk0Var2 = wh0Var2.I;
                if (zk0Var2 != null) {
                    zk0Var2.invalidate();
                }
                break;
            case 2:
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wh0 wh0Var3 = this.f33085b;
                wh0Var3.f34201p = fFloatValue3;
                org.telegram.ui.Cells.p2 p2Var3 = wh0Var3.H;
                if (p2Var3 != null) {
                    p2Var3.invalidate();
                }
                break;
            case 3:
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wh0 wh0Var4 = this.f33085b;
                wh0Var4.f34200o = fFloatValue4;
                org.telegram.ui.Cells.p2 p2Var4 = wh0Var4.H;
                if (p2Var4 != null) {
                    p2Var4.invalidate();
                }
                break;
            case 4:
                float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wh0 wh0Var5 = this.f33085b;
                wh0Var5.f34208x = fFloatValue5;
                org.telegram.ui.Cells.p2 p2Var5 = wh0Var5.H;
                if (p2Var5 != null) {
                    p2Var5.invalidate();
                }
                break;
            case 5:
                wh0 wh0Var6 = this.f33085b;
                wh0Var6.getClass();
                wh0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.p2 p2Var6 = wh0Var6.H;
                if (p2Var6 != null) {
                    p2Var6.invalidate();
                }
                break;
            case 6:
                wh0 wh0Var7 = this.f33085b;
                wh0Var7.getClass();
                wh0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wh0Var7.F = true;
                org.telegram.ui.Cells.p2 p2Var7 = wh0Var7.H;
                if (p2Var7 != null) {
                    p2Var7.invalidate();
                }
                break;
            default:
                wh0 wh0Var8 = this.f33085b;
                wh0Var8.getClass();
                wh0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wh0Var8.F = false;
                org.telegram.ui.Cells.p2 p2Var8 = wh0Var8.H;
                if (p2Var8 != null) {
                    p2Var8.invalidate();
                }
                break;
        }
    }
}
