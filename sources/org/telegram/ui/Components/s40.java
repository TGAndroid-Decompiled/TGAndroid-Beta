package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class s40 extends AnimatorListenerAdapter {
    public final int f30660a;
    public final boolean f30661b;
    public final t40 f30662c;

    public s40(t40 t40Var, boolean z10, int i10) {
        this.f30660a = i10;
        this.f30662c = t40Var;
        this.f30661b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        org.telegram.ui.ao aoVar;
        ai.w0 w0Var;
        switch (this.f30660a) {
            case 0:
                if (this.f30661b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                t40 t40Var = this.f30662c;
                t40Var.f30981w = f7;
                t40Var.f30976e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                t40Var.f30976e.setPadding(0, 0, 0, (int) (t40Var.f30981w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                boolean z10 = this.f30661b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                t40 t40Var2 = this.f30662c;
                t40Var2.E = f10;
                t40Var2.f30978n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                t40Var2.f30978n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, t40Var2.E));
                org.telegram.ui.jk jkVar = t40Var2.f30977f;
                if (jkVar != null && (aoVar = jkVar.f36403a) != null && (w0Var = aoVar.L3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, t40Var2.E));
                    t40Var2.f30977f.f36403a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, t40Var2.E));
                }
                t40Var2.h.setAlpha(t40Var2.E);
                if (!z10) {
                    t40Var2.h.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
