package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class e40 extends AnimatorListenerAdapter {
    public final int f25907a;
    public final boolean f25908b;
    public final f40 f25909c;

    public e40(f40 f40Var, boolean z10, int i10) {
        this.f25907a = i10;
        this.f25909c = f40Var;
        this.f25908b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        org.telegram.ui.zn znVar;
        ai.w0 w0Var;
        switch (this.f25907a) {
            case 0:
                if (this.f25908b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                f40 f40Var = this.f25909c;
                f40Var.f26273w = f7;
                f40Var.f26268e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                f40Var.f26268e.setPadding(0, 0, 0, (int) (f40Var.f26273w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                boolean z10 = this.f25908b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                f40 f40Var2 = this.f25909c;
                f40Var2.E = f10;
                f40Var2.f26270n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                f40Var2.f26270n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, f40Var2.E));
                org.telegram.ui.fk fkVar = f40Var2.f26269f;
                if (fkVar != null && (znVar = fkVar.f34865a) != null && (w0Var = znVar.J3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, f40Var2.E));
                    f40Var2.f26269f.f34865a.J3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, f40Var2.E));
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
