package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.e01;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f18624a;
    public final k f18625b;

    public a(k kVar, int i10) {
        this.f18624a = i10;
        this.f18625b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        z zVar;
        switch (this.f18624a) {
            case 0:
                k kVar = this.f18625b;
                kVar.getClass();
                kVar.f19518s1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.b();
                return;
            case 1:
                e01 e01Var = this.f18625b.V0;
                if (e01Var != null) {
                    e01Var.run();
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar2 = this.f18625b;
                kVar2.f19507o0 = floatValue;
                if (kVar2.f19476a != null && kVar2.R0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), kVar2.f19507o0);
                    kVar2.f19476a.r(lerp, dp, dp, lerp);
                    kVar2.invalidate();
                }
                if (kVar2.P0 && (zVar = kVar2.E) != null) {
                    zVar.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar2.f19507o0));
                }
                e01 e01Var2 = kVar2.V0;
                if (e01Var2 != null) {
                    e01Var2.run();
                    return;
                }
                return;
            case 3:
                e01 e01Var3 = this.f18625b.V0;
                if (e01Var3 != null) {
                    e01Var3.run();
                    return;
                }
                return;
            default:
                k kVar3 = this.f18625b;
                kVar3.getClass();
                kVar3.f19518s1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.b();
                return;
        }
    }
}
