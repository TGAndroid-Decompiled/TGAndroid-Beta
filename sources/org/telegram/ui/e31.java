package org.telegram.ui;

import android.animation.ValueAnimator;
public final class e31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37810a;
    public final h31 f37811b;

    public e31(h31 h31Var, int i9) {
        this.f37810a = i9;
        this.f37811b = h31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37810a) {
            case 0:
                h31 h31Var = this.f37811b;
                h31Var.getClass();
                h31Var.f38664e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h31Var.g();
                return;
            case 1:
                h31 h31Var2 = this.f37811b;
                h31Var2.getClass();
                h31Var2.f38664e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h31Var2.g();
                return;
            default:
                h31 h31Var3 = this.f37811b;
                h31Var3.getClass();
                h31Var3.f38664e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h31Var3.g();
                return;
        }
    }
}
