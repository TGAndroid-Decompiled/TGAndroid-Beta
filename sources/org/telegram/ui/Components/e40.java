package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class e40 extends AnimatorListenerAdapter {
    public final int f23839a;
    public final boolean f23840b;
    public final f40 f23841c;

    public e40(f40 f40Var, boolean z10, int i10) {
        this.f23839a = i10;
        this.f23841c = f40Var;
        this.f23840b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        org.telegram.ui.xn xnVar;
        ai.w0 w0Var;
        switch (this.f23839a) {
            case 0:
                if (this.f23840b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                f40 f40Var = this.f23841c;
                f40Var.f24161w = f7;
                f40Var.e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                f40Var.e.setPadding(0, 0, 0, (int) (f40Var.f24161w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                boolean z10 = this.f23840b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                f40 f40Var2 = this.f23841c;
                f40Var2.E = f10;
                f40Var2.f24158n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                f40Var2.f24158n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, f40Var2.E));
                org.telegram.ui.fk fkVar = f40Var2.f24157f;
                if (fkVar != null && (xnVar = fkVar.f40301a) != null && (w0Var = xnVar.L3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, f40Var2.E));
                    f40Var2.f24157f.f40301a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, f40Var2.E));
                }
                f40Var2.h.setAlpha(f40Var2.E);
                if (!z10) {
                    f40Var2.h.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
