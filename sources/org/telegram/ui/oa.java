package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class oa implements ValueAnimator.AnimatorUpdateListener {
    public final int f39145a;
    public final pa f39146b;

    public oa(pa paVar, int i10) {
        this.f39145a = i10;
        this.f39146b = paVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39145a) {
            case 0:
                pa paVar = this.f39146b;
                paVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                paVar.f39416n = floatValue;
                paVar.f39415f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                paVar.d.setAlpha(paVar.f39416n);
                return;
            default:
                pa paVar2 = this.f39146b;
                paVar2.getClass();
                paVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.i6.f21223z6;
                org.telegram.ui.ActionBar.d6 d6Var = paVar2.f39412b;
                int d = i0.a.d(paVar2.E, org.telegram.ui.ActionBar.i6.v0(i10, d6Var), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21003n6, d6Var));
                paVar2.f39414e.b(d);
                paVar2.f39415f.setTextColor(d);
                return;
        }
    }
}
