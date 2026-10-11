package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class r40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30335a;
    public final t40 f30336b;

    public r40(t40 t40Var, int i10) {
        this.f30335a = i10;
        this.f30336b = t40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ao aoVar;
        ai.w0 w0Var;
        switch (this.f30335a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t40 t40Var = this.f30336b;
                t40Var.f30989w = floatValue;
                t40Var.f30984e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                t40Var.f30984e.setPadding(0, 0, 0, (int) (t40Var.f30989w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t40 t40Var2 = this.f30336b;
                t40Var2.E = floatValue2;
                t40Var2.f30986n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                t40Var2.f30986n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, t40Var2.E));
                org.telegram.ui.jk jkVar = t40Var2.f30985f;
                if (jkVar != null && (aoVar = jkVar.f36419a) != null && (w0Var = aoVar.L3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, t40Var2.E));
                    t40Var2.f30985f.f36419a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, t40Var2.E));
                }
                t40Var2.h.setAlpha(t40Var2.E);
                return;
        }
    }
}
