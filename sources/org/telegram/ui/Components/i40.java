package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class i40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27116a;
    public final k40 f27117b;

    public i40(k40 k40Var, int i10) {
        this.f27116a = i10;
        this.f27117b = k40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.rn rnVar;
        ai.u1 u1Var;
        switch (this.f27116a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k40 k40Var = this.f27117b;
                k40Var.f27745w = floatValue;
                k40Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                k40Var.e.setPadding(0, 0, 0, (int) (k40Var.f27745w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k40 k40Var2 = this.f27117b;
                k40Var2.E = floatValue2;
                k40Var2.f27742n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                k40Var2.f27742n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, k40Var2.E));
                org.telegram.ui.ak akVar = k40Var2.f27741f;
                if (akVar != null && (rnVar = akVar.f41496a) != null && (u1Var = rnVar.L3) != null) {
                    u1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, k40Var2.E));
                    k40Var2.f27741f.f41496a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, k40Var2.E));
                }
                k40Var2.h.setAlpha(k40Var2.E);
                return;
        }
    }
}
