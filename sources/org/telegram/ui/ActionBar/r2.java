package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class r2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28463a;
    public final t2 f28464b;

    public r2(t2 t2Var, int i7) {
        this.f28463a = i7;
        this.f28464b = t2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        switch (this.f28463a) {
            case 0:
                t2 t2Var = this.f28464b;
                w2 w2Var = t2Var.G;
                w2Var.f28672b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                w2Var.h0();
                w2Var.q0(w2Var.f28672b.getTranslationY());
                t2Var.invalidate();
                return;
            case 1:
                w2 w2Var2 = this.f28464b.G;
                m2 m2Var = w2Var2.f28675c;
                if (m2Var != null) {
                    m2Var.invalidate();
                }
                w2Var2.h0();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2 t2Var2 = this.f28464b;
                t2Var2.D = floatValue;
                w2 w2Var3 = t2Var2.G;
                w2Var3.f28672b.setTranslationX(floatValue);
                w2Var3.f28675c.invalidate();
                return;
            case 3:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2 t2Var3 = this.f28464b;
                t2Var3.D = floatValue2;
                w2 w2Var4 = t2Var3.G;
                w2Var4.f28672b.setTranslationX(floatValue2);
                w2Var4.f28675c.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2 w2Var5 = this.f28464b.G;
                v2 v2Var = w2Var5.Y;
                if (w2Var5.f28698o0) {
                    i7 = (int) (w2Var5.f28699p0 * floatValue3);
                } else {
                    i7 = 0;
                }
                v2Var.setAlpha(i7);
                return;
        }
    }
}
