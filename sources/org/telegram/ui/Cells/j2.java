package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class j2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22063a;
    public final v2 f22064b;

    public j2(v2 v2Var, int i10) {
        this.f22063a = i10;
        this.f22064b = v2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22063a) {
            case 0:
                v2 v2Var = this.f22064b;
                v2Var.getClass();
                v2Var.V3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.invalidate();
                return;
            case 1:
                v2 v2Var2 = this.f22064b;
                v2Var2.getClass();
                v2Var2.W3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var2.invalidate();
                return;
            default:
                v2 v2Var3 = this.f22064b;
                v2Var3.getClass();
                v2Var3.f23300y4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var3.invalidate();
                return;
        }
    }
}
