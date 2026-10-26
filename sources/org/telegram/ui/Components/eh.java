package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class eh implements ValueAnimator.AnimatorUpdateListener {
    public final int f27863a;
    public final ti f27864b;

    public eh(ti tiVar, int i10) {
        this.f27863a = i10;
        this.f27864b = tiVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27863a) {
            case 0:
                this.f27864b.i2();
                return;
            case 1:
                this.f27864b.G0.invalidate();
                return;
            case 2:
                ti.r(this.f27864b, valueAnimator);
                return;
            case 3:
                ti tiVar = this.f27864b;
                tiVar.getClass();
                tiVar.R1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                ti tiVar2 = this.f27864b;
                li liVar = tiVar2.B0;
                al alVar = tiVar2.f33074w0;
                if (liVar == alVar && alVar != null) {
                    alVar.invalidate();
                    return;
                }
                return;
            default:
                this.f27864b.i2();
                return;
        }
    }
}
