package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class j2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29365a;
    public final t2 f29366b;

    public j2(t2 t2Var, int i7) {
        this.f29365a = i7;
        this.f29366b = t2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29365a) {
            case 0:
                t2 t2Var = this.f29366b;
                t2Var.getClass();
                t2Var.V3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var.invalidate();
                return;
            case 1:
                t2 t2Var2 = this.f29366b;
                t2Var2.getClass();
                t2Var2.W3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var2.invalidate();
                return;
            default:
                t2 t2Var3 = this.f29366b;
                t2Var3.getClass();
                t2Var3.f30530y4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var3.invalidate();
                return;
        }
    }
}
