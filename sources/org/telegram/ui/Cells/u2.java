package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class u2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22365a;
    public final w2 f22366b;

    public u2(w2 w2Var, int i10) {
        this.f22365a = i10;
        this.f22366b = w2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22365a) {
            case 0:
                w2 w2Var = this.f22366b;
                w2Var.getClass();
                w2Var.f22493a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var.requestLayout();
                q0.a aVar = w2Var.f22495c;
                if (aVar != null) {
                    aVar.accept(Float.valueOf(w2Var.f22493a));
                    return;
                }
                return;
            default:
                w2 w2Var2 = this.f22366b;
                w2Var2.getClass();
                w2Var2.f22493a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var2.requestLayout();
                q0.a aVar2 = w2Var2.f22495c;
                if (aVar2 != null) {
                    aVar2.accept(Float.valueOf(w2Var2.f22493a));
                    return;
                }
                return;
        }
    }
}
