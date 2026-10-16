package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class fh implements ValueAnimator.AnimatorUpdateListener {
    public final int f24729a;
    public final vi f24730b;

    public fh(vi viVar, int i10) {
        this.f24729a = i10;
        this.f24730b = viVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24729a) {
            case 0:
                this.f24730b.f2();
                return;
            case 1:
                this.f24730b.G0.invalidate();
                return;
            case 2:
                vi.n(this.f24730b, valueAnimator);
                return;
            case 3:
                vi viVar = this.f24730b;
                viVar.getClass();
                viVar.O1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                vi viVar2 = this.f24730b;
                ni niVar = viVar2.B0;
                cl clVar = viVar2.f29725w0;
                if (niVar == clVar && clVar != null) {
                    clVar.invalidate();
                    return;
                }
                return;
            default:
                this.f24730b.f2();
                return;
        }
    }
}
