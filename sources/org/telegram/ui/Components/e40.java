package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class e40 extends AnimatorListenerAdapter {
    public final int f25908a;
    public final boolean f25909b;
    public final f40 f25910c;

    public e40(f40 f40Var, boolean z10, int i10) {
        this.f25908a = i10;
        this.f25910c = f40Var;
        this.f25909b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        org.telegram.ui.zn znVar;
        ai.w0 w0Var;
        switch (this.f25908a) {
            case 0:
                if (this.f25909b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                f40 f40Var = this.f25910c;
                f40Var.f26274w = f7;
                f40Var.f26269e.setTranslationY(f7 * AndroidUtilities.dp(48.0f));
                f40Var.f26269e.setPadding(0, 0, 0, (int) (f40Var.f26274w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                boolean z10 = this.f25909b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                f40 f40Var2 = this.f25910c;
                f40Var2.E = f10;
                f40Var2.f26271n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f10));
                f40Var2.f26271n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, f40Var2.E));
                org.telegram.ui.fk fkVar = f40Var2.f26270f;
                if (fkVar != null && (znVar = fkVar.f34866a) != null && (w0Var = znVar.J3) != null) {
                    w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, f40Var2.E));
                    f40Var2.f26270f.f34866a.J3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, f40Var2.E));
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
