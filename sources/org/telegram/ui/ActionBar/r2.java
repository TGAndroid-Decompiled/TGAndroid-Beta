package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class r2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30018a;
    public final t2 f30019b;

    public r2(t2 t2Var, int i7) {
        this.f30018a = i7;
        this.f30019b = t2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        switch (this.f30018a) {
            case 0:
                t2 t2Var = this.f30019b;
                w2 w2Var = t2Var.H;
                w2Var.f30226b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                w2Var.h0();
                w2Var.q0(w2Var.f30226b.getTranslationY());
                t2Var.invalidate();
                return;
            case 1:
                w2 w2Var2 = this.f30019b.H;
                m2 m2Var = w2Var2.f30229c;
                if (m2Var != null) {
                    m2Var.invalidate();
                }
                w2Var2.h0();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2 t2Var2 = this.f30019b;
                t2Var2.E = floatValue;
                w2 w2Var3 = t2Var2.H;
                w2Var3.f30226b.setTranslationX(floatValue);
                w2Var3.f30229c.invalidate();
                return;
            case 3:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2 t2Var3 = this.f30019b;
                t2Var3.E = floatValue2;
                w2 w2Var4 = t2Var3.H;
                w2Var4.f30226b.setTranslationX(floatValue2);
                w2Var4.f30229c.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2 w2Var5 = this.f30019b.H;
                v2 v2Var = w2Var5.Z;
                if (w2Var5.f30254p0) {
                    i7 = (int) (w2Var5.f30255q0 * floatValue3);
                } else {
                    i7 = 0;
                }
                v2Var.setAlpha(i7);
                return;
        }
    }
}
