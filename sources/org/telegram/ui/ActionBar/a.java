package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.oy0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f22371a;
    public final k f22372b;

    public a(k kVar, int i10) {
        this.f22371a = i10;
        this.f22372b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        z zVar;
        switch (this.f22371a) {
            case 0:
                k kVar = this.f22372b;
                kVar.getClass();
                kVar.f22794v1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.b();
                return;
            case 1:
                oy0 oy0Var = this.f22372b.W0;
                if (oy0Var != null) {
                    oy0Var.run();
                    return;
                }
                return;
            case 2:
                oy0 oy0Var2 = this.f22372b.W0;
                if (oy0Var2 != null) {
                    oy0Var2.run();
                    return;
                }
                return;
            case 3:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar2 = this.f22372b;
                kVar2.f22777o0 = floatValue;
                if (kVar2.f22746a != null && kVar2.R0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), kVar2.f22777o0);
                    kVar2.f22746a.y(lerp, dp, dp, lerp);
                    kVar2.invalidate();
                }
                if (kVar2.P0 && (zVar = kVar2.E) != null) {
                    zVar.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar2.f22777o0));
                }
                oy0 oy0Var3 = kVar2.W0;
                if (oy0Var3 != null) {
                    oy0Var3.run();
                    return;
                }
                return;
            default:
                k kVar3 = this.f22372b;
                kVar3.getClass();
                kVar3.f22794v1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.b();
                return;
        }
    }
}
