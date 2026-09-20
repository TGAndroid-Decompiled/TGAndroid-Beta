package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.e01;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f18656a;
    public final k f18657b;

    public a(k kVar, int i10) {
        this.f18656a = i10;
        this.f18657b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        z zVar;
        switch (this.f18656a) {
            case 0:
                k kVar = this.f18657b;
                kVar.getClass();
                kVar.f19550s1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.b();
                return;
            case 1:
                e01 e01Var = this.f18657b.V0;
                if (e01Var != null) {
                    e01Var.run();
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar2 = this.f18657b;
                kVar2.f19539o0 = floatValue;
                if (kVar2.f19508a != null && kVar2.R0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), kVar2.f19539o0);
                    kVar2.f19508a.r(lerp, dp, dp, lerp);
                    kVar2.invalidate();
                }
                if (kVar2.P0 && (zVar = kVar2.E) != null) {
                    zVar.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar2.f19539o0));
                }
                e01 e01Var2 = kVar2.V0;
                if (e01Var2 != null) {
                    e01Var2.run();
                    return;
                }
                return;
            case 3:
                e01 e01Var3 = this.f18657b.V0;
                if (e01Var3 != null) {
                    e01Var3.run();
                    return;
                }
                return;
            default:
                k kVar3 = this.f18657b;
                kVar3.getClass();
                kVar3.f19550s1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.b();
                return;
        }
    }
}
