package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.qy0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f20606a;
    public final k f20607b;

    public a(k kVar, int i10) {
        this.f20606a = i10;
        this.f20607b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        y yVar;
        switch (this.f20606a) {
            case 0:
                k kVar = this.f20607b;
                kVar.getClass();
                kVar.f21509s1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.b();
                return;
            case 1:
                qy0 qy0Var = this.f20607b.U0;
                if (qy0Var != null) {
                    qy0Var.run();
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar2 = this.f20607b;
                kVar2.f21498o0 = floatValue;
                if (kVar2.f21467a != null && kVar2.Q0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), kVar2.f21498o0);
                    kVar2.f21467a.r(lerp, dp, dp, lerp);
                    kVar2.invalidate();
                }
                if (kVar2.O0 && (yVar = kVar2.E) != null) {
                    yVar.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar2.f21498o0));
                }
                qy0 qy0Var2 = kVar2.U0;
                if (qy0Var2 != null) {
                    qy0Var2.run();
                    return;
                }
                return;
            case 3:
                qy0 qy0Var3 = this.f20607b.U0;
                if (qy0Var3 != null) {
                    qy0Var3.run();
                    return;
                }
                return;
            default:
                k kVar3 = this.f20607b;
                kVar3.getClass();
                kVar3.f21509s1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.b();
                return;
        }
    }
}
