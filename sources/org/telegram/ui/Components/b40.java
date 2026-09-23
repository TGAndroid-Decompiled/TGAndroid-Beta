package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class b40 extends AnimatorListenerAdapter {
    public final int f22573a;
    public final boolean f22574b;
    public final c40 f22575c;

    public b40(c40 c40Var, boolean z10, int i10) {
        this.f22573a = i10;
        this.f22575c = c40Var;
        this.f22574b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        org.telegram.ui.yn ynVar;
        ai.w0 w0Var;
        switch (this.f22573a) {
            case 0:
                if (this.f22574b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                c40 c40Var = this.f22575c;
                c40Var.f22919w = f7;
                c40Var.e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                c40Var.e.setPadding(0, 0, 0, (int) (c40Var.f22919w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                boolean z10 = this.f22574b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                c40 c40Var2 = this.f22575c;
                c40Var2.E = f10;
                c40Var2.f22916n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                c40Var2.f22916n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, c40Var2.E));
                org.telegram.ui.fk fkVar = c40Var2.f22915f;
                if (fkVar != null && (ynVar = fkVar.f40196a) != null && (w0Var = ynVar.L3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, c40Var2.E));
                    c40Var2.f22915f.f40196a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, c40Var2.E));
                }
                c40Var2.h.setAlpha(c40Var2.E);
                if (!z10) {
                    c40Var2.h.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
