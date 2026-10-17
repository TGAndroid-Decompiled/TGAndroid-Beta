package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class eh implements ValueAnimator.AnimatorUpdateListener {
    public final int f25921a;
    public final ti f25922b;

    public eh(ti tiVar, int i10) {
        this.f25921a = i10;
        this.f25922b = tiVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25921a) {
            case 0:
                this.f25922b.f2();
                return;
            case 1:
                this.f25922b.G0.invalidate();
                return;
            case 2:
                ti.n(this.f25922b, valueAnimator);
                return;
            case 3:
                ti tiVar = this.f25922b;
                tiVar.getClass();
                tiVar.O1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                ti tiVar2 = this.f25922b;
                li liVar = tiVar2.B0;
                al alVar = tiVar2.f30627w0;
                if (liVar == alVar && alVar != null) {
                    alVar.invalidate();
                    return;
                }
                return;
            default:
                this.f25922b.f2();
                return;
        }
    }
}
