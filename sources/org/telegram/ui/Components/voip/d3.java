package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39115a;
    public final f3 f39116b;

    public d3(f3 f3Var, int i7) {
        this.f39115a = i7;
        this.f39116b = f3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39115a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3 f3Var = this.f39116b;
                f3Var.f39174n = floatValue;
                f3Var.f39171k.invalidate();
                if (f3Var.f39174n > 1.0f && f3Var.f39178r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(org.telegram.messenger.g0.L(12), 0);
                    f3Var.f39178r = ofInt;
                    ofInt.addUpdateListener(new d3(f3Var, 2));
                    f3Var.f39178r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    f3Var.f39178r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3 f3Var2 = this.f39116b;
                f3Var2.f39173m = intValue;
                f3Var2.f39171k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3 f3Var3 = this.f39116b;
                if (f3Var3.f39169i <= f3Var3.f39175o / 2) {
                    intValue2 = -intValue2;
                }
                f3Var3.f39176p = intValue2;
                f3Var3.f39171k.invalidate();
                return;
        }
    }
}
