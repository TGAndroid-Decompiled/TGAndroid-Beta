package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class jh implements ValueAnimator.AnimatorUpdateListener {
    public final int f27499a;
    public final aj f27500b;

    public jh(aj ajVar, int i10) {
        this.f27499a = i10;
        this.f27500b = ajVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27499a) {
            case 0:
                this.f27500b.f2();
                return;
            case 1:
                this.f27500b.G0.invalidate();
                return;
            case 2:
                aj.o(this.f27500b, valueAnimator);
                return;
            case 3:
                aj ajVar = this.f27500b;
                ajVar.getClass();
                ajVar.O1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                aj ajVar2 = this.f27500b;
                si siVar = ajVar2.B0;
                il ilVar = ajVar2.f24395w0;
                if (siVar == ilVar && ilVar != null) {
                    ilVar.invalidate();
                    return;
                }
                return;
            default:
                this.f27500b.f2();
                return;
        }
    }
}
