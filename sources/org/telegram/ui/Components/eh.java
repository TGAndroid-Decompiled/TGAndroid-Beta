package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class eh implements ValueAnimator.AnimatorUpdateListener {
    public final int f27861a;
    public final ti f27862b;

    public eh(ti tiVar, int i10) {
        this.f27861a = i10;
        this.f27862b = tiVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27861a) {
            case 0:
                this.f27862b.i2();
                return;
            case 1:
                this.f27862b.G0.invalidate();
                return;
            case 2:
                ti.r(this.f27862b, valueAnimator);
                return;
            case 3:
                ti tiVar = this.f27862b;
                tiVar.getClass();
                tiVar.R1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                ti tiVar2 = this.f27862b;
                li liVar = tiVar2.B0;
                al alVar = tiVar2.f33071w0;
                if (liVar == alVar && alVar != null) {
                    alVar.invalidate();
                    return;
                }
                return;
            default:
                this.f27862b.i2();
                return;
        }
    }
}
