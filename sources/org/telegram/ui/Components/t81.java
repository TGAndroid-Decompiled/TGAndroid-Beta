package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class t81 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30992a;
    public final g91 f30993b;

    public t81(g91 g91Var, int i10) {
        this.f30992a = i10;
        this.f30993b = g91Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30992a) {
            case 0:
                g91 g91Var = this.f30993b;
                g91Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = g91Var.f26732e;
                View view = viewArr[1];
                if (view != null) {
                    if (g91Var.f26739y) {
                        g91Var.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        g91Var.F(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        g91Var.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        g91Var.F(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    g91Var.f26731c = floatValue;
                    g91Var.x(true);
                    v81 v81Var = g91Var.M;
                    if (v81Var != null) {
                        v81Var.v.invalidate();
                        g91Var.M.v.h1();
                        g91Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                g91 g91Var2 = this.f30993b;
                g91Var2.getClass();
                g91Var2.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                g91 g91Var3 = this.f30993b;
                g91Var3.N.onAnimationUpdate(valueAnimator);
                g91Var3.M.f26392a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g91Var3.M.v.h1();
                g91Var3.M.invalidate();
                return;
            default:
                g91 g91Var4 = this.f30993b;
                g91Var4.getClass();
                g91Var4.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
