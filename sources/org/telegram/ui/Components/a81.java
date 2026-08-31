package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class a81 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25205a;
    public final m81 f25206b;

    public a81(m81 m81Var, int i10) {
        this.f25205a = i10;
        this.f25206b = m81Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25205a) {
            case 0:
                m81 m81Var = this.f25206b;
                m81Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = m81Var.f28987e;
                View view = viewArr[1];
                if (view != null) {
                    if (m81Var.f28994y) {
                        m81Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        m81Var.E(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        m81Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        m81Var.E(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    m81Var.f28986c = floatValue;
                    m81Var.w(true);
                    c81 c81Var = m81Var.J;
                    if (c81Var != null) {
                        c81Var.v.invalidate();
                        m81Var.J.v.f1();
                        m81Var.J.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                m81 m81Var2 = this.f25206b;
                m81Var2.getClass();
                m81Var2.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                m81 m81Var3 = this.f25206b;
                m81Var3.K.onAnimationUpdate(valueAnimator);
                m81Var3.J.f28647a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m81Var3.J.v.f1();
                m81Var3.J.invalidate();
                return;
            default:
                m81 m81Var4 = this.f25206b;
                m81Var4.getClass();
                m81Var4.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
