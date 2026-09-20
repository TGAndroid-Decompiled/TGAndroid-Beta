package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class z30 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30700a;
    public final b40 f30701b;

    public z30(b40 b40Var, int i10) {
        this.f30700a = i10;
        this.f30701b = b40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ao aoVar;
        ai.w0 w0Var;
        switch (this.f30700a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b40 b40Var = this.f30701b;
                b40Var.f22883w = floatValue;
                b40Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                b40Var.e.setPadding(0, 0, 0, (int) (b40Var.f22883w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b40 b40Var2 = this.f30701b;
                b40Var2.E = floatValue2;
                b40Var2.f22880n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                b40Var2.f22880n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b40Var2.E));
                org.telegram.ui.hk hkVar = b40Var2.f22879f;
                if (hkVar != null && (aoVar = hkVar.f32501a) != null && (w0Var = aoVar.L3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, b40Var2.E));
                    b40Var2.f22879f.f32501a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, b40Var2.E));
                }
                b40Var2.h.setAlpha(b40Var2.E);
                return;
        }
    }
}
