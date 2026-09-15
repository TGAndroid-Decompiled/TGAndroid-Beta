package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class z30 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30472a;
    public final b40 f30473b;

    public z30(b40 b40Var, int i10) {
        this.f30472a = i10;
        this.f30473b = b40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.co coVar;
        ai.w0 w0Var;
        switch (this.f30472a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b40 b40Var = this.f30473b;
                b40Var.f22610w = floatValue;
                b40Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                b40Var.e.setPadding(0, 0, 0, (int) (b40Var.f22610w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b40 b40Var2 = this.f30473b;
                b40Var2.E = floatValue2;
                b40Var2.f22607n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                b40Var2.f22607n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b40Var2.E));
                org.telegram.ui.ik ikVar = b40Var2.f22606f;
                if (ikVar != null && (coVar = ikVar.f33375a) != null && (w0Var = coVar.L3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, b40Var2.E));
                    b40Var2.f22606f.f33375a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, b40Var2.E));
                }
                b40Var2.h.setAlpha(b40Var2.E);
                return;
        }
    }
}
