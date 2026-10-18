package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class j40 extends AnimatorListenerAdapter {
    public final int f27407a;
    public final boolean f27408b;
    public final k40 f27409c;

    public j40(k40 k40Var, boolean z10, int i10) {
        this.f27407a = i10;
        this.f27409c = k40Var;
        this.f27408b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        org.telegram.ui.tn tnVar;
        ai.u1 u1Var;
        switch (this.f27407a) {
            case 0:
                if (this.f27408b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                k40 k40Var = this.f27409c;
                k40Var.f27740w = f7;
                k40Var.e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                k40Var.e.setPadding(0, 0, 0, (int) (k40Var.f27740w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                boolean z10 = this.f27408b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k40 k40Var2 = this.f27409c;
                k40Var2.E = f10;
                k40Var2.f27737n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                k40Var2.f27737n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, k40Var2.E));
                org.telegram.ui.ck ckVar = k40Var2.f27736f;
                if (ckVar != null && (tnVar = ckVar.f41989a) != null && (u1Var = tnVar.L3) != null) {
                    u1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, k40Var2.E));
                    k40Var2.f27736f.f41989a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, k40Var2.E));
                }
                k40Var2.h.setAlpha(k40Var2.E);
                if (!z10) {
                    k40Var2.h.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
