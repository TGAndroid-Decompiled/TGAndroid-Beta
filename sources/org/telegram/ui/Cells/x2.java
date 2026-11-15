package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class x2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32023a;
    public final z2 f32024b;

    public x2(z2 z2Var, int i7) {
        this.f32023a = i7;
        this.f32024b = z2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32023a) {
            case 0:
                z2 z2Var = this.f32024b;
                z2Var.getClass();
                z2Var.f32099a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2Var.requestLayout();
                q0.a aVar = z2Var.f32101c;
                if (aVar != null) {
                    aVar.accept(Float.valueOf(z2Var.f32099a));
                    return;
                }
                return;
            default:
                z2 z2Var2 = this.f32024b;
                z2Var2.getClass();
                z2Var2.f32099a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2Var2.requestLayout();
                q0.a aVar2 = z2Var2.f32101c;
                if (aVar2 != null) {
                    aVar2.accept(Float.valueOf(z2Var2.f32099a));
                    return;
                }
                return;
        }
    }
}
