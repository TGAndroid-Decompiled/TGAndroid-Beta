package org.telegram.ui;

import android.animation.ValueAnimator;
public final class me implements ValueAnimator.AnimatorUpdateListener {
    public final int f39572a;
    public final sn f39573b;

    public me(sn snVar, int i10) {
        this.f39572a = i10;
        this.f39573b = snVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39572a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sn snVar = this.f39573b;
                snVar.W8 = floatValue;
                km kmVar = snVar.f41558j1;
                if (kmVar != null) {
                    kmVar.invalidate();
                    snVar.f41734x0.invalidate();
                    return;
                }
                return;
            case 1:
                sn snVar2 = this.f39573b;
                snVar2.getClass();
                snVar2.f41698u3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar2.sc();
                return;
            case 2:
                sn snVar3 = this.f39573b;
                snVar3.getClass();
                snVar3.f41698u3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar3.sc();
                return;
            case 3:
                sn snVar4 = this.f39573b;
                snVar4.getClass();
                snVar4.Qa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar4.t9();
                return;
            default:
                sn snVar5 = this.f39573b;
                snVar5.getClass();
                snVar5.Qa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar5.t9();
                return;
        }
    }
}
