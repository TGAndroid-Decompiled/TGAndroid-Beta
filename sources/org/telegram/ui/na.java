package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class na implements ValueAnimator.AnimatorUpdateListener {
    public final int f35962a;
    public final oa f35963b;

    public na(oa oaVar, int i10) {
        this.f35962a = i10;
        this.f35963b = oaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35962a) {
            case 0:
                oa oaVar = this.f35963b;
                oaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oaVar.f36246n = floatValue;
                oaVar.f36245f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                oaVar.d.setAlpha(oaVar.f36246n);
                return;
            default:
                oa oaVar2 = this.f35963b;
                oaVar2.getClass();
                oaVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.j6.f19511z6;
                org.telegram.ui.ActionBar.f6 f6Var = oaVar2.f36243b;
                int d = i0.a.d(oaVar2.E, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19294n6, f6Var));
                oaVar2.e.b(d);
                oaVar2.f36245f.setTextColor(d);
                return;
        }
    }
}
