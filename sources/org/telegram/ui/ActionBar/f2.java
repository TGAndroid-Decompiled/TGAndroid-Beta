package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27500a;
    public final t2 f27501b;

    public f2(t2 t2Var, int i3) {
        this.f27500a = i3;
        this.f27501b = t2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27500a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2 t2Var = this.f27501b;
                t2Var.D0 = floatValue;
                j2 j2Var = t2Var.f28589c;
                if (j2Var != null) {
                    j2Var.invalidate();
                    return;
                }
                return;
            case 1:
                this.f27501b.h0();
                return;
            case 2:
                this.f27501b.h0();
                return;
            case 3:
                t2 t2Var2 = this.f27501b;
                t2Var2.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                t2Var2.C0(t2Var2.Y.intValue(), intValue, intValue);
                return;
            case 4:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2 t2Var3 = this.f27501b;
                t2Var3.T0 = floatValue2;
                t2Var3.f28589c.requestLayout();
                t2Var3.f28586b.requestLayout();
                return;
            case 5:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2 t2Var4 = this.f27501b;
                t2Var4.D0 = floatValue3;
                j2 j2Var2 = t2Var4.f28589c;
                if (j2Var2 != null) {
                    j2Var2.invalidate();
                    return;
                }
                return;
            case 6:
                this.f27501b.h0();
                return;
            default:
                this.f27501b.h0();
                return;
        }
    }
}
