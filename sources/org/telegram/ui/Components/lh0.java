package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class lh0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28113a;
    public final mh0 f28114b;

    public lh0(mh0 mh0Var, int i10) {
        this.f28113a = i10;
        this.f28114b = mh0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28113a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mh0 mh0Var = this.f28114b;
                mh0Var.v = floatValue;
                org.telegram.ui.Cells.v2 v2Var = mh0Var.H;
                if (v2Var != null) {
                    v2Var.invalidate();
                }
                tk0 tk0Var = mh0Var.I;
                if (tk0Var != null) {
                    tk0Var.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mh0 mh0Var2 = this.f28114b;
                mh0Var2.f28471w = floatValue2;
                org.telegram.ui.Cells.v2 v2Var2 = mh0Var2.H;
                if (v2Var2 != null) {
                    v2Var2.invalidate();
                }
                tk0 tk0Var2 = mh0Var2.I;
                if (tk0Var2 != null) {
                    tk0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mh0 mh0Var3 = this.f28114b;
                mh0Var3.f28465p = floatValue3;
                org.telegram.ui.Cells.v2 v2Var3 = mh0Var3.H;
                if (v2Var3 != null) {
                    v2Var3.invalidate();
                    return;
                }
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mh0 mh0Var4 = this.f28114b;
                mh0Var4.f28464o = floatValue4;
                org.telegram.ui.Cells.v2 v2Var4 = mh0Var4.H;
                if (v2Var4 != null) {
                    v2Var4.invalidate();
                    return;
                }
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mh0 mh0Var5 = this.f28114b;
                mh0Var5.f28472x = floatValue5;
                org.telegram.ui.Cells.v2 v2Var5 = mh0Var5.H;
                if (v2Var5 != null) {
                    v2Var5.invalidate();
                    return;
                }
                return;
            case 5:
                mh0 mh0Var6 = this.f28114b;
                mh0Var6.getClass();
                mh0Var6.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                org.telegram.ui.Cells.v2 v2Var6 = mh0Var6.H;
                if (v2Var6 != null) {
                    v2Var6.invalidate();
                    return;
                }
                return;
            case 6:
                mh0 mh0Var7 = this.f28114b;
                mh0Var7.getClass();
                mh0Var7.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mh0Var7.F = true;
                org.telegram.ui.Cells.v2 v2Var7 = mh0Var7.H;
                if (v2Var7 != null) {
                    v2Var7.invalidate();
                    return;
                }
                return;
            default:
                mh0 mh0Var8 = this.f28114b;
                mh0Var8.getClass();
                mh0Var8.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mh0Var8.F = false;
                org.telegram.ui.Cells.v2 v2Var8 = mh0Var8.H;
                if (v2Var8 != null) {
                    v2Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
