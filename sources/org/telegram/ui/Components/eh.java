package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class eh implements ValueAnimator.AnimatorUpdateListener {
    public final int f27845a;
    public final ti f27846b;

    public eh(ti tiVar, int i10) {
        this.f27845a = i10;
        this.f27846b = tiVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27845a) {
            case 0:
                this.f27846b.j2();
                return;
            case 1:
                this.f27846b.G0.invalidate();
                return;
            case 2:
                ti.p(this.f27846b, valueAnimator);
                return;
            case 3:
                ti tiVar = this.f27846b;
                tiVar.getClass();
                tiVar.S1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                ti tiVar2 = this.f27846b;
                li liVar = tiVar2.B0;
                al alVar = tiVar2.f33043w0;
                if (liVar == alVar && alVar != null) {
                    alVar.invalidate();
                    return;
                }
                return;
            default:
                this.f27846b.j2();
                return;
        }
    }
}
