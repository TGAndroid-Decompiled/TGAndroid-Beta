package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class eh0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26145a;
    public final hh0 f26146b;

    public eh0(hh0 hh0Var, int i10) {
        this.f26145a = i10;
        this.f26146b = hh0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26145a) {
            case 0:
                hh0 hh0Var = this.f26146b;
                hh0Var.getClass();
                hh0Var.f27230b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hh0Var.c(true);
                return;
            default:
                hh0 hh0Var2 = this.f26146b;
                hh0Var2.getClass();
                hh0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hh0Var2.c(true);
                return;
        }
    }
}
