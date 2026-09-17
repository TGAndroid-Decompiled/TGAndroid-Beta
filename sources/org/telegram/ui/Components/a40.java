package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class a40 extends AnimatorListenerAdapter {
    public final int f24267a;
    public final boolean f24268b;
    public final b40 f24269c;

    public a40(b40 b40Var, boolean z10, int i10) {
        this.f24267a = i10;
        this.f24269c = b40Var;
        this.f24268b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        org.telegram.ui.eo eoVar;
        bi.o0 o0Var;
        switch (this.f24267a) {
            case 0:
                if (this.f24268b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                b40 b40Var = this.f24269c;
                b40Var.f24544w = f7;
                b40Var.f24539e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                b40Var.f24539e.setPadding(0, 0, 0, (int) (b40Var.f24544w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                boolean z10 = this.f24268b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                b40 b40Var2 = this.f24269c;
                b40Var2.E = f10;
                b40Var2.f24541n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                b40Var2.f24541n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b40Var2.E));
                org.telegram.ui.ik ikVar = b40Var2.f24540f;
                if (ikVar != null && (eoVar = ikVar.f36438a) != null && (o0Var = eoVar.L3) != null) {
                    o0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, b40Var2.E));
                    b40Var2.f24540f.f36438a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, b40Var2.E));
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
