package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ug0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29378a;
    public final wg0 f29379b;

    public ug0(wg0 wg0Var, int i10) {
        this.f29378a = i10;
        this.f29379b = wg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29378a) {
            case 0:
                wg0 wg0Var = this.f29379b;
                wg0Var.getClass();
                wg0Var.f30576y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wg0Var.invalidate();
                return;
            default:
                wg0 wg0Var2 = this.f29379b;
                wg0Var2.getClass();
                wg0Var2.f30576y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wg0Var2.invalidate();
                return;
        }
    }
}
