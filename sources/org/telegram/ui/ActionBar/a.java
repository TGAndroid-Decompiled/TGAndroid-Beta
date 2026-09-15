package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.e01;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f18439a;
    public final k f18440b;

    public a(k kVar, int i10) {
        this.f18439a = i10;
        this.f18440b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        z zVar;
        switch (this.f18439a) {
            case 0:
                e01 e01Var = this.f18440b.V0;
                if (e01Var != null) {
                    e01Var.run();
                    return;
                }
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = this.f18440b;
                kVar.f19318o0 = floatValue;
                if (kVar.f19287a != null && kVar.R0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), kVar.f19318o0);
                    kVar.f19287a.r(lerp, dp, dp, lerp);
                    kVar.invalidate();
                }
                if (kVar.P0 && (zVar = kVar.E) != null) {
                    zVar.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar.f19318o0));
                }
                e01 e01Var2 = kVar.V0;
                if (e01Var2 != null) {
                    e01Var2.run();
                    return;
                }
                return;
            case 2:
                e01 e01Var3 = this.f18440b.V0;
                if (e01Var3 != null) {
                    e01Var3.run();
                    return;
                }
                return;
            case 3:
                k kVar2 = this.f18440b;
                kVar2.getClass();
                kVar2.f19329s1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.b();
                return;
            default:
                k kVar3 = this.f18440b;
                kVar3.getClass();
                kVar3.f19329s1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.b();
                return;
        }
    }
}
