package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class x71 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29881a;
    public final j81 f29882b;

    public x71(j81 j81Var, int i10) {
        this.f29881a = i10;
        this.f29882b = j81Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29881a) {
            case 0:
                j81 j81Var = this.f29882b;
                j81Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = j81Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (j81Var.f25190y) {
                        j81Var.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        j81Var.F(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        j81Var.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        j81Var.F(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    j81Var.f25183c = floatValue;
                    j81Var.x(true);
                    z71 z71Var = j81Var.M;
                    if (z71Var != null) {
                        z71Var.v.invalidate();
                        j81Var.M.v.g1();
                        j81Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                j81 j81Var2 = this.f29882b;
                j81Var2.getClass();
                j81Var2.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                j81 j81Var3 = this.f29882b;
                j81Var3.N.onAnimationUpdate(valueAnimator);
                j81Var3.M.f24873a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j81Var3.M.v.g1();
                j81Var3.M.invalidate();
                return;
            default:
                j81 j81Var4 = this.f29882b;
                j81Var4.getClass();
                j81Var4.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
