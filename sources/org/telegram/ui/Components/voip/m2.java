package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class m2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39479a;
    public final p2 f39480b;

    public m2(p2 p2Var, int i3) {
        this.f39479a = i3;
        this.f39480b = p2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39479a) {
            case 0:
                p2 p2Var = this.f39480b;
                p2Var.getClass();
                p2Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2Var.invalidate();
                return;
            case 1:
                p2 p2Var2 = this.f39480b;
                p2Var2.getClass();
                p2Var2.f39525x = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p2Var2.invalidate();
                return;
            case 2:
                p2 p2Var3 = this.f39480b;
                p2Var3.getClass();
                p2Var3.f39523s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p2Var3.invalidate();
                return;
            default:
                p2 p2Var4 = this.f39480b;
                p2Var4.getClass();
                p2Var4.f39522r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p2Var4.invalidate();
                return;
        }
    }
}
