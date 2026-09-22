package org.telegram.ui;

import android.animation.ValueAnimator;
public final class j41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34790a;
    public final m41 f34791b;

    public j41(m41 m41Var, int i10) {
        this.f34790a = i10;
        this.f34791b = m41Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34790a) {
            case 0:
                m41 m41Var = this.f34791b;
                m41Var.getClass();
                m41Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m41Var.g();
                return;
            case 1:
                m41 m41Var2 = this.f34791b;
                m41Var2.getClass();
                m41Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m41Var2.g();
                return;
            default:
                m41 m41Var3 = this.f34791b;
                m41Var3.getClass();
                m41Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m41Var3.g();
                return;
        }
    }
}
