package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class v2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25784a;
    public final x2 f25785b;

    public v2(x2 x2Var, int i9) {
        this.f25784a = i9;
        this.f25785b = x2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25784a) {
            case 0:
                x2 x2Var = this.f25785b;
                x2Var.getClass();
                x2Var.f25930a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var.requestLayout();
                q0.a aVar = x2Var.f25932c;
                if (aVar != null) {
                    aVar.accept(Float.valueOf(x2Var.f25930a));
                    return;
                }
                return;
            default:
                x2 x2Var2 = this.f25785b;
                x2Var2.getClass();
                x2Var2.f25930a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var2.requestLayout();
                q0.a aVar2 = x2Var2.f25932c;
                if (aVar2 != null) {
                    aVar2.accept(Float.valueOf(x2Var2.f25930a));
                    return;
                }
                return;
        }
    }
}
