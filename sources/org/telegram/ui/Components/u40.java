package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class u40 extends AnimatorListenerAdapter {
    public final int f31047a;
    public final boolean f31048b;
    public final v40 f31049c;

    public u40(v40 v40Var, boolean z10, int i10) {
        this.f31047a = i10;
        this.f31049c = v40Var;
        this.f31048b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        org.telegram.ui.fo foVar;
        ai.w0 w0Var;
        switch (this.f31047a) {
            case 0:
                if (this.f31048b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                v40 v40Var = this.f31049c;
                v40Var.f31391w = f7;
                v40Var.f31386e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                v40Var.f31386e.setPadding(0, 0, 0, (int) (v40Var.f31391w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                boolean z10 = this.f31048b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                v40 v40Var2 = this.f31049c;
                v40Var2.E = f10;
                v40Var2.f31388n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                v40Var2.f31388n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, v40Var2.E));
                org.telegram.ui.nk nkVar = v40Var2.f31387f;
                if (nkVar != null && (foVar = nkVar.f38105a) != null && (w0Var = foVar.L3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, v40Var2.E));
                    v40Var2.f31387f.f38105a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, v40Var2.E));
                }
                v40Var2.h.setAlpha(v40Var2.E);
                if (!z10) {
                    v40Var2.h.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
