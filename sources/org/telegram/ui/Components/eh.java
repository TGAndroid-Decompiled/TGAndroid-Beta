package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class eh implements ValueAnimator.AnimatorUpdateListener {
    public final int f25912a;
    public final ti f25913b;

    public eh(ti tiVar, int i10) {
        this.f25912a = i10;
        this.f25913b = tiVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25912a) {
            case 0:
                this.f25913b.f2();
                return;
            case 1:
                this.f25913b.G0.invalidate();
                return;
            case 2:
                ti.n(this.f25913b, valueAnimator);
                return;
            case 3:
                ti tiVar = this.f25913b;
                tiVar.getClass();
                tiVar.O1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                ti tiVar2 = this.f25913b;
                li liVar = tiVar2.B0;
                al alVar = tiVar2.f30589w0;
                if (liVar == alVar && alVar != null) {
                    alVar.invalidate();
                    return;
                }
                return;
            default:
                this.f25913b.f2();
                return;
        }
    }
}
