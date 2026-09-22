package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class m81 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26378a;
    public final z81 f26379b;

    public m81(z81 z81Var, int i10) {
        this.f26378a = i10;
        this.f26379b = z81Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26378a) {
            case 0:
                z81 z81Var = this.f26379b;
                z81Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = z81Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (z81Var.f30857y) {
                        z81Var.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        z81Var.F(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        z81Var.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        z81Var.F(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    z81Var.f30850c = floatValue;
                    z81Var.x(true);
                    o81 o81Var = z81Var.M;
                    if (o81Var != null) {
                        o81Var.v.invalidate();
                        z81Var.M.v.g1();
                        z81Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                z81 z81Var2 = this.f26379b;
                z81Var2.getClass();
                z81Var2.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                z81 z81Var3 = this.f26379b;
                z81Var3.N.onAnimationUpdate(valueAnimator);
                z81Var3.M.f30583a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z81Var3.M.v.g1();
                z81Var3.M.invalidate();
                return;
            default:
                z81 z81Var4 = this.f26379b;
                z81Var4.getClass();
                z81Var4.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
