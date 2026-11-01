package org.telegram.ui;

import android.animation.ValueAnimator;
public final class oe implements ValueAnimator.AnimatorUpdateListener {
    public final int f40141a;
    public final un f40142b;

    public oe(un unVar, int i10) {
        this.f40141a = i10;
        this.f40142b = unVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40141a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                un unVar = this.f40142b;
                unVar.Y8 = floatValue;
                km kmVar = unVar.l1;
                if (kmVar != null) {
                    kmVar.invalidate();
                    unVar.f42303z0.invalidate();
                    return;
                }
                return;
            case 1:
                un unVar2 = this.f40142b;
                unVar2.getClass();
                unVar2.f42268w3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar2.Kc();
                return;
            case 2:
                un unVar3 = this.f40142b;
                unVar3.getClass();
                unVar3.f42268w3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar3.Kc();
                return;
            case 3:
                un unVar4 = this.f40142b;
                unVar4.getClass();
                unVar4.Xa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar4.F9();
                return;
            default:
                un unVar5 = this.f40142b;
                unVar5.getClass();
                unVar5.Xa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar5.F9();
                return;
        }
    }
}
