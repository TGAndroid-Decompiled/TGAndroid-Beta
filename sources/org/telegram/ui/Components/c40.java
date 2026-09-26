package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class c40 extends AnimatorListenerAdapter {
    public final int f23201a;
    public final boolean f23202b;
    public final d40 f23203c;

    public c40(d40 d40Var, boolean z10, int i10) {
        this.f23201a = i10;
        this.f23203c = d40Var;
        this.f23202b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        org.telegram.ui.xn xnVar;
        ai.w0 w0Var;
        switch (this.f23201a) {
            case 0:
                if (this.f23202b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                d40 d40Var = this.f23203c;
                d40Var.f23498w = f7;
                d40Var.e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                d40Var.e.setPadding(0, 0, 0, (int) (d40Var.f23498w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                boolean z10 = this.f23202b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                d40 d40Var2 = this.f23203c;
                d40Var2.E = f10;
                d40Var2.f23495n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                d40Var2.f23495n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, d40Var2.E));
                org.telegram.ui.fk fkVar = d40Var2.f23494f;
                if (fkVar != null && (xnVar = fkVar.f40192a) != null && (w0Var = xnVar.L3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, d40Var2.E));
                    d40Var2.f23494f.f40192a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, d40Var2.E));
                }
                d40Var2.h.setAlpha(d40Var2.E);
                if (!z10) {
                    d40Var2.h.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
