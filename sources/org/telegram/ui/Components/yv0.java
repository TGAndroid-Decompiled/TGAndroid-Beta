package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class yv0 implements ValueAnimator.AnimatorUpdateListener {

    public final int f34966a;

    public final bw0 f34967b;

    public yv0(bw0 bw0Var, int i10) {
        this.f34966a = i10;
        this.f34967b = bw0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34966a) {
            case 0:
                bw0 bw0Var = this.f34967b;
                bw0Var.getClass();
                bw0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bw0Var.invalidate();
                break;
            case 1:
                bw0 bw0Var2 = this.f34967b;
                bw0Var2.getClass();
                bw0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                bw0 bw0Var3 = this.f34967b;
                bw0Var3.getClass();
                bw0Var3.f27220y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bw0Var3.invalidate();
                break;
        }
    }
}
