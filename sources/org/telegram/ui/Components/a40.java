package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class a40 extends AnimatorListenerAdapter {
    public final int f24266a;
    public final boolean f24267b;
    public final b40 f24268c;

    public a40(b40 b40Var, boolean z10, int i10) {
        this.f24266a = i10;
        this.f24268c = b40Var;
        this.f24267b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        org.telegram.ui.eo eoVar;
        bi.o0 o0Var;
        switch (this.f24266a) {
            case 0:
                if (this.f24267b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                b40 b40Var = this.f24268c;
                b40Var.f24543w = f7;
                b40Var.f24538e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                b40Var.f24538e.setPadding(0, 0, 0, (int) (b40Var.f24543w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                boolean z10 = this.f24267b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                b40 b40Var2 = this.f24268c;
                b40Var2.E = f10;
                b40Var2.f24540n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                b40Var2.f24540n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b40Var2.E));
                org.telegram.ui.ik ikVar = b40Var2.f24539f;
                if (ikVar != null && (eoVar = ikVar.f36437a) != null && (o0Var = eoVar.L3) != null) {
                    o0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, b40Var2.E));
                    b40Var2.f24539f.f36437a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, b40Var2.E));
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
