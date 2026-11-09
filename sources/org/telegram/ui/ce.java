package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ce implements ValueAnimator.AnimatorUpdateListener {
    public final int f44292a;
    public final cn f44293b;

    public ce(cn cnVar, int i7) {
        this.f44292a = i7;
        this.f44293b = cnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f44292a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cn cnVar = this.f44293b;
                cnVar.Y8 = floatValue;
                ql qlVar = cnVar.l1;
                if (qlVar != null) {
                    qlVar.invalidate();
                    cnVar.f44700z0.invalidate();
                    return;
                }
                return;
            case 1:
                cn cnVar2 = this.f44293b;
                cnVar2.getClass();
                cnVar2.f44665w3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cnVar2.Sc();
                return;
            case 2:
                cn cnVar3 = this.f44293b;
                cnVar3.getClass();
                cnVar3.f44665w3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cnVar3.Sc();
                return;
            case 3:
                cn cnVar4 = this.f44293b;
                cnVar4.getClass();
                cnVar4.Za = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cnVar4.L9();
                return;
            default:
                cn cnVar5 = this.f44293b;
                cnVar5.getClass();
                cnVar5.Za = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cnVar5.L9();
                return;
        }
    }
}
