package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class a40 extends AnimatorListenerAdapter {
    public final int f22531a;
    public final boolean f22532b;
    public final b40 f22533c;

    public a40(b40 b40Var, boolean z10, int i10) {
        this.f22531a = i10;
        this.f22533c = b40Var;
        this.f22532b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        org.telegram.ui.ao aoVar;
        ai.w0 w0Var;
        switch (this.f22531a) {
            case 0:
                if (this.f22532b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                b40 b40Var = this.f22533c;
                b40Var.f22846w = f7;
                b40Var.e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                b40Var.e.setPadding(0, 0, 0, (int) (b40Var.f22846w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                boolean z10 = this.f22532b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                b40 b40Var2 = this.f22533c;
                b40Var2.E = f10;
                b40Var2.f22843n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                b40Var2.f22843n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b40Var2.E));
                org.telegram.ui.ik ikVar = b40Var2.f22842f;
                if (ikVar != null && (aoVar = ikVar.f32521a) != null && (w0Var = aoVar.L3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, b40Var2.E));
                    b40Var2.f22842f.f32521a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, b40Var2.E));
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
