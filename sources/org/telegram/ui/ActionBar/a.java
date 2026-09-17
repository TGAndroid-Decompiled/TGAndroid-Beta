package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.g01;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f18448a;
    public final k f18449b;

    public a(k kVar, int i10) {
        this.f18448a = i10;
        this.f18449b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        a0 a0Var;
        switch (this.f18448a) {
            case 0:
                g01 g01Var = this.f18449b.V0;
                if (g01Var != null) {
                    g01Var.run();
                    return;
                }
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = this.f18449b;
                kVar.f19306o0 = floatValue;
                if (kVar.f19275a != null && kVar.R0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), kVar.f19306o0);
                    kVar.f19275a.r(lerp, dp, dp, lerp);
                    kVar.invalidate();
                }
                if (kVar.P0 && (a0Var = kVar.E) != null) {
                    a0Var.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar.f19306o0));
                }
                g01 g01Var2 = kVar.V0;
                if (g01Var2 != null) {
                    g01Var2.run();
                    return;
                }
                return;
            case 2:
                g01 g01Var3 = this.f18449b.V0;
                if (g01Var3 != null) {
                    g01Var3.run();
                    return;
                }
                return;
            case 3:
                k kVar2 = this.f18449b;
                kVar2.getClass();
                kVar2.f19317s1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.b();
                return;
            default:
                k kVar3 = this.f18449b;
                kVar3.getClass();
                kVar3.f19317s1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.b();
                return;
        }
    }
}
