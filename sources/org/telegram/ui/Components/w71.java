package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class w71 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32195a;
    public final i81 f32196b;

    public w71(i81 i81Var, int i10) {
        this.f32195a = i10;
        this.f32196b = i81Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32195a) {
            case 0:
                i81 i81Var = this.f32196b;
                i81Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = i81Var.f27017e;
                View view = viewArr[1];
                if (view != null) {
                    if (i81Var.f27024y) {
                        i81Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        i81Var.E(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        i81Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        i81Var.E(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    i81Var.f27016c = floatValue;
                    i81Var.w(true);
                    y71 y71Var = i81Var.M;
                    if (y71Var != null) {
                        y71Var.v.invalidate();
                        i81Var.M.v.e1();
                        i81Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                i81 i81Var2 = this.f32196b;
                i81Var2.getClass();
                i81Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                i81 i81Var3 = this.f32196b;
                i81Var3.N.onAnimationUpdate(valueAnimator);
                i81Var3.M.f26632a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i81Var3.M.v.e1();
                i81Var3.M.invalidate();
                return;
            default:
                i81 i81Var4 = this.f32196b;
                i81Var4.getClass();
                i81Var4.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
