package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class dz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34621a;
    public final ez0 f34622b;

    public dz0(ez0 ez0Var, int i7) {
        this.f34621a = i7;
        this.f34622b = ez0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34621a) {
            case 0:
                ez0 ez0Var = this.f34622b;
                ez0Var.getClass();
                ez0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ez0Var.invalidate();
                return;
            case 1:
                ez0 ez0Var2 = this.f34622b;
                ez0Var2.getClass();
                ez0Var2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ez0Var2.invalidate();
                return;
            case 2:
                ez0 ez0Var3 = this.f34622b;
                ez0Var3.getClass();
                ez0Var3.f35040f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ez0Var3.invalidate();
                return;
            case 3:
                ez0 ez0Var4 = this.f34622b;
                ez0Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ez0Var4.f35043s = floatValue;
                ez0Var4.f35045x = (int) ((ez0Var4.h * floatValue) + 0);
                ez0Var4.invalidate();
                return;
            default:
                ez0 ez0Var5 = this.f34622b;
                ez0Var5.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ez0Var5.f35044w = floatValue2;
                int i7 = ez0Var5.f35042r;
                ez0Var5.f35046y = i7 + ((int) Math.ceil((ez0Var5.f35041n - i7) * floatValue2));
                ez0Var5.invalidate();
                return;
        }
    }
}
