package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class la implements ValueAnimator.AnimatorUpdateListener {
    public final int f36018a;
    public final ma f36019b;

    public la(ma maVar, int i10) {
        this.f36018a = i10;
        this.f36019b = maVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36018a) {
            case 0:
                ma maVar = this.f36019b;
                maVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                maVar.f36248n = floatValue;
                maVar.f36247f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                maVar.d.setAlpha(maVar.f36248n);
                return;
            default:
                ma maVar2 = this.f36019b;
                maVar2.getClass();
                maVar2.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.j6.f20298z6;
                org.telegram.ui.ActionBar.f6 f6Var = maVar2.f36245b;
                int d = i0.a.d(maVar2.B, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20085n6, f6Var));
                maVar2.e.b(d);
                maVar2.f36247f.setTextColor(d);
                return;
        }
    }
}
