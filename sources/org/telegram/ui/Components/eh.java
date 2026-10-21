package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class eh implements ValueAnimator.AnimatorUpdateListener {
    public final int f25902a;
    public final ti f25903b;

    public eh(ti tiVar, int i10) {
        this.f25902a = i10;
        this.f25903b = tiVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25902a) {
            case 0:
                this.f25903b.f2();
                return;
            case 1:
                this.f25903b.G0.invalidate();
                return;
            case 2:
                ti.n(this.f25903b, valueAnimator);
                return;
            case 3:
                ti tiVar = this.f25903b;
                tiVar.getClass();
                tiVar.O1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                ti tiVar2 = this.f25903b;
                li liVar = tiVar2.B0;
                al alVar = tiVar2.f30599w0;
                if (liVar == alVar && alVar != null) {
                    alVar.invalidate();
                    return;
                }
                return;
            default:
                this.f25903b.f2();
                return;
        }
    }
}
