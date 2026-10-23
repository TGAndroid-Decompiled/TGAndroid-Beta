package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class eh implements ValueAnimator.AnimatorUpdateListener {
    public final int f25971a;
    public final ti f25972b;

    public eh(ti tiVar, int i10) {
        this.f25971a = i10;
        this.f25972b = tiVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f25971a) {
            case 0:
                this.f25972b.j2();
                return;
            case 1:
                this.f25972b.G0.invalidate();
                return;
            case 2:
                ti.m(this.f25972b, valueAnimator);
                return;
            case 3:
                ti tiVar = this.f25972b;
                tiVar.getClass();
                tiVar.S1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                ti tiVar2 = this.f25972b;
                li liVar = tiVar2.B0;
                al alVar = tiVar2.f30783w0;
                if (liVar == alVar && alVar != null) {
                    alVar.invalidate();
                    return;
                }
                return;
            default:
                this.f25972b.j2();
                return;
        }
    }
}
