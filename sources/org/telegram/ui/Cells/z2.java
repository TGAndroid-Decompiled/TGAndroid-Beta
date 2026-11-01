package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class z2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23637a;
    public final b3 f23638b;

    public z2(b3 b3Var, int i10) {
        this.f23637a = i10;
        this.f23638b = b3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23637a) {
            case 0:
                b3 b3Var = this.f23638b;
                b3Var.getClass();
                b3Var.f21711a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b3Var.requestLayout();
                q0.a aVar = b3Var.f21713c;
                if (aVar != null) {
                    aVar.accept(Float.valueOf(b3Var.f21711a));
                    return;
                }
                return;
            default:
                b3 b3Var2 = this.f23638b;
                b3Var2.getClass();
                b3Var2.f21711a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b3Var2.requestLayout();
                q0.a aVar2 = b3Var2.f21713c;
                if (aVar2 != null) {
                    aVar2.accept(Float.valueOf(b3Var2.f21711a));
                    return;
                }
                return;
        }
    }
}
