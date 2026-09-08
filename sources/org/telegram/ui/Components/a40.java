package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class a40 extends AnimatorListenerAdapter {
    public final int f24293a;
    public final boolean f24294b;
    public final b40 f24295c;

    public a40(b40 b40Var, boolean z10, int i10) {
        this.f24293a = i10;
        this.f24295c = b40Var;
        this.f24294b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        org.telegram.ui.eo eoVar;
        bi.o0 o0Var;
        switch (this.f24293a) {
            case 0:
                if (this.f24294b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                b40 b40Var = this.f24295c;
                b40Var.f24570w = f7;
                b40Var.f24565e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                b40Var.f24565e.setPadding(0, 0, 0, (int) (b40Var.f24570w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                boolean z10 = this.f24294b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                b40 b40Var2 = this.f24295c;
                b40Var2.E = f10;
                b40Var2.f24567n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                b40Var2.f24567n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b40Var2.E));
                org.telegram.ui.ik ikVar = b40Var2.f24566f;
                if (ikVar != null && (eoVar = ikVar.f36464a) != null && (o0Var = eoVar.L3) != null) {
                    o0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, b40Var2.E));
                    b40Var2.f24566f.f36464a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, b40Var2.E));
                }
                b40Var2.h.setAlpha(b40Var2.E);
                if (!z10) {
                    b40Var2.h.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
