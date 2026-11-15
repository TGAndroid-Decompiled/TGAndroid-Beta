package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class j61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35883a;
    public final w61 f35884b;

    public j61(w61 w61Var, int i7) {
        this.f35883a = i7;
        this.f35884b = w61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35883a) {
            case 0:
                w61 w61Var = this.f35884b;
                w61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = w61Var.f41300e;
                View view = viewArr[1];
                if (view != null) {
                    if (w61Var.E) {
                        w61Var.D(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        w61Var.D(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        w61Var.D(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        w61Var.D(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    w61Var.f41299c = floatValue;
                    w61Var.u(true);
                    l61 l61Var = w61Var.N;
                    if (l61Var != null) {
                        l61Var.f40317w.invalidate();
                        w61Var.N.f40317w.g1();
                        w61Var.N.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                w61 w61Var2 = this.f35884b;
                w61Var2.getClass();
                w61Var2.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                w61 w61Var3 = this.f35884b;
                w61Var3.O.onAnimationUpdate(valueAnimator);
                w61Var3.N.f40291a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w61Var3.N.f40317w.g1();
                w61Var3.N.invalidate();
                return;
            default:
                w61 w61Var4 = this.f35884b;
                w61Var4.getClass();
                w61Var4.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
