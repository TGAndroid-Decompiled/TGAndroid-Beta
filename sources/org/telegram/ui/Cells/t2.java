package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class t2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25437a;
    public final v2 f25438b;

    public t2(v2 v2Var, int i10) {
        this.f25437a = i10;
        this.f25438b = v2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25437a) {
            case 0:
                v2 v2Var = this.f25438b;
                v2Var.getClass();
                v2Var.f25578a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.requestLayout();
                q0.a aVar = v2Var.f25580c;
                if (aVar != null) {
                    aVar.accept(Float.valueOf(v2Var.f25578a));
                    return;
                }
                return;
            default:
                v2 v2Var2 = this.f25438b;
                v2Var2.getClass();
                v2Var2.f25578a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var2.requestLayout();
                q0.a aVar2 = v2Var2.f25580c;
                if (aVar2 != null) {
                    aVar2.accept(Float.valueOf(v2Var2.f25578a));
                    return;
                }
                return;
        }
    }
}
