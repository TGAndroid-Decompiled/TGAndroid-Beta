package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class o2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31637a;
    public final r2 f31638b;

    public o2(r2 r2Var, int i10) {
        this.f31637a = i10;
        this.f31638b = r2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31637a) {
            case 0:
                r2 r2Var = this.f31638b;
                r2Var.getClass();
                r2Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var.invalidate();
                return;
            case 1:
                r2 r2Var2 = this.f31638b;
                r2Var2.getClass();
                r2Var2.f31710x = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                r2Var2.invalidate();
                return;
            case 2:
                r2 r2Var3 = this.f31638b;
                r2Var3.getClass();
                r2Var3.f31708s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                r2Var3.invalidate();
                return;
            default:
                r2 r2Var4 = this.f31638b;
                r2Var4.getClass();
                r2Var4.f31707r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                r2Var4.invalidate();
                return;
        }
    }
}
