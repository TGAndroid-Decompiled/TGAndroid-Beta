package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class d40 extends AnimatorListenerAdapter {
    public final int f24163a;
    public final boolean f24164b;
    public final e40 f24165c;

    public d40(e40 e40Var, boolean z4, int i10) {
        this.f24163a = i10;
        this.f24165c = e40Var;
        this.f24164b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        org.telegram.ui.ao aoVar;
        lh.e1 e1Var;
        switch (this.f24163a) {
            case 0:
                if (this.f24164b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                e40 e40Var = this.f24165c;
                e40Var.f24465w = f10;
                e40Var.e.setTranslationY(f10 * AndroidUtilities.dp(48.0f));
                e40Var.e.setPadding(0, 0, 0, (int) (e40Var.f24465w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                boolean z4 = this.f24164b;
                if (z4) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                e40 e40Var2 = this.f24165c;
                e40Var2.B = f11;
                e40Var2.f24462n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f11));
                e40Var2.f24462n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, e40Var2.B));
                org.telegram.ui.hk hkVar = e40Var2.f24461f;
                if (hkVar != null && (aoVar = hkVar.f32924a) != null && (e1Var = aoVar.I3) != null) {
                    e1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, e40Var2.B));
                    e40Var2.f24461f.f32924a.I3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, e40Var2.B));
                }
                e40Var2.h.setAlpha(e40Var2.B);
                if (!z4) {
                    e40Var2.h.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
