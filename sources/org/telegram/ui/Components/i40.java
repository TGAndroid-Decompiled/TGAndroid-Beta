package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class i40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27120a;
    public final k40 f27121b;

    public i40(k40 k40Var, int i10) {
        this.f27120a = i10;
        this.f27121b = k40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.rn rnVar;
        ai.u1 u1Var;
        switch (this.f27120a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k40 k40Var = this.f27121b;
                k40Var.f27749w = floatValue;
                k40Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                k40Var.e.setPadding(0, 0, 0, (int) (k40Var.f27749w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k40 k40Var2 = this.f27121b;
                k40Var2.E = floatValue2;
                k40Var2.f27746n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                k40Var2.f27746n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, k40Var2.E));
                org.telegram.ui.ak akVar = k40Var2.f27745f;
                if (akVar != null && (rnVar = akVar.f41500a) != null && (u1Var = rnVar.L3) != null) {
                    u1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, k40Var2.E));
                    k40Var2.f27745f.f41500a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, k40Var2.E));
                }
                k40Var2.h.setAlpha(k40Var2.E);
                return;
        }
    }
}
