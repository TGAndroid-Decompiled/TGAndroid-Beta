package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class o2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28380a;
    public final q2 f28381b;

    public o2(q2 q2Var, int i3) {
        this.f28380a = i3;
        this.f28381b = q2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i3;
        switch (this.f28380a) {
            case 0:
                q2 q2Var = this.f28381b;
                t2 t2Var = q2Var.H;
                t2Var.f28586b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                t2Var.h0();
                t2Var.q0(t2Var.f28586b.getTranslationY());
                q2Var.invalidate();
                return;
            case 1:
                t2 t2Var2 = this.f28381b.H;
                j2 j2Var = t2Var2.f28589c;
                if (j2Var != null) {
                    j2Var.invalidate();
                }
                t2Var2.h0();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2 q2Var2 = this.f28381b;
                q2Var2.E = floatValue;
                t2 t2Var3 = q2Var2.H;
                t2Var3.f28586b.setTranslationX(floatValue);
                t2Var3.f28589c.invalidate();
                return;
            case 3:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2 q2Var3 = this.f28381b;
                q2Var3.E = floatValue2;
                t2 t2Var4 = q2Var3.H;
                t2Var4.f28586b.setTranslationX(floatValue2);
                t2Var4.f28589c.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2 t2Var5 = this.f28381b.H;
                s2 s2Var = t2Var5.Z;
                if (t2Var5.f28611p0) {
                    i3 = (int) (t2Var5.f28612q0 * floatValue3);
                } else {
                    i3 = 0;
                }
                s2Var.setAlpha(i3);
                return;
        }
    }
}
