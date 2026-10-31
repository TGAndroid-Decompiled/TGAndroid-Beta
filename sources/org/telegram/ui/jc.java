package org.telegram.ui;

import android.animation.ValueAnimator;
public final class jc implements ValueAnimator.AnimatorUpdateListener {
    public final int f38487a;
    public boolean f38488b = false;
    public final org.telegram.messenger.us f38489c;

    public jc(org.telegram.messenger.us usVar, int i10) {
        this.f38487a = i10;
        this.f38489c = usVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38487a) {
            case 0:
                zc zcVar = (zc) this.f38489c;
                zcVar.f44103n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zcVar.m0.invalidate();
                if (!this.f38488b && zcVar.f44103n0 > 0.5f) {
                    this.f38488b = true;
                    return;
                }
                return;
            case 1:
                tn0 tn0Var = (tn0) this.f38489c;
                tn0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tn0Var.X.invalidate();
                if (!this.f38488b && tn0Var.Y > 0.5f) {
                    this.f38488b = true;
                    return;
                }
                return;
            case 2:
                m91 m91Var = (m91) this.f38489c;
                m91Var.f39569j2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m91Var.f39566i2.invalidate();
                if (!this.f38488b && m91Var.f39569j2 > 0.5f) {
                    this.f38488b = true;
                    return;
                }
                return;
            default:
                vh.o8 o8Var = (vh.o8) this.f38489c;
                o8Var.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vh.y7 y7Var = o8Var.C2;
                if (y7Var != null) {
                    y7Var.invalidate();
                }
                if (!this.f38488b && o8Var.D2 > 0.5f) {
                    this.f38488b = true;
                    return;
                }
                return;
        }
    }
}
