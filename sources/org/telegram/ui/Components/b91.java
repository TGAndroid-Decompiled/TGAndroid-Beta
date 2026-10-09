package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class b91 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24952a;
    public final o91 f24953b;

    public b91(o91 o91Var, int i10) {
        this.f24952a = i10;
        this.f24953b = o91Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24952a) {
            case 0:
                o91 o91Var = this.f24953b;
                o91Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = o91Var.f29429e;
                View view = viewArr[1];
                if (view != null) {
                    if (o91Var.f29436y) {
                        o91Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        o91Var.E(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        o91Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        o91Var.E(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    o91Var.f29428c = floatValue;
                    o91Var.w(true);
                    d91 d91Var = o91Var.M;
                    if (d91Var != null) {
                        d91Var.v.invalidate();
                        o91Var.M.v.f1();
                        o91Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                o91 o91Var2 = this.f24953b;
                o91Var2.getClass();
                o91Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                o91 o91Var3 = this.f24953b;
                o91Var3.N.onAnimationUpdate(valueAnimator);
                o91Var3.M.f29095a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o91Var3.M.v.f1();
                o91Var3.M.invalidate();
                return;
            default:
                o91 o91Var4 = this.f24953b;
                o91Var4.getClass();
                o91Var4.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
