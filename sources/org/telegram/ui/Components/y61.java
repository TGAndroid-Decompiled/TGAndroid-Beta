package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class y61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42372a;
    public final k71 f42373b;

    public y61(k71 k71Var, int i7) {
        this.f42372a = i7;
        this.f42373b = k71Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42372a) {
            case 0:
                k71 k71Var = this.f42373b;
                k71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = k71Var.f36665e;
                View view = viewArr[1];
                if (view != null) {
                    if (k71Var.E) {
                        k71Var.D(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        k71Var.D(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        k71Var.D(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        k71Var.D(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    k71Var.f36664c = floatValue;
                    k71Var.u(true);
                    a71 a71Var = k71Var.N;
                    if (a71Var != null) {
                        a71Var.f36348w.invalidate();
                        k71Var.N.f36348w.g1();
                        k71Var.N.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                k71 k71Var2 = this.f42373b;
                k71Var2.getClass();
                k71Var2.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                k71 k71Var3 = this.f42373b;
                k71Var3.O.onAnimationUpdate(valueAnimator);
                k71Var3.N.f36322a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k71Var3.N.f36348w.g1();
                k71Var3.N.invalidate();
                return;
            default:
                k71 k71Var4 = this.f42373b;
                k71Var4.getClass();
                k71Var4.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
