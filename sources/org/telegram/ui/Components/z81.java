package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class z81 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31505a;
    public final l91 f31506b;

    public z81(l91 l91Var, int i10) {
        this.f31505a = i10;
        this.f31506b = l91Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31505a) {
            case 0:
                l91 l91Var = this.f31506b;
                l91Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = l91Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (l91Var.f26700y) {
                        l91Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        l91Var.E(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        l91Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        l91Var.E(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    l91Var.f26693c = floatValue;
                    l91Var.w(true);
                    b91 b91Var = l91Var.M;
                    if (b91Var != null) {
                        b91Var.v.invalidate();
                        l91Var.M.v.f1();
                        l91Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                l91 l91Var2 = this.f31506b;
                l91Var2.getClass();
                l91Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                l91 l91Var3 = this.f31506b;
                l91Var3.N.onAnimationUpdate(valueAnimator);
                l91Var3.M.f26305a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l91Var3.M.v.f1();
                l91Var3.M.invalidate();
                return;
            default:
                l91 l91Var4 = this.f31506b;
                l91Var4.getClass();
                l91Var4.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
