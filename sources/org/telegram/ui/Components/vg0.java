package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class vg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31780a;
    public final xg0 f31781b;

    public vg0(xg0 xg0Var, int i10) {
        this.f31780a = i10;
        this.f31781b = xg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31780a) {
            case 0:
                xg0 xg0Var = this.f31781b;
                xg0Var.getClass();
                xg0Var.f32860y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xg0Var.invalidate();
                return;
            default:
                xg0 xg0Var2 = this.f31781b;
                xg0Var2.getClass();
                xg0Var2.f32860y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xg0Var2.invalidate();
                return;
        }
    }
}
