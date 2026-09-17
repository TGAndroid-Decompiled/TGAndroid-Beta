package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ma implements ValueAnimator.AnimatorUpdateListener {
    public final int f38628a;
    public final na f38629b;

    public ma(na naVar, int i10) {
        this.f38628a = i10;
        this.f38629b = naVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38628a) {
            case 0:
                na naVar = this.f38629b;
                naVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.f38915n = floatValue;
                naVar.f38914f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                naVar.d.setAlpha(naVar.f38915n);
                return;
            default:
                na naVar2 = this.f38629b;
                naVar2.getClass();
                naVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.j6.f21089z6;
                org.telegram.ui.ActionBar.f6 f6Var = naVar2.f38911b;
                int d = i0.a.d(naVar2.E, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20874n6, f6Var));
                naVar2.f38913e.b(d);
                naVar2.f38914f.setTextColor(d);
                return;
        }
    }
}
