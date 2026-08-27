package org.telegram.ui.Cells;

import android.animation.ValueAnimator;

public final class f2 implements ValueAnimator.AnimatorUpdateListener {

    public final int f24327a;

    public final p2 f24328b;

    public f2(p2 p2Var, int i10) {
        this.f24327a = i10;
        this.f24328b = p2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24327a) {
            case 0:
                p2 p2Var = this.f24328b;
                p2Var.getClass();
                p2Var.N3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2Var.invalidate();
                break;
            case 1:
                p2 p2Var2 = this.f24328b;
                p2Var2.getClass();
                p2Var2.O3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2Var2.invalidate();
                break;
            default:
                p2 p2Var3 = this.f24328b;
                p2Var3.getClass();
                p2Var3.f24919q4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2Var3.invalidate();
                break;
        }
    }
}
