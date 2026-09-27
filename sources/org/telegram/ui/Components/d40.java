package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class d40 extends AnimatorListenerAdapter {
    public final int f23502a;
    public final boolean f23503b;
    public final e40 f23504c;

    public d40(e40 e40Var, boolean z10, int i10) {
        this.f23502a = i10;
        this.f23504c = e40Var;
        this.f23503b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        org.telegram.ui.yn ynVar;
        ai.w0 w0Var;
        switch (this.f23502a) {
            case 0:
                if (this.f23503b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                e40 e40Var = this.f23504c;
                e40Var.f23872w = f7;
                e40Var.e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                e40Var.e.setPadding(0, 0, 0, (int) (e40Var.f23872w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                boolean z10 = this.f23503b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                e40 e40Var2 = this.f23504c;
                e40Var2.E = f10;
                e40Var2.f23869n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                e40Var2.f23869n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, e40Var2.E));
                org.telegram.ui.hk hkVar = e40Var2.f23868f;
                if (hkVar != null && (ynVar = hkVar.f40556a) != null && (w0Var = ynVar.L3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, e40Var2.E));
                    e40Var2.f23868f.f40556a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, e40Var2.E));
                }
                e40Var2.h.setAlpha(e40Var2.E);
                if (!z10) {
                    e40Var2.h.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
