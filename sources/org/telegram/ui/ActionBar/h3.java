package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class h3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28996a;
    public final n3 f28997b;

    public h3(n3 n3Var, int i7) {
        this.f28996a = i7;
        this.f28997b = n3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28996a) {
            case 0:
                n3 n3Var = this.f28997b;
                n3Var.getClass();
                n3Var.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n3Var.invalidate();
                return;
            case 1:
                n3 n3Var2 = this.f28997b;
                n3Var2.getClass();
                n3Var2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            default:
                n3 n3Var3 = this.f28997b;
                n3Var3.getClass();
                n3Var3.f29277e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n3Var3.invalidate();
                return;
        }
    }
}
