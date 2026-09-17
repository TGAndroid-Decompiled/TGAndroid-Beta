package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class oa implements ValueAnimator.AnimatorUpdateListener {
    public final int f36279a;
    public final pa f36280b;

    public oa(pa paVar, int i10) {
        this.f36279a = i10;
        this.f36280b = paVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36279a) {
            case 0:
                pa paVar = this.f36280b;
                paVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                paVar.f36574n = floatValue;
                paVar.f36573f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                paVar.d.setAlpha(paVar.f36574n);
                return;
            default:
                pa paVar2 = this.f36280b;
                paVar2.getClass();
                paVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.j6.f19263z6;
                org.telegram.ui.ActionBar.f6 f6Var = paVar2.f36571b;
                int d = i0.a.d(paVar2.E, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19047n6, f6Var));
                paVar2.e.b(d);
                paVar2.f36573f.setTextColor(d);
                return;
        }
    }
}
