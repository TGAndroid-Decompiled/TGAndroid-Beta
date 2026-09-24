package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class v2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29700a;
    public final w2 f29701b;

    public v2(w2 w2Var, int i10) {
        this.f29700a = i10;
        this.f29701b = w2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29700a) {
            case 0:
                w2 w2Var = this.f29701b;
                w2Var.getClass();
                w2Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var.a(w2Var.R, w2Var.S);
                return;
            default:
                w2 w2Var2 = this.f29701b;
                w2Var2.getClass();
                w2Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var2.invalidate();
                return;
        }
    }
}
