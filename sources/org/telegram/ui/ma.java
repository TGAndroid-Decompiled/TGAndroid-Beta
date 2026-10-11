package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ma implements ValueAnimator.AnimatorUpdateListener {
    public final int f39851a;
    public final na f39852b;

    public ma(na naVar, int i10) {
        this.f39851a = i10;
        this.f39852b = naVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39851a) {
            case 0:
                na naVar = this.f39852b;
                naVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.f40172n = floatValue;
                naVar.f40171f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                naVar.d.setAlpha(naVar.f40172n);
                return;
            default:
                na naVar2 = this.f39852b;
                naVar2.getClass();
                naVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.h6.f21189z6;
                org.telegram.ui.ActionBar.d6 d6Var = naVar2.f40168b;
                int d = i0.a.d(naVar2.E, org.telegram.ui.ActionBar.h6.w0(i10, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20971n6, d6Var));
                naVar2.f40170e.b(d);
                naVar2.f40171f.setTextColor(d);
                return;
        }
    }
}
