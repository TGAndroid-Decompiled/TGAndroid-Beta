package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class k81 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25707a;
    public final x81 f25708b;

    public k81(x81 x81Var, int i10) {
        this.f25707a = i10;
        this.f25708b = x81Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25707a) {
            case 0:
                x81 x81Var = this.f25708b;
                x81Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = x81Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (x81Var.f30201y) {
                        x81Var.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        x81Var.F(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        x81Var.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        x81Var.F(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    x81Var.f30194c = floatValue;
                    x81Var.x(true);
                    m81 m81Var = x81Var.M;
                    if (m81Var != null) {
                        m81Var.v.invalidate();
                        x81Var.M.v.g1();
                        x81Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                x81 x81Var2 = this.f25708b;
                x81Var2.getClass();
                x81Var2.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                x81 x81Var3 = this.f25708b;
                x81Var3.N.onAnimationUpdate(valueAnimator);
                x81Var3.M.f29981a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x81Var3.M.v.g1();
                x81Var3.M.invalidate();
                return;
            default:
                x81 x81Var4 = this.f25708b;
                x81Var4.getClass();
                x81Var4.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
