package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.xy0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f21168a;
    public final k f21169b;

    public a(k kVar, int i10) {
        this.f21168a = i10;
        this.f21169b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        z zVar;
        switch (this.f21168a) {
            case 0:
                xy0 xy0Var = this.f21169b.R0;
                if (xy0Var != null) {
                    xy0Var.run();
                    return;
                }
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = this.f21169b;
                kVar.f21548l0 = floatValue;
                if (kVar.f21521a != null && kVar.N0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), kVar.f21548l0);
                    kVar.f21521a.q(lerp, dp, dp, lerp);
                    kVar.invalidate();
                }
                if (kVar.L0 && (zVar = kVar.B) != null) {
                    zVar.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar.f21548l0));
                }
                xy0 xy0Var2 = kVar.R0;
                if (xy0Var2 != null) {
                    xy0Var2.run();
                    return;
                }
                return;
            case 2:
                xy0 xy0Var3 = this.f21169b.R0;
                if (xy0Var3 != null) {
                    xy0Var3.run();
                    return;
                }
                return;
            case 3:
                k kVar2 = this.f21169b;
                kVar2.getClass();
                kVar2.f21554o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.b();
                return;
            default:
                k kVar3 = this.f21169b;
                kVar3.getClass();
                kVar3.f21554o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.b();
                return;
        }
    }
}
