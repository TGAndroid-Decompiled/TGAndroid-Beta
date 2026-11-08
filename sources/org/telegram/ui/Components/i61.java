package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class i61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34586a;
    public final v61 f34587b;

    public i61(v61 v61Var, int i7) {
        this.f34586a = i7;
        this.f34587b = v61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34586a) {
            case 0:
                v61 v61Var = this.f34587b;
                v61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = v61Var.f38925e;
                View view = viewArr[1];
                if (view != null) {
                    if (v61Var.D) {
                        v61Var.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        v61Var.F(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        v61Var.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        v61Var.F(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    v61Var.f38924c = floatValue;
                    v61Var.x(true);
                    k61 k61Var = v61Var.M;
                    if (k61Var != null) {
                        k61Var.f38550w.invalidate();
                        v61Var.M.f38550w.g1();
                        v61Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                v61 v61Var2 = this.f34587b;
                v61Var2.getClass();
                v61Var2.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                v61 v61Var3 = this.f34587b;
                v61Var3.N.onAnimationUpdate(valueAnimator);
                v61Var3.M.f38525a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v61Var3.M.f38550w.g1();
                v61Var3.M.invalidate();
                return;
            default:
                v61 v61Var4 = this.f34587b;
                v61Var4.getClass();
                v61Var4.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
