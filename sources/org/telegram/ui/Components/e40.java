package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class e40 extends AnimatorListenerAdapter {
    public final int f26425a;
    public final boolean f26426b;
    public final f40 f26427c;

    public e40(f40 f40Var, boolean z4, int i10) {
        this.f26425a = i10;
        this.f26427c = f40Var;
        this.f26426b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        org.telegram.ui.yn ynVar;
        mh.d1 d1Var;
        switch (this.f26425a) {
            case 0:
                if (this.f26426b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                f40 f40Var = this.f26427c;
                f40Var.f26742w = f10;
                f40Var.f26737e.setTranslationY(f10 * AndroidUtilities.dp(48.0f));
                f40Var.f26737e.setPadding(0, 0, 0, (int) (f40Var.f26742w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                boolean z4 = this.f26426b;
                if (z4) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                f40 f40Var2 = this.f26427c;
                f40Var2.B = f11;
                f40Var2.f26739n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f11));
                f40Var2.f26739n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, f40Var2.B));
                org.telegram.ui.fk fkVar = f40Var2.f26738f;
                if (fkVar != null && (ynVar = fkVar.f43958a) != null && (d1Var = ynVar.I3) != null) {
                    d1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, f40Var2.B));
                    f40Var2.f26738f.f43958a.I3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, f40Var2.B));
                }
                f40Var2.h.setAlpha(f40Var2.B);
                if (!z4) {
                    f40Var2.h.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
