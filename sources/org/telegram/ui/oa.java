package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class oa implements ValueAnimator.AnimatorUpdateListener {
    public final int f36284a;
    public final pa f36285b;

    public oa(pa paVar, int i10) {
        this.f36284a = i10;
        this.f36285b = paVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36284a) {
            case 0:
                pa paVar = this.f36285b;
                paVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                paVar.f36579n = floatValue;
                paVar.f36578f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                paVar.d.setAlpha(paVar.f36579n);
                return;
            default:
                pa paVar2 = this.f36285b;
                paVar2.getClass();
                paVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.j6.f19264z6;
                org.telegram.ui.ActionBar.f6 f6Var = paVar2.f36576b;
                int d = i0.a.d(paVar2.E, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19048n6, f6Var));
                paVar2.e.b(d);
                paVar2.f36578f.setTextColor(d);
                return;
        }
    }
}
