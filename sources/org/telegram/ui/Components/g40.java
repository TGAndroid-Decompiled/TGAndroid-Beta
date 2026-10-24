package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class g40 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26554a;
    public final i40 f26555b;

    public g40(i40 i40Var, int i10) {
        this.f26554a = i10;
        this.f26555b = i40Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.tn tnVar;
        ai.u1 u1Var;
        switch (this.f26554a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i40 i40Var = this.f26555b;
                i40Var.f27287w = floatValue;
                i40Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                i40Var.e.setPadding(0, 0, 0, (int) (i40Var.f27287w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i40 i40Var2 = this.f26555b;
                i40Var2.E = floatValue2;
                i40Var2.f27284n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                i40Var2.f27284n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, i40Var2.E));
                org.telegram.ui.bk bkVar = i40Var2.f27283f;
                if (bkVar != null && (tnVar = bkVar.f42454a) != null && (u1Var = tnVar.X3) != null) {
                    u1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, i40Var2.E));
                    i40Var2.f27283f.f42454a.X3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, i40Var2.E));
                }
                i40Var2.h.setAlpha(i40Var2.E);
                return;
        }
    }
}
