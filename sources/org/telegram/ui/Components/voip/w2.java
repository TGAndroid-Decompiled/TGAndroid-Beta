package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class w2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41307a;
    public final y2 f41308b;

    public w2(y2 y2Var, int i7) {
        this.f41307a = i7;
        this.f41308b = y2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41307a) {
            case 0:
                y2 y2Var = this.f41308b;
                y2Var.getClass();
                y2Var.I = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                y2Var.invalidate();
                y2Var.U.c();
                return;
            case 1:
                y2 y2Var2 = this.f41308b;
                y2Var2.getClass();
                y2Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y2Var2.invalidate();
                y2Var2.U.c();
                return;
            case 2:
                y2 y2Var3 = this.f41308b;
                y2Var3.getClass();
                y2Var3.I = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                y2Var3.invalidate();
                y2Var3.U.c();
                return;
            case 3:
                y2 y2Var4 = this.f41308b;
                y2Var4.getClass();
                y2Var4.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                y2Var4.invalidate();
                return;
            case 4:
                y2 y2Var5 = this.f41308b;
                y2Var5.getClass();
                y2Var5.G = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                y2Var5.invalidate();
                return;
            default:
                y2 y2Var6 = this.f41308b;
                y2Var6.getClass();
                y2Var6.F = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                y2Var6.invalidate();
                return;
        }
    }
}
