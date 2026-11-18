package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class u61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40231a;
    public final g71 f40232b;

    public u61(g71 g71Var, int i7) {
        this.f40231a = i7;
        this.f40232b = g71Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40231a) {
            case 0:
                g71 g71Var = this.f40232b;
                g71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = g71Var.f35378e;
                View view = viewArr[1];
                if (view != null) {
                    if (g71Var.E) {
                        g71Var.B(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        g71Var.B(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        g71Var.B(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        g71Var.B(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    g71Var.f35377c = floatValue;
                    g71Var.t(true);
                    w61 w61Var = g71Var.N;
                    if (w61Var != null) {
                        w61Var.f35016w.invalidate();
                        g71Var.N.f35016w.g1();
                        g71Var.N.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                g71 g71Var2 = this.f40232b;
                g71Var2.getClass();
                g71Var2.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                g71 g71Var3 = this.f40232b;
                g71Var3.O.onAnimationUpdate(valueAnimator);
                g71Var3.N.f34990a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g71Var3.N.f35016w.g1();
                g71Var3.N.invalidate();
                return;
            default:
                g71 g71Var4 = this.f40232b;
                g71Var4.getClass();
                g71Var4.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
