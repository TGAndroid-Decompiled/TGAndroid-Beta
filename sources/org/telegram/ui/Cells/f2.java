package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f21015a;
    public final q2 f21016b;

    public f2(q2 q2Var, int i10) {
        this.f21015a = i10;
        this.f21016b = q2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21015a) {
            case 0:
                q2 q2Var = this.f21016b;
                q2Var.getClass();
                q2Var.O3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var.invalidate();
                return;
            case 1:
                q2 q2Var2 = this.f21016b;
                q2Var2.getClass();
                q2Var2.P3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var2.invalidate();
                return;
            default:
                q2 q2Var3 = this.f21016b;
                q2Var3.getClass();
                q2Var3.f21641r4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var3.invalidate();
                return;
        }
    }
}
