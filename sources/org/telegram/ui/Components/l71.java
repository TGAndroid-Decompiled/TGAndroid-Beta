package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class l71 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28073a;
    public final x71 f28074b;

    public l71(x71 x71Var, int i10) {
        this.f28073a = i10;
        this.f28074b = x71Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28073a) {
            case 0:
                x71 x71Var = this.f28074b;
                x71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = x71Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (x71Var.D) {
                        x71Var.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        x71Var.F(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        x71Var.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        x71Var.F(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    x71Var.f32494c = floatValue;
                    x71Var.x(true);
                    n71 n71Var = x71Var.M;
                    if (n71Var != null) {
                        n71Var.f32162w.invalidate();
                        x71Var.M.f32162w.g1();
                        x71Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                x71 x71Var2 = this.f28074b;
                x71Var2.getClass();
                x71Var2.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                x71 x71Var3 = this.f28074b;
                x71Var3.N.onAnimationUpdate(valueAnimator);
                x71Var3.M.f32138a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x71Var3.M.f32162w.g1();
                x71Var3.M.invalidate();
                return;
            default:
                x71 x71Var4 = this.f28074b;
                x71Var4.getClass();
                x71Var4.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
