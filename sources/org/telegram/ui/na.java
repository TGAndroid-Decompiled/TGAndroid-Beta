package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class na implements ValueAnimator.AnimatorUpdateListener {
    public final int f40162a;
    public final oa f40163b;

    public na(oa oaVar, int i10) {
        this.f40162a = i10;
        this.f40163b = oaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40162a) {
            case 0:
                oa oaVar = this.f40163b;
                oaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oaVar.f40497n = floatValue;
                oaVar.f40496f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                oaVar.d.setAlpha(oaVar.f40497n);
                return;
            default:
                oa oaVar2 = this.f40163b;
                oaVar2.getClass();
                oaVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.i6.f21203z6;
                org.telegram.ui.ActionBar.e6 e6Var = oaVar2.f40493b;
                int d = i0.a.d(oaVar2.E, org.telegram.ui.ActionBar.i6.w0(i10, e6Var), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20986n6, e6Var));
                oaVar2.f40495e.b(d);
                oaVar2.f40496f.setTextColor(d);
                return;
        }
    }
}
