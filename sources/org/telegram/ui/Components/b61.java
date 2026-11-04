package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class b61 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32100a;
    public final n61 f32101b;

    public b61(n61 n61Var, int i3) {
        this.f32100a = i3;
        this.f32101b = n61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32100a) {
            case 0:
                n61 n61Var = this.f32101b;
                n61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = n61Var.f36386e;
                View view = viewArr[1];
                if (view != null) {
                    if (n61Var.E) {
                        n61Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        n61Var.E(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        n61Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        n61Var.E(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    n61Var.f36385c = floatValue;
                    n61Var.v(true);
                    d61 d61Var = n61Var.N;
                    if (d61Var != null) {
                        d61Var.f36052w.invalidate();
                        n61Var.N.f36052w.g1();
                        n61Var.N.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                n61 n61Var2 = this.f32101b;
                n61Var2.getClass();
                n61Var2.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                n61 n61Var3 = this.f32101b;
                n61Var3.O.onAnimationUpdate(valueAnimator);
                n61Var3.N.f36026a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n61Var3.N.f36052w.g1();
                n61Var3.N.invalidate();
                return;
            default:
                n61 n61Var4 = this.f32101b;
                n61Var4.getClass();
                n61Var4.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
