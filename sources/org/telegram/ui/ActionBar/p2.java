package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class p2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29468a;
    public final r2 f29469b;

    public p2(r2 r2Var, int i7) {
        this.f29468a = i7;
        this.f29469b = r2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        switch (this.f29468a) {
            case 0:
                r2 r2Var = this.f29469b;
                u2 u2Var = r2Var.H;
                u2Var.f29682b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                u2Var.h0();
                u2Var.q0(u2Var.f29682b.getTranslationY());
                r2Var.invalidate();
                return;
            case 1:
                u2 u2Var2 = this.f29469b.H;
                k2 k2Var = u2Var2.f29685c;
                if (k2Var != null) {
                    k2Var.invalidate();
                }
                u2Var2.h0();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2 r2Var2 = this.f29469b;
                r2Var2.E = floatValue;
                u2 u2Var3 = r2Var2.H;
                u2Var3.f29682b.setTranslationX(floatValue);
                u2Var3.f29685c.invalidate();
                return;
            case 3:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2 r2Var3 = this.f29469b;
                r2Var3.E = floatValue2;
                u2 u2Var4 = r2Var3.H;
                u2Var4.f29682b.setTranslationX(floatValue2);
                u2Var4.f29685c.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2 u2Var5 = this.f29469b.H;
                t2 t2Var = u2Var5.Z;
                if (u2Var5.f29710p0) {
                    i7 = (int) (u2Var5.f29711q0 * floatValue3);
                } else {
                    i7 = 0;
                }
                t2Var.setAlpha(i7);
                return;
        }
    }
}
