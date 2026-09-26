package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class b40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22893a;
    public final d40 f22894b;

    public b40(d40 d40Var, int i10) {
        this.f22893a = i10;
        this.f22894b = d40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.xn xnVar;
        ai.w0 w0Var;
        switch (this.f22893a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d40 d40Var = this.f22894b;
                d40Var.f23498w = floatValue;
                d40Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                d40Var.e.setPadding(0, 0, 0, (int) (d40Var.f23498w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d40 d40Var2 = this.f22894b;
                d40Var2.E = floatValue2;
                d40Var2.f23495n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                d40Var2.f23495n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, d40Var2.E));
                org.telegram.ui.fk fkVar = d40Var2.f23494f;
                if (fkVar != null && (xnVar = fkVar.f40192a) != null && (w0Var = xnVar.L3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, d40Var2.E));
                    d40Var2.f23494f.f40192a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, d40Var2.E));
                }
                d40Var2.h.setAlpha(d40Var2.E);
                return;
        }
    }
}
