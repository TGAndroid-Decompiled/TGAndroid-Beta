package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class h40 extends AnimatorListenerAdapter {
    public final int f26868a;
    public final boolean f26869b;
    public final i40 f26870c;

    public h40(i40 i40Var, boolean z10, int i10) {
        this.f26868a = i10;
        this.f26870c = i40Var;
        this.f26869b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        org.telegram.ui.tn tnVar;
        ai.u1 u1Var;
        switch (this.f26868a) {
            case 0:
                if (this.f26869b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                i40 i40Var = this.f26870c;
                i40Var.f27287w = f7;
                i40Var.e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                i40Var.e.setPadding(0, 0, 0, (int) (i40Var.f27287w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                boolean z10 = this.f26869b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                i40 i40Var2 = this.f26870c;
                i40Var2.E = f10;
                i40Var2.f27284n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                i40Var2.f27284n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, i40Var2.E));
                org.telegram.ui.bk bkVar = i40Var2.f27283f;
                if (bkVar != null && (tnVar = bkVar.f42454a) != null && (u1Var = tnVar.X3) != null) {
                    u1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, i40Var2.E));
                    i40Var2.f27283f.f42454a.X3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, i40Var2.E));
                }
                i40Var2.h.setAlpha(i40Var2.E);
                if (!z10) {
                    i40Var2.h.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
