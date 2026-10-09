package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class r40 extends AnimatorListenerAdapter {
    public final int f30349a;
    public final boolean f30350b;
    public final s40 f30351c;

    public r40(s40 s40Var, boolean z10, int i10) {
        this.f30349a = i10;
        this.f30351c = s40Var;
        this.f30350b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        org.telegram.ui.ao aoVar;
        ai.w0 w0Var;
        switch (this.f30349a) {
            case 0:
                if (this.f30350b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                s40 s40Var = this.f30351c;
                s40Var.f30635w = f7;
                s40Var.f30630e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                s40Var.f30630e.setPadding(0, 0, 0, (int) (s40Var.f30635w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                boolean z10 = this.f30350b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                s40 s40Var2 = this.f30351c;
                s40Var2.E = f10;
                s40Var2.f30632n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                s40Var2.f30632n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, s40Var2.E));
                org.telegram.ui.jk jkVar = s40Var2.f30631f;
                if (jkVar != null && (aoVar = jkVar.f36357a) != null && (w0Var = aoVar.L3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, s40Var2.E));
                    s40Var2.f30631f.f36357a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, s40Var2.E));
                }
                s40Var2.h.setAlpha(s40Var2.E);
                if (!z10) {
                    s40Var2.h.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
