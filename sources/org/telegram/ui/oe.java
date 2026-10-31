package org.telegram.ui;

import android.animation.ValueAnimator;
public final class oe implements ValueAnimator.AnimatorUpdateListener {
    public final int f40245a;
    public final un f40246b;

    public oe(un unVar, int i10) {
        this.f40245a = i10;
        this.f40246b = unVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40245a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                un unVar = this.f40246b;
                unVar.Y8 = floatValue;
                km kmVar = unVar.l1;
                if (kmVar != null) {
                    kmVar.invalidate();
                    unVar.f42492z0.invalidate();
                    return;
                }
                return;
            case 1:
                un unVar2 = this.f40246b;
                unVar2.getClass();
                unVar2.f42457w3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar2.Fc();
                return;
            case 2:
                un unVar3 = this.f40246b;
                unVar3.getClass();
                unVar3.f42457w3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar3.Fc();
                return;
            case 3:
                un unVar4 = this.f40246b;
                unVar4.getClass();
                unVar4.Xa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar4.A9();
                return;
            default:
                un unVar5 = this.f40246b;
                unVar5.getClass();
                unVar5.Xa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar5.A9();
                return;
        }
    }
}
