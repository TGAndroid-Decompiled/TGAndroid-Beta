package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

public final class in implements ValueAnimator.AnimatorUpdateListener {

    public final int f39133a;

    public final jn f39134b;

    public in(jn jnVar, int i10) {
        this.f39133a = i10;
        this.f39134b = jnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39133a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jn jnVar = this.f39134b;
                jnVar.f39401f = fFloatValue;
                View view = jnVar.h.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                break;
            case 1:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jn jnVar2 = this.f39134b;
                jnVar2.f39401f = fFloatValue2;
                View view2 = jnVar2.h.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                }
                break;
            default:
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jn jnVar3 = this.f39134b;
                jnVar3.f39401f = fFloatValue3;
                View view3 = jnVar3.h.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                }
                break;
        }
    }
}
