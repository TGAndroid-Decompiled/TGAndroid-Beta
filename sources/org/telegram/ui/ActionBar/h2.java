package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class h2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27503a;
    public final v2 f27504b;

    public h2(v2 v2Var, int i7) {
        this.f27503a = i7;
        this.f27504b = v2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27503a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2 v2Var = this.f27504b;
                v2Var.C0 = floatValue;
                l2 l2Var = v2Var.f28618c;
                if (l2Var != null) {
                    l2Var.invalidate();
                    return;
                }
                return;
            case 1:
                this.f27504b.h0();
                return;
            case 2:
                this.f27504b.h0();
                return;
            case 3:
                v2 v2Var2 = this.f27504b;
                v2Var2.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                v2Var2.C0(v2Var2.X.intValue(), intValue, intValue);
                return;
            case 4:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2 v2Var3 = this.f27504b;
                v2Var3.S0 = floatValue2;
                v2Var3.f28618c.requestLayout();
                v2Var3.f28615b.requestLayout();
                return;
            case 5:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2 v2Var4 = this.f27504b;
                v2Var4.C0 = floatValue3;
                l2 l2Var2 = v2Var4.f28618c;
                if (l2Var2 != null) {
                    l2Var2.invalidate();
                    return;
                }
                return;
            case 6:
                this.f27504b.h0();
                return;
            default:
                this.f27504b.h0();
                return;
        }
    }
}
