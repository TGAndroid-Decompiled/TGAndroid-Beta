package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class k71 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27672a;
    public final w71 f27673b;

    public k71(w71 w71Var, int i10) {
        this.f27672a = i10;
        this.f27673b = w71Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27672a) {
            case 0:
                w71 w71Var = this.f27673b;
                w71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = w71Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (w71Var.D) {
                        w71Var.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        w71Var.F(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        w71Var.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        w71Var.F(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    w71Var.f32091c = floatValue;
                    w71Var.x(true);
                    m71 m71Var = w71Var.M;
                    if (m71Var != null) {
                        m71Var.f31184w.invalidate();
                        w71Var.M.f31184w.g1();
                        w71Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                w71 w71Var2 = this.f27673b;
                w71Var2.getClass();
                w71Var2.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                w71 w71Var3 = this.f27673b;
                w71Var3.N.onAnimationUpdate(valueAnimator);
                w71Var3.M.f31160a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w71Var3.M.f31184w.g1();
                w71Var3.M.invalidate();
                return;
            default:
                w71 w71Var4 = this.f27673b;
                w71Var4.getClass();
                w71Var4.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
