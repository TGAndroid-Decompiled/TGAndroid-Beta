package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class c40 extends AnimatorListenerAdapter {
    public final int f23833a;
    public final boolean f23834b;
    public final d40 f23835c;

    public c40(d40 d40Var, boolean z4, int i10) {
        this.f23833a = i10;
        this.f23835c = d40Var;
        this.f23834b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        org.telegram.ui.yn ynVar;
        lh.e1 e1Var;
        switch (this.f23833a) {
            case 0:
                if (this.f23834b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                d40 d40Var = this.f23835c;
                d40Var.f24153w = f10;
                d40Var.e.setTranslationY(f10 * AndroidUtilities.dp(48.0f));
                d40Var.e.setPadding(0, 0, 0, (int) (d40Var.f24153w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                boolean z4 = this.f23834b;
                if (z4) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                d40 d40Var2 = this.f23835c;
                d40Var2.B = f11;
                d40Var2.f24150n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f11));
                d40Var2.f24150n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, d40Var2.B));
                org.telegram.ui.fk fkVar = d40Var2.f24149f;
                if (fkVar != null && (ynVar = fkVar.f40837a) != null && (e1Var = ynVar.I3) != null) {
                    e1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, d40Var2.B));
                    d40Var2.f24149f.f40837a.I3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, d40Var2.B));
                }
                d40Var2.h.setAlpha(d40Var2.B);
                if (!z4) {
                    d40Var2.h.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
