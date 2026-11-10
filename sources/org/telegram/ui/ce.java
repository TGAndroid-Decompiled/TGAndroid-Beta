package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ce implements ValueAnimator.AnimatorUpdateListener {
    public final int f44334a;
    public final cn f44335b;

    public ce(cn cnVar, int i7) {
        this.f44334a = i7;
        this.f44335b = cnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f44334a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cn cnVar = this.f44335b;
                cnVar.Y8 = floatValue;
                ql qlVar = cnVar.l1;
                if (qlVar != null) {
                    qlVar.invalidate();
                    cnVar.f44741z0.invalidate();
                    return;
                }
                return;
            case 1:
                cn cnVar2 = this.f44335b;
                cnVar2.getClass();
                cnVar2.f44706w3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cnVar2.Sc();
                return;
            case 2:
                cn cnVar3 = this.f44335b;
                cnVar3.getClass();
                cnVar3.f44706w3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cnVar3.Sc();
                return;
            case 3:
                cn cnVar4 = this.f44335b;
                cnVar4.getClass();
                cnVar4.Za = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cnVar4.L9();
                return;
            default:
                cn cnVar5 = this.f44335b;
                cnVar5.getClass();
                cnVar5.Za = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cnVar5.L9();
                return;
        }
    }
}
