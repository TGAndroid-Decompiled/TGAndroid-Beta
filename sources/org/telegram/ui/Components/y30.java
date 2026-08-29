package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class y30 extends AnimatorListenerAdapter {
    public final int f34905a;
    public final boolean f34906b;
    public final z30 f34907c;

    public y30(z30 z30Var, boolean z10, int i10) {
        this.f34905a = i10;
        this.f34907c = z30Var;
        this.f34906b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f9;
        float f10;
        org.telegram.ui.un unVar;
        jh.e1 e1Var;
        switch (this.f34905a) {
            case 0:
                if (this.f34906b) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                z30 z30Var = this.f34907c;
                z30Var.f35197w = f9;
                z30Var.f35192e.setTranslationY(f9 * AndroidUtilities.dp(48.0f));
                z30Var.f35192e.setPadding(0, 0, 0, (int) (z30Var.f35197w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                boolean z10 = this.f34906b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                z30 z30Var2 = this.f34907c;
                z30Var2.A = f10;
                z30Var2.f35194n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                z30Var2.f35194n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, z30Var2.A));
                org.telegram.ui.zj zjVar = z30Var2.f35193f;
                if (zjVar != null && (unVar = zjVar.f43683a) != null && (e1Var = unVar.H3) != null) {
                    e1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, z30Var2.A));
                    z30Var2.f35193f.f43683a.H3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, z30Var2.A));
                }
                z30Var2.h.setAlpha(z30Var2.A);
                if (!z10) {
                    z30Var2.h.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
