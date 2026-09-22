package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ma implements ValueAnimator.AnimatorUpdateListener {
    public final int f35660a;
    public final na f35661b;

    public ma(na naVar, int i10) {
        this.f35660a = i10;
        this.f35661b = naVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35660a) {
            case 0:
                na naVar = this.f35661b;
                naVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.f35934n = floatValue;
                naVar.f35933f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                naVar.d.setAlpha(naVar.f35934n);
                return;
            default:
                na naVar2 = this.f35661b;
                naVar2.getClass();
                naVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.i6.f19234z6;
                org.telegram.ui.ActionBar.e6 e6Var = naVar2.f35931b;
                int d = i0.a.d(naVar2.E, org.telegram.ui.ActionBar.i6.v0(i10, e6Var), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19018n6, e6Var));
                naVar2.e.b(d);
                naVar2.f35933f.setTextColor(d);
                return;
        }
    }
}
