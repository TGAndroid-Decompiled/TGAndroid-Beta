package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class c40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23182a;
    public final e40 f23183b;

    public c40(e40 e40Var, int i10) {
        this.f23182a = i10;
        this.f23183b = e40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.xn xnVar;
        ai.w0 w0Var;
        switch (this.f23182a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e40 e40Var = this.f23183b;
                e40Var.f23844w = floatValue;
                e40Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                e40Var.e.setPadding(0, 0, 0, (int) (e40Var.f23844w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e40 e40Var2 = this.f23183b;
                e40Var2.E = floatValue2;
                e40Var2.f23841n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                e40Var2.f23841n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, e40Var2.E));
                org.telegram.ui.fk fkVar = e40Var2.f23840f;
                if (fkVar != null && (xnVar = fkVar.f40193a) != null && (w0Var = xnVar.L3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, e40Var2.E));
                    e40Var2.f23840f.f40193a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, e40Var2.E));
                }
                e40Var2.h.setAlpha(e40Var2.E);
                return;
        }
    }
}
