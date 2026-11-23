package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class i2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29086a;
    public final w2 f29087b;

    public i2(w2 w2Var, int i7) {
        this.f29086a = i7;
        this.f29087b = w2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29086a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2 w2Var = this.f29087b;
                w2Var.D0 = floatValue;
                m2 m2Var = w2Var.f30229c;
                if (m2Var != null) {
                    m2Var.invalidate();
                    return;
                }
                return;
            case 1:
                this.f29087b.h0();
                return;
            case 2:
                this.f29087b.h0();
                return;
            case 3:
                w2 w2Var2 = this.f29087b;
                w2Var2.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                w2Var2.C0(w2Var2.Y.intValue(), intValue, intValue);
                return;
            case 4:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2 w2Var3 = this.f29087b;
                w2Var3.T0 = floatValue2;
                w2Var3.f30229c.requestLayout();
                w2Var3.f30226b.requestLayout();
                return;
            case 5:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2 w2Var4 = this.f29087b;
                w2Var4.D0 = floatValue3;
                m2 m2Var2 = w2Var4.f30229c;
                if (m2Var2 != null) {
                    m2Var2.invalidate();
                    return;
                }
                return;
            case 6:
                this.f29087b.h0();
                return;
            default:
                this.f29087b.h0();
                return;
        }
    }
}
