package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class u2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23726a;
    public final w2 f23727b;

    public u2(w2 w2Var, int i10) {
        this.f23726a = i10;
        this.f23727b = w2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23726a) {
            case 0:
                w2 w2Var = this.f23727b;
                w2Var.getClass();
                w2Var.f23897a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var.requestLayout();
                q0.a aVar = w2Var.f23899c;
                if (aVar != null) {
                    aVar.accept(Float.valueOf(w2Var.f23897a));
                    return;
                }
                return;
            default:
                w2 w2Var2 = this.f23727b;
                w2Var2.getClass();
                w2Var2.f23897a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var2.requestLayout();
                q0.a aVar2 = w2Var2.f23899c;
                if (aVar2 != null) {
                    aVar2.accept(Float.valueOf(w2Var2.f23897a));
                    return;
                }
                return;
        }
    }
}
