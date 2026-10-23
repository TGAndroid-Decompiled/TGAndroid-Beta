package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class oa implements ValueAnimator.AnimatorUpdateListener {
    public final int f39809a;
    public final pa f39810b;

    public oa(pa paVar, int i10) {
        this.f39809a = i10;
        this.f39810b = paVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39809a) {
            case 0:
                pa paVar = this.f39810b;
                paVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                paVar.f40170n = floatValue;
                paVar.f40169f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                paVar.d.setAlpha(paVar.f40170n);
                return;
            default:
                pa paVar2 = this.f39810b;
                paVar2.getClass();
                paVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.h6.f21399z6;
                org.telegram.ui.ActionBar.d6 d6Var = paVar2.f40167b;
                int f7 = i0.a.f(paVar2.E, org.telegram.ui.ActionBar.h6.w0(i10, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21177n6, d6Var));
                paVar2.e.b(f7);
                paVar2.f40169f.setTextColor(f7);
                return;
        }
    }
}
