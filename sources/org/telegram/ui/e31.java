package org.telegram.ui;

import android.animation.ValueAnimator;
public final class e31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37688a;
    public final h31 f37689b;

    public e31(h31 h31Var, int i10) {
        this.f37688a = i10;
        this.f37689b = h31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37688a) {
            case 0:
                h31 h31Var = this.f37689b;
                h31Var.getClass();
                h31Var.f38759e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h31Var.g();
                return;
            case 1:
                h31 h31Var2 = this.f37689b;
                h31Var2.getClass();
                h31Var2.f38759e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h31Var2.g();
                return;
            default:
                h31 h31Var3 = this.f37689b;
                h31Var3.getClass();
                h31Var3.f38759e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h31Var3.g();
                return;
        }
    }
}
