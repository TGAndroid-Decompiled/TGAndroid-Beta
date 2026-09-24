package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ma implements ValueAnimator.AnimatorUpdateListener {
    public final int f35500a;
    public final na f35501b;

    public ma(na naVar, int i10) {
        this.f35500a = i10;
        this.f35501b = naVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35500a) {
            case 0:
                na naVar = this.f35501b;
                naVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.f35770n = floatValue;
                naVar.f35769f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                naVar.d.setAlpha(naVar.f35770n);
                return;
            default:
                na naVar2 = this.f35501b;
                naVar2.getClass();
                naVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.h6.f19447z6;
                org.telegram.ui.ActionBar.d6 d6Var = naVar2.f35767b;
                int d = i0.a.d(naVar2.E, org.telegram.ui.ActionBar.h6.v0(i10, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19229n6, d6Var));
                naVar2.e.b(d);
                naVar2.f35769f.setTextColor(d);
                return;
        }
    }
}
