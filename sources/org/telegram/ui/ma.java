package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ma implements ValueAnimator.AnimatorUpdateListener {
    public final int f35602a;
    public final na f35603b;

    public ma(na naVar, int i10) {
        this.f35602a = i10;
        this.f35603b = naVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35602a) {
            case 0:
                na naVar = this.f35603b;
                naVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.f35894n = floatValue;
                naVar.f35893f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                naVar.d.setAlpha(naVar.f35894n);
                return;
            default:
                na naVar2 = this.f35603b;
                naVar2.getClass();
                naVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.h6.f19478z6;
                org.telegram.ui.ActionBar.d6 d6Var = naVar2.f35891b;
                int d = i0.a.d(naVar2.E, org.telegram.ui.ActionBar.h6.v0(i10, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19260n6, d6Var));
                naVar2.e.b(d);
                naVar2.f35893f.setTextColor(d);
                return;
        }
    }
}
