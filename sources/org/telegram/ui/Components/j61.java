package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class j61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34950a;
    public final w61 f34951b;

    public j61(w61 w61Var, int i7) {
        this.f34950a = i7;
        this.f34951b = w61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34950a) {
            case 0:
                w61 w61Var = this.f34951b;
                w61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = w61Var.f39950e;
                View view = viewArr[1];
                if (view != null) {
                    if (w61Var.D) {
                        w61Var.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        w61Var.F(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        w61Var.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        w61Var.F(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    w61Var.f39949c = floatValue;
                    w61Var.x(true);
                    l61 l61Var = w61Var.M;
                    if (l61Var != null) {
                        l61Var.f38986w.invalidate();
                        w61Var.M.f38986w.g1();
                        w61Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                w61 w61Var2 = this.f34951b;
                w61Var2.getClass();
                w61Var2.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                w61 w61Var3 = this.f34951b;
                w61Var3.N.onAnimationUpdate(valueAnimator);
                w61Var3.M.f38961a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w61Var3.M.f38986w.g1();
                w61Var3.M.invalidate();
                return;
            default:
                w61 w61Var4 = this.f34951b;
                w61Var4.getClass();
                w61Var4.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
