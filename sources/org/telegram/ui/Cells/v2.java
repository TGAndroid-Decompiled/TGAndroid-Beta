package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class v2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23623a;
    public final x2 f23624b;

    public v2(x2 x2Var, int i10) {
        this.f23623a = i10;
        this.f23624b = x2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23623a) {
            case 0:
                x2 x2Var = this.f23624b;
                x2Var.getClass();
                x2Var.f23788a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var.requestLayout();
                q0.a aVar = x2Var.f23790c;
                if (aVar != null) {
                    aVar.accept(Float.valueOf(x2Var.f23788a));
                    return;
                }
                return;
            default:
                x2 x2Var2 = this.f23624b;
                x2Var2.getClass();
                x2Var2.f23788a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var2.requestLayout();
                q0.a aVar2 = x2Var2.f23790c;
                if (aVar2 != null) {
                    aVar2.accept(Float.valueOf(x2Var2.f23788a));
                    return;
                }
                return;
        }
    }
}
