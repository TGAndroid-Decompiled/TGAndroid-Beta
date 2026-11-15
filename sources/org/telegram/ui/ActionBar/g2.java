package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class g2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28560a;
    public final u2 f28561b;

    public g2(u2 u2Var, int i7) {
        this.f28560a = i7;
        this.f28561b = u2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28560a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2 u2Var = this.f28561b;
                u2Var.D0 = floatValue;
                k2 k2Var = u2Var.f29685c;
                if (k2Var != null) {
                    k2Var.invalidate();
                    return;
                }
                return;
            case 1:
                this.f28561b.h0();
                return;
            case 2:
                this.f28561b.h0();
                return;
            case 3:
                u2 u2Var2 = this.f28561b;
                u2Var2.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                u2Var2.C0(u2Var2.Y.intValue(), intValue, intValue);
                return;
            case 4:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2 u2Var3 = this.f28561b;
                u2Var3.T0 = floatValue2;
                u2Var3.f29685c.requestLayout();
                u2Var3.f29682b.requestLayout();
                return;
            case 5:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2 u2Var4 = this.f28561b;
                u2Var4.D0 = floatValue3;
                k2 k2Var2 = u2Var4.f29685c;
                if (k2Var2 != null) {
                    k2Var2.invalidate();
                    return;
                }
                return;
            case 6:
                this.f28561b.h0();
                return;
            default:
                this.f28561b.h0();
                return;
        }
    }
}
