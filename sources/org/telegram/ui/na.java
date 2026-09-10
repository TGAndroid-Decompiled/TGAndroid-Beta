package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class na implements ValueAnimator.AnimatorUpdateListener {
    public final int f35167a;
    public final oa f35168b;

    public na(oa oaVar, int i10) {
        this.f35167a = i10;
        this.f35168b = oaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35167a) {
            case 0:
                oa oaVar = this.f35168b;
                oaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oaVar.f35439n = floatValue;
                oaVar.f35438f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                oaVar.d.setAlpha(oaVar.f35439n);
                return;
            default:
                oa oaVar2 = this.f35168b;
                oaVar2.getClass();
                oaVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.j6.f18325z6;
                org.telegram.ui.ActionBar.f6 f6Var = oaVar2.f35436b;
                int d = i0.a.d(oaVar2.E, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18110n6, f6Var));
                oaVar2.e.b(d);
                oaVar2.f35438f.setTextColor(d);
                return;
        }
    }
}
