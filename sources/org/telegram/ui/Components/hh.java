package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class hh implements ValueAnimator.AnimatorUpdateListener {
    public final int f27069a;
    public final yi f27070b;

    public hh(yi yiVar, int i10) {
        this.f27069a = i10;
        this.f27070b = yiVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27069a) {
            case 0:
                this.f27070b.f2();
                return;
            case 1:
                this.f27070b.G0.invalidate();
                return;
            case 2:
                yi.o(this.f27070b, valueAnimator);
                return;
            case 3:
                yi yiVar = this.f27070b;
                yiVar.getClass();
                yiVar.O1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                yi yiVar2 = this.f27070b;
                qi qiVar = yiVar2.B0;
                gl glVar = yiVar2.f33281w0;
                if (qiVar == glVar && glVar != null) {
                    glVar.invalidate();
                    return;
                }
                return;
            default:
                this.f27070b.f2();
                return;
        }
    }
}
