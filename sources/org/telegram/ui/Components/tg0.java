package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class tg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29388a;
    public final vg0 f29389b;

    public tg0(vg0 vg0Var, int i10) {
        this.f29388a = i10;
        this.f29389b = vg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29388a) {
            case 0:
                vg0 vg0Var = this.f29389b;
                vg0Var.getClass();
                vg0Var.f29970y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg0Var.invalidate();
                return;
            default:
                vg0 vg0Var2 = this.f29389b;
                vg0Var2.getClass();
                vg0Var2.f29970y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg0Var2.invalidate();
                return;
        }
    }
}
