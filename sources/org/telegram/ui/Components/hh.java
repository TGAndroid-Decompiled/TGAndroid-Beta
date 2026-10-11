package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class hh implements ValueAnimator.AnimatorUpdateListener {
    public final int f26990a;
    public final yi f26991b;

    public hh(yi yiVar, int i10) {
        this.f26990a = i10;
        this.f26991b = yiVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26990a) {
            case 0:
                this.f26991b.f2();
                return;
            case 1:
                this.f26991b.G0.invalidate();
                return;
            case 2:
                yi.o(this.f26991b, valueAnimator);
                return;
            case 3:
                yi yiVar = this.f26991b;
                yiVar.getClass();
                yiVar.O1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                yi yiVar2 = this.f26991b;
                qi qiVar = yiVar2.B0;
                gl glVar = yiVar2.f33269w0;
                if (qiVar == glVar && glVar != null) {
                    glVar.invalidate();
                    return;
                }
                return;
            default:
                this.f26991b.f2();
                return;
        }
    }
}
