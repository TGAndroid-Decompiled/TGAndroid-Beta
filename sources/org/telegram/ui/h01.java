package org.telegram.ui;

import android.animation.ValueAnimator;
public final class h01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37611a;
    public final k01 f37612b;

    public h01(k01 k01Var, int i10) {
        this.f37611a = i10;
        this.f37612b = k01Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37611a) {
            case 0:
                k01 k01Var = this.f37612b;
                k01Var.getClass();
                k01Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k01Var.g();
                return;
            case 1:
                k01 k01Var2 = this.f37612b;
                k01Var2.getClass();
                k01Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k01Var2.g();
                return;
            default:
                k01 k01Var3 = this.f37612b;
                k01Var3.getClass();
                k01Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k01Var3.g();
                return;
        }
    }
}
