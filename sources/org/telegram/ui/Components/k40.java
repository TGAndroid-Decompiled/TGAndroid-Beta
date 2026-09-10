package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class k40 extends AnimatorListenerAdapter {
    public final int f24601a;
    public final boolean f24602b;
    public final l40 f24603c;

    public k40(l40 l40Var, boolean z10, int i10) {
        this.f24601a = i10;
        this.f24603c = l40Var;
        this.f24602b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        org.telegram.ui.fo foVar;
        bi.y1 y1Var;
        switch (this.f24601a) {
            case 0:
                if (this.f24602b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                l40 l40Var = this.f24603c;
                l40Var.f24871w = f7;
                l40Var.e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                l40Var.e.setPadding(0, 0, 0, (int) (l40Var.f24871w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                boolean z10 = this.f24602b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                l40 l40Var2 = this.f24603c;
                l40Var2.E = f10;
                l40Var2.f24868n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                l40Var2.f24868n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, l40Var2.E));
                org.telegram.ui.kk kkVar = l40Var2.f24867f;
                if (kkVar != null && (foVar = kkVar.f33142a) != null && (y1Var = foVar.L3) != null) {
                    y1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, l40Var2.E));
                    l40Var2.f24867f.f33142a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, l40Var2.E));
                }
                l40Var2.h.setAlpha(l40Var2.E);
                if (!z10) {
                    l40Var2.h.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
