package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class a71 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26715a;
    public final n71 f26716b;

    public a71(n71 n71Var, int i9) {
        this.f26715a = i9;
        this.f26716b = n71Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26715a) {
            case 0:
                n71 n71Var = this.f26716b;
                n71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = n71Var.f31035e;
                View view = viewArr[1];
                if (view != null) {
                    if (n71Var.f31042y) {
                        n71Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        n71Var.E(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        n71Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        n71Var.E(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    n71Var.f31034c = floatValue;
                    n71Var.w(true);
                    c71 c71Var = n71Var.I;
                    if (c71Var != null) {
                        c71Var.v.invalidate();
                        n71Var.I.v.f1();
                        n71Var.I.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                n71 n71Var2 = this.f26716b;
                n71Var2.getClass();
                n71Var2.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                n71 n71Var3 = this.f26716b;
                n71Var3.J.onAnimationUpdate(valueAnimator);
                n71Var3.I.f30736a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n71Var3.I.v.f1();
                n71Var3.I.invalidate();
                return;
            default:
                n71 n71Var4 = this.f26716b;
                n71Var4.getClass();
                n71Var4.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
