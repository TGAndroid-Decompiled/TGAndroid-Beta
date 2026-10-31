package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class n2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31559a;
    public final q2 f31560b;

    public n2(q2 q2Var, int i10) {
        this.f31559a = i10;
        this.f31560b = q2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31559a) {
            case 0:
                q2 q2Var = this.f31560b;
                q2Var.getClass();
                q2Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var.invalidate();
                return;
            case 1:
                q2 q2Var2 = this.f31560b;
                q2Var2.getClass();
                q2Var2.f31598x = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                q2Var2.invalidate();
                return;
            case 2:
                q2 q2Var3 = this.f31560b;
                q2Var3.getClass();
                q2Var3.f31596s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                q2Var3.invalidate();
                return;
            default:
                q2 q2Var4 = this.f31560b;
                q2Var4.getClass();
                q2Var4.f31595r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                q2Var4.invalidate();
                return;
        }
    }
}
