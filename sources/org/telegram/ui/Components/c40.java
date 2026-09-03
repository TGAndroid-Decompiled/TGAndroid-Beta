package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class c40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f23811a;
    public final e40 f23812b;

    public c40(e40 e40Var, int i10) {
        this.f23811a = i10;
        this.f23812b = e40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.ao aoVar;
        lh.e1 e1Var;
        switch (this.f23811a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e40 e40Var = this.f23812b;
                e40Var.f24465w = floatValue;
                e40Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                e40Var.e.setPadding(0, 0, 0, (int) (e40Var.f24465w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e40 e40Var2 = this.f23812b;
                e40Var2.B = floatValue2;
                e40Var2.f24462n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                e40Var2.f24462n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, e40Var2.B));
                org.telegram.ui.hk hkVar = e40Var2.f24461f;
                if (hkVar != null && (aoVar = hkVar.f32924a) != null && (e1Var = aoVar.I3) != null) {
                    e1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, e40Var2.B));
                    e40Var2.f24461f.f32924a.I3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, e40Var2.B));
                }
                e40Var2.h.setAlpha(e40Var2.B);
                return;
        }
    }
}
