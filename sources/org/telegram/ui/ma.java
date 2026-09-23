package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ma implements ValueAnimator.AnimatorUpdateListener {
    public final int f35223a;
    public final na f35224b;

    public ma(na naVar, int i10) {
        this.f35223a = i10;
        this.f35224b = naVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35223a) {
            case 0:
                na naVar = this.f35224b;
                naVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.f35467n = floatValue;
                naVar.f35466f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                naVar.d.setAlpha(naVar.f35467n);
                return;
            default:
                na naVar2 = this.f35224b;
                naVar2.getClass();
                naVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.h6.f19189z6;
                org.telegram.ui.ActionBar.d6 d6Var = naVar2.f35464b;
                int d = i0.a.d(naVar2.E, org.telegram.ui.ActionBar.h6.v0(i10, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18973n6, d6Var));
                naVar2.e.b(d);
                naVar2.f35466f.setTextColor(d);
                return;
        }
    }
}
