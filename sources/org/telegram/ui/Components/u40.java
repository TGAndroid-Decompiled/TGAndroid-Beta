package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class u40 extends AnimatorListenerAdapter {
    public final int f31042a;
    public final boolean f31043b;
    public final v40 f31044c;

    public u40(v40 v40Var, boolean z10, int i10) {
        this.f31042a = i10;
        this.f31044c = v40Var;
        this.f31043b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        org.telegram.ui.fo foVar;
        ai.w0 w0Var;
        switch (this.f31042a) {
            case 0:
                if (this.f31043b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                v40 v40Var = this.f31044c;
                v40Var.f31391w = f7;
                v40Var.f31386e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                v40Var.f31386e.setPadding(0, 0, 0, (int) (v40Var.f31391w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                boolean z10 = this.f31043b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                v40 v40Var2 = this.f31044c;
                v40Var2.E = f10;
                v40Var2.f31388n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                v40Var2.f31388n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, v40Var2.E));
                org.telegram.ui.nk nkVar = v40Var2.f31387f;
                if (nkVar != null && (foVar = nkVar.f38109a) != null && (w0Var = foVar.L3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, v40Var2.E));
                    v40Var2.f31387f.f38109a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, v40Var2.E));
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
