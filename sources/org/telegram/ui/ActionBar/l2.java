package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class l2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f20532a;
    public final z2 f20533b;

    public l2(z2 z2Var, int i10) {
        this.f20532a = i10;
        this.f20533b = z2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f20532a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2 z2Var = this.f20533b;
                z2Var.C0 = floatValue;
                p2 p2Var = z2Var.f21589c;
                if (p2Var != null) {
                    p2Var.invalidate();
                    return;
                }
                return;
            case 1:
                this.f20533b.h0();
                return;
            case 2:
                this.f20533b.h0();
                return;
            case 3:
                z2 z2Var2 = this.f20533b;
                z2Var2.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                z2Var2.C0(z2Var2.X.intValue(), intValue, intValue);
                return;
            case 4:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2 z2Var3 = this.f20533b;
                z2Var3.S0 = floatValue2;
                z2Var3.f21589c.requestLayout();
                z2Var3.f21586b.requestLayout();
                return;
            case 5:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2 z2Var4 = this.f20533b;
                z2Var4.C0 = floatValue3;
                p2 p2Var2 = z2Var4.f21589c;
                if (p2Var2 != null) {
                    p2Var2.invalidate();
                    return;
                }
                return;
            case 6:
                this.f20533b.h0();
                return;
            default:
                this.f20533b.h0();
                return;
        }
    }
}
