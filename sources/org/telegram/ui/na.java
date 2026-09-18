package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class na implements ValueAnimator.AnimatorUpdateListener {
    public final int f35876a;
    public final oa f35877b;

    public na(oa oaVar, int i10) {
        this.f35876a = i10;
        this.f35877b = oaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35876a) {
            case 0:
                oa oaVar = this.f35877b;
                oaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oaVar.f36146n = floatValue;
                oaVar.f36145f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                oaVar.d.setAlpha(oaVar.f36146n);
                return;
            default:
                oa oaVar2 = this.f35877b;
                oaVar2.getClass();
                oaVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.j6.f19464z6;
                org.telegram.ui.ActionBar.e6 e6Var = oaVar2.f36143b;
                int d = i0.a.d(oaVar2.E, org.telegram.ui.ActionBar.j6.v0(i10, e6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19247n6, e6Var));
                oaVar2.e.b(d);
                oaVar2.f36145f.setTextColor(d);
                return;
        }
    }
}
