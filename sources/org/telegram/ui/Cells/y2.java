package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
public final class y2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32453a;
    public final a3 f32454b;

    public y2(a3 a3Var, int i7) {
        this.f32453a = i7;
        this.f32454b = a3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32453a) {
            case 0:
                a3 a3Var = this.f32454b;
                a3Var.getClass();
                a3Var.f30367a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a3Var.requestLayout();
                q0.a aVar = a3Var.f30369c;
                if (aVar != null) {
                    aVar.accept(Float.valueOf(a3Var.f30367a));
                    return;
                }
                return;
            default:
                a3 a3Var2 = this.f32454b;
                a3Var2.getClass();
                a3Var2.f30367a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a3Var2.requestLayout();
                q0.a aVar2 = a3Var2.f30369c;
                if (aVar2 != null) {
                    aVar2.accept(Float.valueOf(a3Var2.f30367a));
                    return;
                }
                return;
        }
    }
}
