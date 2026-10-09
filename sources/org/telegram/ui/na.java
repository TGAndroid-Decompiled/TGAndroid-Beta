package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class na implements ValueAnimator.AnimatorUpdateListener {
    public final int f40116a;
    public final oa f40117b;

    public na(oa oaVar, int i10) {
        this.f40116a = i10;
        this.f40117b = oaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40116a) {
            case 0:
                oa oaVar = this.f40117b;
                oaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oaVar.f40451n = floatValue;
                oaVar.f40450f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                oaVar.d.setAlpha(oaVar.f40451n);
                return;
            default:
                oa oaVar2 = this.f40117b;
                oaVar2.getClass();
                oaVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.i6.f21199z6;
                org.telegram.ui.ActionBar.e6 e6Var = oaVar2.f40447b;
                int d = i0.a.d(oaVar2.E, org.telegram.ui.ActionBar.i6.w0(i10, e6Var), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20982n6, e6Var));
                oaVar2.f40449e.b(d);
                oaVar2.f40450f.setTextColor(d);
                return;
        }
    }
}
