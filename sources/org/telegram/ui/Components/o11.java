package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class o11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27496a;
    public final p11 f27497b;

    public o11(p11 p11Var, int i10) {
        this.f27496a = i10;
        this.f27497b = p11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27496a) {
            case 0:
                p11 p11Var = this.f27497b;
                p11Var.getClass();
                p11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p11Var.invalidate();
                return;
            case 1:
                p11 p11Var2 = this.f27497b;
                p11Var2.getClass();
                p11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p11Var2.invalidate();
                return;
            case 2:
                p11 p11Var3 = this.f27497b;
                p11Var3.getClass();
                p11Var3.f27822f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p11Var3.invalidate();
                return;
            case 3:
                p11 p11Var4 = this.f27497b;
                p11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p11Var4.f27825s = floatValue;
                p11Var4.f27826w = (int) ((p11Var4.h * floatValue) + 0);
                p11Var4.invalidate();
                return;
            default:
                p11 p11Var5 = this.f27497b;
                p11Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p11Var5.v = floatValue2;
                int i10 = p11Var5.f27824r;
                p11Var5.f27827x = i10 + ((int) Math.ceil((p11Var5.f27823n - i10) * floatValue2));
                p11Var5.invalidate();
                return;
        }
    }
}
