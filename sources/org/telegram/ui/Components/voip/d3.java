package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39097a;
    public final f3 f39098b;

    public d3(f3 f3Var, int i7) {
        this.f39097a = i7;
        this.f39098b = f3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39097a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3 f3Var = this.f39098b;
                f3Var.f39156n = floatValue;
                f3Var.f39153k.invalidate();
                if (f3Var.f39156n > 1.0f && f3Var.f39160r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(org.telegram.messenger.g0.L(12), 0);
                    f3Var.f39160r = ofInt;
                    ofInt.addUpdateListener(new d3(f3Var, 2));
                    f3Var.f39160r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    f3Var.f39160r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3 f3Var2 = this.f39098b;
                f3Var2.f39155m = intValue;
                f3Var2.f39153k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3 f3Var3 = this.f39098b;
                if (f3Var3.f39151i <= f3Var3.f39157o / 2) {
                    intValue2 = -intValue2;
                }
                f3Var3.f39158p = intValue2;
                f3Var3.f39153k.invalidate();
                return;
        }
    }
}
