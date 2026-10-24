package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ch implements ValueAnimator.AnimatorUpdateListener {
    public final int f25309a;
    public final ri f25310b;

    public ch(ri riVar, int i10) {
        this.f25309a = i10;
        this.f25310b = riVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25309a) {
            case 0:
                this.f25310b.j2();
                return;
            case 1:
                this.f25310b.G0.invalidate();
                return;
            case 2:
                ri.m(this.f25310b, valueAnimator);
                return;
            case 3:
                ri riVar = this.f25310b;
                riVar.getClass();
                riVar.S1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                ri riVar2 = this.f25310b;
                ji jiVar = riVar2.B0;
                yk ykVar = riVar2.f30199w0;
                if (jiVar == ykVar && ykVar != null) {
                    ykVar.invalidate();
                    return;
                }
                return;
            default:
                this.f25310b.j2();
                return;
        }
    }
}
