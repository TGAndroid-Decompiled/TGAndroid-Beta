package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class d40 extends AnimatorListenerAdapter {
    public final int f23484a;
    public final boolean f23485b;
    public final e40 f23486c;

    public d40(e40 e40Var, boolean z10, int i10) {
        this.f23484a = i10;
        this.f23486c = e40Var;
        this.f23485b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        org.telegram.ui.xn xnVar;
        ai.w0 w0Var;
        switch (this.f23484a) {
            case 0:
                if (this.f23485b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                e40 e40Var = this.f23486c;
                e40Var.f23844w = f7;
                e40Var.e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                e40Var.e.setPadding(0, 0, 0, (int) (e40Var.f23844w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                boolean z10 = this.f23485b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                e40 e40Var2 = this.f23486c;
                e40Var2.E = f10;
                e40Var2.f23841n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                e40Var2.f23841n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, e40Var2.E));
                org.telegram.ui.fk fkVar = e40Var2.f23840f;
                if (fkVar != null && (xnVar = fkVar.f40193a) != null && (w0Var = xnVar.L3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, e40Var2.E));
                    e40Var2.f23840f.f40193a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, e40Var2.E));
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
