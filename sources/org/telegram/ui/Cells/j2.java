package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class j2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29418a;
    public final t2 f29419b;

    public j2(t2 t2Var, int i3) {
        this.f29418a = i3;
        this.f29419b = t2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29418a) {
            case 0:
                t2 t2Var = this.f29419b;
                t2Var.getClass();
                t2Var.W3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var.invalidate();
                return;
            case 1:
                t2 t2Var2 = this.f29419b;
                t2Var2.getClass();
                t2Var2.X3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var2.invalidate();
                return;
            default:
                t2 t2Var3 = this.f29419b;
                t2Var3.getClass();
                t2Var3.f30596z4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var3.invalidate();
                return;
        }
    }
}
