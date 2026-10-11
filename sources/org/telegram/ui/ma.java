package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ma implements ValueAnimator.AnimatorUpdateListener {
    public final int f39885a;
    public final na f39886b;

    public ma(na naVar, int i10) {
        this.f39885a = i10;
        this.f39886b = naVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39885a) {
            case 0:
                na naVar = this.f39886b;
                naVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.f40206n = floatValue;
                naVar.f40205f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                naVar.d.setAlpha(naVar.f40206n);
                return;
            default:
                na naVar2 = this.f39886b;
                naVar2.getClass();
                naVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.h6.f21225z6;
                org.telegram.ui.ActionBar.d6 d6Var = naVar2.f40202b;
                int d = i0.a.d(naVar2.E, org.telegram.ui.ActionBar.h6.w0(i10, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21007n6, d6Var));
                naVar2.f40204e.b(d);
                naVar2.f40205f.setTextColor(d);
                return;
        }
    }
}
