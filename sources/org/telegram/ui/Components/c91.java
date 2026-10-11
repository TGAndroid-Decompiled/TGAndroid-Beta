package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class c91 implements ValueAnimator.AnimatorUpdateListener {
    public final int f25270a;
    public final p91 f25271b;

    public c91(p91 p91Var, int i10) {
        this.f25270a = i10;
        this.f25271b = p91Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25270a) {
            case 0:
                p91 p91Var = this.f25271b;
                p91Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = p91Var.f29798e;
                View view = viewArr[1];
                if (view != null) {
                    if (p91Var.f29805y) {
                        p91Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        p91Var.E(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        p91Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        p91Var.E(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    p91Var.f29797c = floatValue;
                    p91Var.w(true);
                    e91 e91Var = p91Var.M;
                    if (e91Var != null) {
                        e91Var.v.invalidate();
                        p91Var.M.v.f1();
                        p91Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                p91 p91Var2 = this.f25271b;
                p91Var2.getClass();
                p91Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                p91 p91Var3 = this.f25271b;
                p91Var3.N.onAnimationUpdate(valueAnimator);
                p91Var3.M.f29430a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p91Var3.M.v.f1();
                p91Var3.M.invalidate();
                return;
            default:
                p91 p91Var4 = this.f25271b;
                p91Var4.getClass();
                p91Var4.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
