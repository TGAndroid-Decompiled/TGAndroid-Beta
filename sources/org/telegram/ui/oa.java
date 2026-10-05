package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class oa implements ValueAnimator.AnimatorUpdateListener {
    public final int f39138a;
    public final pa f39139b;

    public oa(pa paVar, int i10) {
        this.f39138a = i10;
        this.f39139b = paVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39138a) {
            case 0:
                pa paVar = this.f39139b;
                paVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                paVar.f39434n = floatValue;
                paVar.f39433f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                paVar.d.setAlpha(paVar.f39434n);
                return;
            default:
                pa paVar2 = this.f39139b;
                paVar2.getClass();
                paVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.i6.f21233z6;
                org.telegram.ui.ActionBar.d6 d6Var = paVar2.f39430b;
                int d = i0.a.d(paVar2.E, org.telegram.ui.ActionBar.i6.v0(i10, d6Var), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21013n6, d6Var));
                paVar2.f39432e.b(d);
                paVar2.f39433f.setTextColor(d);
                return;
        }
    }
}
