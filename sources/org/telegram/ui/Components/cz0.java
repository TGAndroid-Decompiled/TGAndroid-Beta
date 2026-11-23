package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class cz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34173a;
    public final dz0 f34174b;

    public cz0(dz0 dz0Var, int i7) {
        this.f34173a = i7;
        this.f34174b = dz0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34173a) {
            case 0:
                dz0 dz0Var = this.f34174b;
                dz0Var.getClass();
                dz0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dz0Var.invalidate();
                return;
            case 1:
                dz0 dz0Var2 = this.f34174b;
                dz0Var2.getClass();
                dz0Var2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dz0Var2.invalidate();
                return;
            case 2:
                dz0 dz0Var3 = this.f34174b;
                dz0Var3.getClass();
                dz0Var3.f34502f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dz0Var3.invalidate();
                return;
            case 3:
                dz0 dz0Var4 = this.f34174b;
                dz0Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dz0Var4.f34505s = floatValue;
                dz0Var4.f34507x = (int) ((dz0Var4.h * floatValue) + 0);
                dz0Var4.invalidate();
                return;
            default:
                dz0 dz0Var5 = this.f34174b;
                dz0Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dz0Var5.f34506w = floatValue2;
                int i7 = dz0Var5.f34504r;
                dz0Var5.f34508y = i7 + ((int) Math.ceil((dz0Var5.f34503n - i7) * floatValue2));
                dz0Var5.invalidate();
                return;
        }
    }
}
