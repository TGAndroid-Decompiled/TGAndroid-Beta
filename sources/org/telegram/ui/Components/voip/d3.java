package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39239a;
    public final f3 f39240b;

    public d3(f3 f3Var, int i7) {
        this.f39239a = i7;
        this.f39240b = f3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39239a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3 f3Var = this.f39240b;
                f3Var.f39298n = floatValue;
                f3Var.f39295k.invalidate();
                if (f3Var.f39298n > 1.0f && f3Var.f39302r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(org.telegram.messenger.g0.L(12), 0);
                    f3Var.f39302r = ofInt;
                    ofInt.addUpdateListener(new d3(f3Var, 2));
                    f3Var.f39302r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    f3Var.f39302r.start();
                    return;
                }
                return;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3 f3Var2 = this.f39240b;
                f3Var2.f39297m = intValue;
                f3Var2.f39295k.invalidate();
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3 f3Var3 = this.f39240b;
                if (f3Var3.f39293i <= f3Var3.f39299o / 2) {
                    intValue2 = -intValue2;
                }
                f3Var3.f39300p = intValue2;
                f3Var3.f39295k.invalidate();
                return;
        }
    }
}
