package org.telegram.ui;

import android.animation.ValueAnimator;
public final class me implements ValueAnimator.AnimatorUpdateListener {
    public final int f39521a;
    public final sn f39522b;

    public me(sn snVar, int i10) {
        this.f39521a = i10;
        this.f39522b = snVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39521a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sn snVar = this.f39522b;
                snVar.W8 = floatValue;
                km kmVar = snVar.f41561j1;
                if (kmVar != null) {
                    kmVar.invalidate();
                    snVar.f41737x0.invalidate();
                    return;
                }
                return;
            case 1:
                sn snVar2 = this.f39522b;
                snVar2.getClass();
                snVar2.f41701u3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar2.sc();
                return;
            case 2:
                sn snVar3 = this.f39522b;
                snVar3.getClass();
                snVar3.f41701u3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar3.sc();
                return;
            case 3:
                sn snVar4 = this.f39522b;
                snVar4.getClass();
                snVar4.Qa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar4.t9();
                return;
            default:
                sn snVar5 = this.f39522b;
                snVar5.getClass();
                snVar5.Qa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar5.t9();
                return;
        }
    }
}
