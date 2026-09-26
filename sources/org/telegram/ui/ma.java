package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ma implements ValueAnimator.AnimatorUpdateListener {
    public final int f35512a;
    public final na f35513b;

    public ma(na naVar, int i10) {
        this.f35512a = i10;
        this.f35513b = naVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35512a) {
            case 0:
                na naVar = this.f35513b;
                naVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.f35783n = floatValue;
                naVar.f35782f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                naVar.d.setAlpha(naVar.f35783n);
                return;
            default:
                na naVar2 = this.f35513b;
                naVar2.getClass();
                naVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.h6.f19461z6;
                org.telegram.ui.ActionBar.d6 d6Var = naVar2.f35780b;
                int d = i0.a.d(naVar2.E, org.telegram.ui.ActionBar.h6.v0(i10, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19243n6, d6Var));
                naVar2.e.b(d);
                naVar2.f35782f.setTextColor(d);
                return;
        }
    }
}
