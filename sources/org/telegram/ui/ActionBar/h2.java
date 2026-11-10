package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class h2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27517a;
    public final w2 f27518b;

    public h2(w2 w2Var, int i7) {
        this.f27517a = i7;
        this.f27518b = w2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27517a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2 w2Var = this.f27518b;
                w2Var.C0 = floatValue;
                m2 m2Var = w2Var.f28675c;
                if (m2Var != null) {
                    m2Var.invalidate();
                    return;
                }
                return;
            case 1:
                this.f27518b.h0();
                return;
            case 2:
                this.f27518b.h0();
                return;
            case 3:
                w2 w2Var2 = this.f27518b;
                w2Var2.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                w2Var2.C0(w2Var2.X.intValue(), intValue, intValue);
                return;
            case 4:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2 w2Var3 = this.f27518b;
                w2Var3.S0 = floatValue2;
                w2Var3.f28675c.requestLayout();
                w2Var3.f28672b.requestLayout();
                return;
            case 5:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2 w2Var4 = this.f27518b;
                w2Var4.C0 = floatValue3;
                m2 m2Var2 = w2Var4.f28675c;
                if (m2Var2 != null) {
                    m2Var2.invalidate();
                    return;
                }
                return;
            case 6:
                this.f27518b.h0();
                return;
            default:
                this.f27518b.h0();
                return;
        }
    }
}
