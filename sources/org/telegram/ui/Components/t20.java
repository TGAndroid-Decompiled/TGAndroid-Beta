package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t20 extends AnimatorListenerAdapter {
    public final int f39496a;
    public final boolean f39497b;
    public final u20 f39498c;

    public t20(u20 u20Var, boolean z10, int i7) {
        this.f39496a = i7;
        this.f39498c = u20Var;
        this.f39497b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        org.telegram.ui.bn bnVar;
        di.c1 c1Var;
        switch (this.f39496a) {
            case 0:
                if (this.f39497b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                u20 u20Var = this.f39498c;
                u20Var.f39882x = f10;
                u20Var.f39876e.setTranslationY(f10 * org.telegram.messenger.g0.L(48.0f));
                u20Var.f39876e.setPadding(0, 0, 0, (int) (u20Var.f39882x * org.telegram.messenger.g0.L(48.0f)));
                return;
            default:
                boolean z10 = this.f39497b;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                u20 u20Var2 = this.f39498c;
                u20Var2.F = f11;
                u20Var2.f39878n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, f11));
                u20Var2.f39878n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, u20Var2.F));
                org.telegram.ui.mj mjVar = u20Var2.f39877f;
                if (mjVar != null && (bnVar = mjVar.f46179a) != null && (c1Var = bnVar.f45121a4) != null) {
                    c1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, u20Var2.F));
                    u20Var2.f39877f.f46179a.f45121a4.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, u20Var2.F));
                }
                u20Var2.h.setAlpha(u20Var2.F);
                if (!z10) {
                    u20Var2.h.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
