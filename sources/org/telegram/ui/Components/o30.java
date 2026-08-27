package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class o30 implements ValueAnimator.AnimatorUpdateListener {

    public final int f31148a;

    public final q30 f31149b;

    public o30(q30 q30Var, int i10) {
        this.f31148a = i10;
        this.f31149b = q30Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.sn snVar;
        hh.f1 f1Var;
        switch (this.f31148a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q30 q30Var = this.f31149b;
                q30Var.f31773w = fFloatValue;
                q30Var.f31768e.setTranslationY(fFloatValue * AndroidUtilities.dp(48.0f));
                q30Var.f31768e.setPadding(0, 0, 0, (int) (q30Var.f31773w * AndroidUtilities.dp(48.0f)));
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q30 q30Var2 = this.f31149b;
                q30Var2.A = fFloatValue2;
                q30Var2.f31770n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, fFloatValue2));
                q30Var2.f31770n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, q30Var2.A));
                org.telegram.ui.yj yjVar = q30Var2.f31769f;
                if (yjVar != null && (snVar = yjVar.f42977a) != null && (f1Var = snVar.H3) != null) {
                    f1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, q30Var2.A));
                    q30Var2.f31769f.f42977a.H3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, q30Var2.A));
                }
                q30Var2.h.setAlpha(q30Var2.A);
                break;
        }
    }
}
