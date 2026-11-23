package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class r2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29922a;
    public final t2 f29923b;

    public r2(t2 t2Var, int i7) {
        this.f29922a = i7;
        this.f29923b = t2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        switch (this.f29922a) {
            case 0:
                t2 t2Var = this.f29923b;
                w2 w2Var = t2Var.H;
                w2Var.f30142b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                w2Var.h0();
                w2Var.q0(w2Var.f30142b.getTranslationY());
                t2Var.invalidate();
                return;
            case 1:
                w2 w2Var2 = this.f29923b.H;
                m2 m2Var = w2Var2.f30145c;
                if (m2Var != null) {
                    m2Var.invalidate();
                }
                w2Var2.h0();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2 t2Var2 = this.f29923b;
                t2Var2.E = floatValue;
                w2 w2Var3 = t2Var2.H;
                w2Var3.f30142b.setTranslationX(floatValue);
                w2Var3.f30145c.invalidate();
                return;
            case 3:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2 t2Var3 = this.f29923b;
                t2Var3.E = floatValue2;
                w2 w2Var4 = t2Var3.H;
                w2Var4.f30142b.setTranslationX(floatValue2);
                w2Var4.f30145c.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2 w2Var5 = this.f29923b.H;
                v2 v2Var = w2Var5.Z;
                if (w2Var5.f30170p0) {
                    i7 = (int) (w2Var5.f30171q0 * floatValue3);
                } else {
                    i7 = 0;
                }
                v2Var.setAlpha(i7);
                return;
        }
    }
}
