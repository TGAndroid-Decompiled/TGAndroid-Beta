package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class oa implements ValueAnimator.AnimatorUpdateListener {
    public final int f40136a;
    public final pa f40137b;

    public oa(pa paVar, int i10) {
        this.f40136a = i10;
        this.f40137b = paVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40136a) {
            case 0:
                pa paVar = this.f40137b;
                paVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                paVar.f40418n = floatValue;
                paVar.f40417f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                paVar.d.setAlpha(paVar.f40418n);
                return;
            default:
                pa paVar2 = this.f40137b;
                paVar2.getClass();
                paVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.k6.f21589z6;
                org.telegram.ui.ActionBar.g6 g6Var = paVar2.f40415b;
                int f7 = i0.a.f(paVar2.E, org.telegram.ui.ActionBar.k6.w0(i10, g6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21367n6, g6Var));
                paVar2.e.b(f7);
                paVar2.f40417f.setTextColor(f7);
                return;
        }
    }
}
