package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class fh implements ValueAnimator.AnimatorUpdateListener {
    public final int f25031a;
    public final vi f25032b;

    public fh(vi viVar, int i10) {
        this.f25031a = i10;
        this.f25032b = viVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25031a) {
            case 0:
                this.f25032b.f2();
                return;
            case 1:
                this.f25032b.G0.invalidate();
                return;
            case 2:
                vi.n(this.f25032b, valueAnimator);
                return;
            case 3:
                vi viVar = this.f25032b;
                viVar.getClass();
                viVar.O1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                vi viVar2 = this.f25032b;
                ni niVar = viVar2.B0;
                dl dlVar = viVar2.f30054w0;
                if (niVar == dlVar && dlVar != null) {
                    dlVar.invalidate();
                    return;
                }
                return;
            default:
                this.f25032b.f2();
                return;
        }
    }
}
