package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class n40 extends AnimatorListenerAdapter {
    public final int f27577a;
    public final boolean f27578b;
    public final o40 f27579c;

    public n40(o40 o40Var, boolean z10, int i10) {
        this.f27577a = i10;
        this.f27579c = o40Var;
        this.f27578b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        org.telegram.ui.go goVar;
        bi.o0 o0Var;
        switch (this.f27577a) {
            case 0:
                if (this.f27578b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                o40 o40Var = this.f27579c;
                o40Var.f27836w = f7;
                o40Var.e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                o40Var.e.setPadding(0, 0, 0, (int) (o40Var.f27836w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                boolean z10 = this.f27578b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                o40 o40Var2 = this.f27579c;
                o40Var2.E = f10;
                o40Var2.f27833n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                o40Var2.f27833n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, o40Var2.E));
                org.telegram.ui.nk nkVar = o40Var2.f27832f;
                if (nkVar != null && (goVar = nkVar.f36887a) != null && (o0Var = goVar.L3) != null) {
                    o0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, o40Var2.E));
                    o40Var2.f27832f.f36887a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, o40Var2.E));
                }
                o40Var2.h.setAlpha(o40Var2.E);
                if (!z10) {
                    o40Var2.h.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
