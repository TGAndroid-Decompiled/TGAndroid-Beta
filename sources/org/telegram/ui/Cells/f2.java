package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24306a;
    public final p2 f24307b;

    public f2(p2 p2Var, int i10) {
        this.f24306a = i10;
        this.f24307b = p2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24306a) {
            case 0:
                p2 p2Var = this.f24307b;
                p2Var.getClass();
                p2Var.N3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2Var.invalidate();
                return;
            case 1:
                p2 p2Var2 = this.f24307b;
                p2Var2.getClass();
                p2Var2.O3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2Var2.invalidate();
                return;
            default:
                p2 p2Var3 = this.f24307b;
                p2Var3.getClass();
                p2Var3.f24910q4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2Var3.invalidate();
                return;
        }
    }
}
