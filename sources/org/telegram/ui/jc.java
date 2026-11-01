package org.telegram.ui;

import android.animation.ValueAnimator;
public final class jc implements ValueAnimator.AnimatorUpdateListener {
    public final int f38357a;
    public boolean f38358b = false;
    public final org.telegram.messenger.vs f38359c;

    public jc(org.telegram.messenger.vs vsVar, int i10) {
        this.f38357a = i10;
        this.f38359c = vsVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38357a) {
            case 0:
                zc zcVar = (zc) this.f38359c;
                zcVar.f43906n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zcVar.m0.invalidate();
                if (!this.f38358b && zcVar.f43906n0 > 0.5f) {
                    this.f38358b = true;
                    return;
                }
                return;
            case 1:
                rn0 rn0Var = (rn0) this.f38359c;
                rn0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rn0Var.X.invalidate();
                if (!this.f38358b && rn0Var.Y > 0.5f) {
                    this.f38358b = true;
                    return;
                }
                return;
            case 2:
                k91 k91Var = (k91) this.f38359c;
                k91Var.f38744j2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k91Var.f38741i2.invalidate();
                if (!this.f38358b && k91Var.f38744j2 > 0.5f) {
                    this.f38358b = true;
                    return;
                }
                return;
            default:
                vh.o8 o8Var = (vh.o8) this.f38359c;
                o8Var.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vh.y7 y7Var = o8Var.C2;
                if (y7Var != null) {
                    y7Var.invalidate();
                }
                if (!this.f38358b && o8Var.D2 > 0.5f) {
                    this.f38358b = true;
                    return;
                }
                return;
        }
    }
}
