package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class j2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29039a;
    public final x2 f29040b;

    public j2(x2 x2Var, int i7) {
        this.f29039a = i7;
        this.f29040b = x2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29039a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2 x2Var = this.f29040b;
                x2Var.D0 = floatValue;
                n2 n2Var = x2Var.f30195c;
                if (n2Var != null) {
                    n2Var.invalidate();
                    return;
                }
                return;
            case 1:
                this.f29040b.h0();
                return;
            case 2:
                this.f29040b.h0();
                return;
            case 3:
                x2 x2Var2 = this.f29040b;
                x2Var2.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x2Var2.C0(x2Var2.Y.intValue(), intValue, intValue);
                return;
            case 4:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2 x2Var3 = this.f29040b;
                x2Var3.T0 = floatValue2;
                x2Var3.f30195c.requestLayout();
                x2Var3.f30192b.requestLayout();
                return;
            case 5:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2 x2Var4 = this.f29040b;
                x2Var4.D0 = floatValue3;
                n2 n2Var2 = x2Var4.f30195c;
                if (n2Var2 != null) {
                    n2Var2.invalidate();
                    return;
                }
                return;
            case 6:
                this.f29040b.h0();
                return;
            default:
                this.f29040b.h0();
                return;
        }
    }
}
