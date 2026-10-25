package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.my0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f22368a;
    public final k f22369b;

    public a(k kVar, int i10) {
        this.f22368a = i10;
        this.f22369b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        z zVar;
        switch (this.f22368a) {
            case 0:
                k kVar = this.f22369b;
                kVar.getClass();
                kVar.f22791v1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.b();
                return;
            case 1:
                my0 my0Var = this.f22369b.W0;
                if (my0Var != null) {
                    my0Var.run();
                    return;
                }
                return;
            case 2:
                my0 my0Var2 = this.f22369b.W0;
                if (my0Var2 != null) {
                    my0Var2.run();
                    return;
                }
                return;
            case 3:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar2 = this.f22369b;
                kVar2.f22774o0 = floatValue;
                if (kVar2.f22743a != null && kVar2.R0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), kVar2.f22774o0);
                    kVar2.f22743a.y(lerp, dp, dp, lerp);
                    kVar2.invalidate();
                }
                if (kVar2.P0 && (zVar = kVar2.E) != null) {
                    zVar.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar2.f22774o0));
                }
                my0 my0Var3 = kVar2.W0;
                if (my0Var3 != null) {
                    my0Var3.run();
                    return;
                }
                return;
            default:
                k kVar3 = this.f22369b;
                kVar3.getClass();
                kVar3.f22791v1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.b();
                return;
        }
    }
}
