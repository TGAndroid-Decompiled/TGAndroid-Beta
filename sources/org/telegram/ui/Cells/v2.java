package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class v2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24303a;
    public final x2 f24304b;

    public v2(x2 x2Var, int i10) {
        this.f24303a = i10;
        this.f24304b = x2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24303a) {
            case 0:
                x2 x2Var = this.f24304b;
                x2Var.getClass();
                x2Var.f24390a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var.requestLayout();
                q0.a aVar = x2Var.f24392c;
                if (aVar != null) {
                    aVar.accept(Float.valueOf(x2Var.f24390a));
                    return;
                }
                return;
            default:
                x2 x2Var2 = this.f24304b;
                x2Var2.getClass();
                x2Var2.f24390a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var2.requestLayout();
                q0.a aVar2 = x2Var2.f24392c;
                if (aVar2 != null) {
                    aVar2.accept(Float.valueOf(x2Var2.f24390a));
                    return;
                }
                return;
        }
    }
}
