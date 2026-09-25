package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ch0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23342a;
    public final fh0 f23343b;

    public ch0(fh0 fh0Var, int i10) {
        this.f23342a = i10;
        this.f23343b = fh0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23342a) {
            case 0:
                fh0 fh0Var = this.f23343b;
                fh0Var.getClass();
                fh0Var.f24188b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fh0Var.c(true);
                return;
            default:
                fh0 fh0Var2 = this.f23343b;
                fh0Var2.getClass();
                fh0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fh0Var2.c(true);
                return;
        }
    }
}
