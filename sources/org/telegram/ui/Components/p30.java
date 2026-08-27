package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

public final class p30 extends AnimatorListenerAdapter {

    public final int f31486a;

    public final boolean f31487b;

    public final q30 f31488c;

    public p30(q30 q30Var, boolean z10, int i10) {
        this.f31486a = i10;
        this.f31488c = q30Var;
        this.f31487b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.sn snVar;
        hh.f1 f1Var;
        switch (this.f31486a) {
            case 0:
                float f10 = this.f31487b ? 1.0f : 0.0f;
                q30 q30Var = this.f31488c;
                q30Var.f31773w = f10;
                q30Var.f31768e.setTranslationY(f10 * AndroidUtilities.dp(48.0f));
                q30Var.f31768e.setPadding(0, 0, 0, (int) (q30Var.f31773w * AndroidUtilities.dp(48.0f)));
                break;
            default:
                boolean z10 = this.f31487b;
                float f11 = z10 ? 1.0f : 0.0f;
                q30 q30Var2 = this.f31488c;
                q30Var2.A = f11;
                q30Var2.f31770n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f11));
                q30Var2.f31770n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, q30Var2.A));
                org.telegram.ui.yj yjVar = q30Var2.f31769f;
                if (yjVar != null && (snVar = yjVar.f42977a) != null && (f1Var = snVar.H3) != null) {
                    f1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, q30Var2.A));
                    q30Var2.f31769f.f42977a.H3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, q30Var2.A));
                }
                q30Var2.h.setAlpha(q30Var2.A);
                if (!z10) {
                    q30Var2.h.setVisibility(8);
                }
                break;
        }
    }
}
