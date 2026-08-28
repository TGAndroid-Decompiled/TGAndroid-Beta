package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class k30 extends AnimatorListenerAdapter {
    public final int f29921a;
    public final boolean f29922b;
    public final l30 f29923c;

    public k30(l30 l30Var, boolean z10, int i9) {
        this.f29921a = i9;
        this.f29923c = l30Var;
        this.f29922b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        org.telegram.ui.rn rnVar;
        gh.f1 f1Var;
        switch (this.f29921a) {
            case 0:
                if (this.f29922b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                l30 l30Var = this.f29923c;
                l30Var.f30316w = f10;
                l30Var.f30311e.setTranslationY(f10 * AndroidUtilities.dp(48.0f));
                l30Var.f30311e.setPadding(0, 0, 0, (int) (l30Var.f30316w * AndroidUtilities.dp(48.0f)));
                return;
            default:
                boolean z10 = this.f29922b;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                l30 l30Var2 = this.f29923c;
                l30Var2.A = f11;
                l30Var2.f30313n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, f11));
                l30Var2.f30313n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, l30Var2.A));
                org.telegram.ui.wj wjVar = l30Var2.f30312f;
                if (wjVar != null && (rnVar = wjVar.f42731a) != null && (f1Var = rnVar.H3) != null) {
                    f1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, l30Var2.A));
                    l30Var2.f30312f.f42731a.H3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, l30Var2.A));
                }
                l30Var2.h.setAlpha(l30Var2.A);
                if (!z10) {
                    l30Var2.h.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
