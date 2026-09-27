package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class c40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23220a;
    public final e40 f23221b;

    public c40(e40 e40Var, int i10) {
        this.f23220a = i10;
        this.f23221b = e40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.yn ynVar;
        ai.w0 w0Var;
        switch (this.f23220a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e40 e40Var = this.f23221b;
                e40Var.f23872w = floatValue;
                e40Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                e40Var.e.setPadding(0, 0, 0, (int) (e40Var.f23872w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e40 e40Var2 = this.f23221b;
                e40Var2.E = floatValue2;
                e40Var2.f23869n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                e40Var2.f23869n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, e40Var2.E));
                org.telegram.ui.hk hkVar = e40Var2.f23868f;
                if (hkVar != null && (ynVar = hkVar.f40556a) != null && (w0Var = ynVar.L3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, e40Var2.E));
                    e40Var2.f23868f.f40556a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, e40Var2.E));
                }
                e40Var2.h.setAlpha(e40Var2.E);
                return;
        }
    }
}
