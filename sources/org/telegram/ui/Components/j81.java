package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class j81 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25337a;
    public final w81 f25338b;

    public j81(w81 w81Var, int i10) {
        this.f25337a = i10;
        this.f25338b = w81Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25337a) {
            case 0:
                w81 w81Var = this.f25338b;
                w81Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = w81Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (w81Var.f29942y) {
                        w81Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        w81Var.E(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        w81Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        w81Var.E(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    w81Var.f29935c = floatValue;
                    w81Var.w(true);
                    l81 l81Var = w81Var.M;
                    if (l81Var != null) {
                        l81Var.v.invalidate();
                        w81Var.M.v.f1();
                        w81Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                w81 w81Var2 = this.f25338b;
                w81Var2.getClass();
                w81Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                w81 w81Var3 = this.f25338b;
                w81Var3.N.onAnimationUpdate(valueAnimator);
                w81Var3.M.f29081a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w81Var3.M.v.f1();
                w81Var3.M.invalidate();
                return;
            default:
                w81 w81Var4 = this.f25338b;
                w81Var4.getClass();
                w81Var4.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
