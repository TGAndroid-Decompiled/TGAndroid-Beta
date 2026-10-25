package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class l40 extends AnimatorListenerAdapter {
    public final int f30056a;
    public final boolean f30057b;
    public final m40 f30058c;

    public l40(m40 m40Var, boolean z10, int i10) {
        this.f30056a = i10;
        this.f30058c = m40Var;
        this.f30057b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        org.telegram.ui.vn vnVar;
        bi.r1 r1Var;
        switch (this.f30056a) {
            case 0:
                if (this.f30057b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                m40 m40Var = this.f30058c;
                m40Var.f30382w = f7;
                m40Var.e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                m40Var.e.setPadding(0, 0, 0, (int) (m40Var.f30382w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                boolean z10 = this.f30057b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                m40 m40Var2 = this.f30058c;
                m40Var2.E = f10;
                m40Var2.f30379n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                m40Var2.f30379n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, m40Var2.E));
                org.telegram.ui.ck ckVar = m40Var2.f30378f;
                if (ckVar != null && (vnVar = ckVar.f45518a) != null && (r1Var = vnVar.X3) != null) {
                    r1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, m40Var2.E));
                    m40Var2.f30378f.f45518a.X3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, m40Var2.E));
                }
                m40Var2.h.setAlpha(m40Var2.E);
                if (!z10) {
                    m40Var2.h.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
