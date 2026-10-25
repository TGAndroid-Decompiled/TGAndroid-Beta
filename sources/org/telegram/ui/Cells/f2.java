package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24056a;
    public final p2 f24057b;

    public f2(p2 p2Var, int i10) {
        this.f24056a = i10;
        this.f24057b = p2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24056a) {
            case 0:
                p2 p2Var = this.f24057b;
                p2Var.getClass();
                p2Var.V3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2Var.invalidate();
                return;
            case 1:
                p2 p2Var2 = this.f24057b;
                p2Var2.getClass();
                p2Var2.W3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2Var2.invalidate();
                return;
            default:
                p2 p2Var3 = this.f24057b;
                p2Var3.getClass();
                p2Var3.f24753y4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2Var3.invalidate();
                return;
        }
    }
}
