package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.g01;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f18449a;
    public final k f18450b;

    public a(k kVar, int i10) {
        this.f18449a = i10;
        this.f18450b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        a0 a0Var;
        switch (this.f18449a) {
            case 0:
                g01 g01Var = this.f18450b.V0;
                if (g01Var != null) {
                    g01Var.run();
                    return;
                }
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = this.f18450b;
                kVar.f19307o0 = floatValue;
                if (kVar.f19276a != null && kVar.R0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), kVar.f19307o0);
                    kVar.f19276a.r(lerp, dp, dp, lerp);
                    kVar.invalidate();
                }
                if (kVar.P0 && (a0Var = kVar.E) != null) {
                    a0Var.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar.f19307o0));
                }
                g01 g01Var2 = kVar.V0;
                if (g01Var2 != null) {
                    g01Var2.run();
                    return;
                }
                return;
            case 2:
                g01 g01Var3 = this.f18450b.V0;
                if (g01Var3 != null) {
                    g01Var3.run();
                    return;
                }
                return;
            case 3:
                k kVar2 = this.f18450b;
                kVar2.getClass();
                kVar2.f19318s1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.b();
                return;
            default:
                k kVar3 = this.f18450b;
                kVar3.getClass();
                kVar3.f19318s1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.b();
                return;
        }
    }
}
