package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class na implements ValueAnimator.AnimatorUpdateListener {
    public final int f36434a;
    public final oa f36435b;

    public na(oa oaVar, int i10) {
        this.f36434a = i10;
        this.f36435b = oaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36434a) {
            case 0:
                oa oaVar = this.f36435b;
                oaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oaVar.f36702n = floatValue;
                oaVar.f36701f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                oaVar.d.setAlpha(oaVar.f36702n);
                return;
            default:
                oa oaVar2 = this.f36435b;
                oaVar2.getClass();
                oaVar2.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.j6.f20273z6;
                org.telegram.ui.ActionBar.f6 f6Var = oaVar2.f36699b;
                int d = i0.a.d(oaVar2.B, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20060n6, f6Var));
                oaVar2.e.b(d);
                oaVar2.f36701f.setTextColor(d);
                return;
        }
    }
}
