package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class a40 extends AnimatorListenerAdapter {
    public final int f22302a;
    public final boolean f22303b;
    public final b40 f22304c;

    public a40(b40 b40Var, boolean z10, int i10) {
        this.f22302a = i10;
        this.f22304c = b40Var;
        this.f22303b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        org.telegram.ui.co coVar;
        ai.w0 w0Var;
        switch (this.f22302a) {
            case 0:
                if (this.f22303b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                b40 b40Var = this.f22304c;
                b40Var.f22610w = f7;
                b40Var.e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                b40Var.e.setPadding(0, 0, 0, (int) (b40Var.f22610w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                boolean z10 = this.f22303b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                b40 b40Var2 = this.f22304c;
                b40Var2.E = f10;
                b40Var2.f22607n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                b40Var2.f22607n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b40Var2.E));
                org.telegram.ui.ik ikVar = b40Var2.f22606f;
                if (ikVar != null && (coVar = ikVar.f33375a) != null && (w0Var = coVar.L3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, b40Var2.E));
                    b40Var2.f22606f.f33375a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, b40Var2.E));
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
