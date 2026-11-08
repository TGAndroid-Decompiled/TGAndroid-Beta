package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39150a;
    public final f3 f39151b;

    public d3(f3 f3Var, int i7) {
        this.f39150a = i7;
        this.f39151b = f3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39150a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3 f3Var = this.f39151b;
                f3Var.f39209n = floatValue;
                f3Var.f39206k.invalidate();
                if (f3Var.f39209n > 1.0f && f3Var.f39213r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(org.telegram.messenger.g0.L(12), 0);
                    f3Var.f39213r = ofInt;
                    ofInt.addUpdateListener(new d3(f3Var, 2));
                    f3Var.f39213r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    f3Var.f39213r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3 f3Var2 = this.f39151b;
                f3Var2.f39208m = intValue;
                f3Var2.f39206k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3 f3Var3 = this.f39151b;
                if (f3Var3.f39204i <= f3Var3.f39210o / 2) {
                    intValue2 = -intValue2;
                }
                f3Var3.f39211p = intValue2;
                f3Var3.f39206k.invalidate();
                return;
        }
    }
}
