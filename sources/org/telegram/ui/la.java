package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class la implements ValueAnimator.AnimatorUpdateListener {
    public final int f38692a;
    public final ma f38693b;

    public la(ma maVar, int i10) {
        this.f38692a = i10;
        this.f38693b = maVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38692a) {
            case 0:
                ma maVar = this.f38693b;
                maVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                maVar.f39030n = floatValue;
                maVar.f39029f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                maVar.d.setAlpha(maVar.f39030n);
                return;
            default:
                ma maVar2 = this.f38693b;
                maVar2.getClass();
                maVar2.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.k6.f22053z6;
                org.telegram.ui.ActionBar.g6 g6Var = maVar2.f39026b;
                int d = i0.a.d(maVar2.B, org.telegram.ui.ActionBar.k6.v0(i10, g6Var), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21839n6, g6Var));
                maVar2.f39028e.b(d);
                maVar2.f39029f.setTextColor(d);
                return;
        }
    }
}
