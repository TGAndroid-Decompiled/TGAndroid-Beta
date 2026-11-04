package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m20 extends AnimatorListenerAdapter {
    public final int f35984a;
    public final boolean f35985b;
    public final n20 f35986c;

    public m20(n20 n20Var, boolean z10, int i3) {
        this.f35984a = i3;
        this.f35986c = n20Var;
        this.f35985b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        org.telegram.ui.xm xmVar;
        ci.j1 j1Var;
        switch (this.f35984a) {
            case 0:
                if (this.f35985b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                n20 n20Var = this.f35986c;
                n20Var.f36346x = f10;
                n20Var.f36340e.setTranslationY(f10 * org.telegram.messenger.g0.L(48.0f));
                n20Var.f36340e.setPadding(0, 0, 0, (int) (n20Var.f36346x * org.telegram.messenger.g0.L(48.0f)));
                return;
            default:
                boolean z10 = this.f35985b;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                n20 n20Var2 = this.f35986c;
                n20Var2.F = f11;
                n20Var2.f36342n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, f11));
                n20Var2.f36342n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, n20Var2.F));
                org.telegram.ui.ij ijVar = n20Var2.f36341f;
                if (ijVar != null && (xmVar = ijVar.f52363a) != null && (j1Var = xmVar.f51241a4) != null) {
                    j1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, n20Var2.F));
                    n20Var2.f36341f.f52363a.f51241a4.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, n20Var2.F));
                }
                n20Var2.h.setAlpha(n20Var2.F);
                if (!z10) {
                    n20Var2.h.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
