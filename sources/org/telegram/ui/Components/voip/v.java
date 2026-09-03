package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.b50;
import org.telegram.ui.e60;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f29959a;
    public final k0 f29960b;

    public v(k0 k0Var, int i10) {
        this.f29959a = i10;
        this.f29960b = k0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f29959a) {
            case 0:
                k0 k0Var = this.f29960b;
                k0Var.getClass();
                k0Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.invalidate();
                return;
            default:
                k0 k0Var2 = this.f29960b;
                k0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var2.f29687c = floatValue;
                e60 e60Var = k0Var2.f29693g0;
                e60Var.f33709w1.setAlpha(1.0f - floatValue);
                b50 b50Var = e60Var.L;
                if (b50Var.getTag() != null) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                b50Var.setAlpha((1.0f - e60Var.X1.f29687c) * f10);
                e60Var.E1(e60Var.f33703v0);
                k0Var2.l();
                return;
        }
    }
}
