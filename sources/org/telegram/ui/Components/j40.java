package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class j40 extends AnimatorListenerAdapter {
    public final int f27512a;
    public final boolean f27513b;
    public final k40 f27514c;

    public j40(k40 k40Var, boolean z10, int i10) {
        this.f27512a = i10;
        this.f27514c = k40Var;
        this.f27513b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        org.telegram.ui.tn tnVar;
        ai.u1 u1Var;
        switch (this.f27512a) {
            case 0:
                if (this.f27513b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                k40 k40Var = this.f27514c;
                k40Var.f27863w = f7;
                k40Var.e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                k40Var.e.setPadding(0, 0, 0, (int) (k40Var.f27863w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                boolean z10 = this.f27513b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k40 k40Var2 = this.f27514c;
                k40Var2.E = f10;
                k40Var2.f27860n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                k40Var2.f27860n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, k40Var2.E));
                org.telegram.ui.bk bkVar = k40Var2.f27859f;
                if (bkVar != null && (tnVar = bkVar.f42477a) != null && (u1Var = tnVar.X3) != null) {
                    u1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, k40Var2.E));
                    k40Var2.f27859f.f42477a.X3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, k40Var2.E));
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
