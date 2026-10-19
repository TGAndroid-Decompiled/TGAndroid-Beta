package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class eh implements ValueAnimator.AnimatorUpdateListener {
    public final int f25910a;
    public final ti f25911b;

    public eh(ti tiVar, int i10) {
        this.f25910a = i10;
        this.f25911b = tiVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25910a) {
            case 0:
                this.f25911b.f2();
                return;
            case 1:
                this.f25911b.G0.invalidate();
                return;
            case 2:
                ti.n(this.f25911b, valueAnimator);
                return;
            case 3:
                ti tiVar = this.f25911b;
                tiVar.getClass();
                tiVar.O1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                ti tiVar2 = this.f25911b;
                li liVar = tiVar2.B0;
                al alVar = tiVar2.f30587w0;
                if (liVar == alVar && alVar != null) {
                    alVar.invalidate();
                    return;
                }
                return;
            default:
                this.f25911b.f2();
                return;
        }
    }
}
