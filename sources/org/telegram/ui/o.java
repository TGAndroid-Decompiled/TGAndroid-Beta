package org.telegram.ui;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f39995a;
    public final h4 f39996b;

    public o(h4 h4Var, int i10) {
        this.f39995a = i10;
        this.f39996b = h4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39995a) {
            case 0:
                h4 h4Var = this.f39996b;
                h4Var.getClass();
                h4Var.V(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h4 h4Var2 = this.f39996b;
                h4Var2.Z0 = floatValue;
                h4Var2.f37687q0.setTranslationY(((1.0f - floatValue) * org.telegram.messenger.i0.L(51.0f)) + h4Var2.f37686p0);
                return;
        }
    }
}
