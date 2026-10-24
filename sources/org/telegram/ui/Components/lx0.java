package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class lx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28465a;
    public final ox0 f28466b;

    public lx0(ox0 ox0Var, int i10) {
        this.f28465a = i10;
        this.f28466b = ox0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28465a) {
            case 0:
                ox0 ox0Var = this.f28466b;
                ox0Var.getClass();
                ox0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ox0Var.invalidate();
                return;
            case 1:
                ox0 ox0Var2 = this.f28466b;
                ox0Var2.getClass();
                ox0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ox0 ox0Var3 = this.f28466b;
                ox0Var3.getClass();
                ox0Var3.f29426y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ox0Var3.invalidate();
                return;
        }
    }
}
