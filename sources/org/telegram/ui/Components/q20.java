package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q20 extends AnimatorListenerAdapter {
    public final int f37134a;
    public final boolean f37135b;
    public final r20 f37136c;

    public q20(r20 r20Var, boolean z9, int i7) {
        this.f37134a = i7;
        this.f37136c = r20Var;
        this.f37135b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        org.telegram.ui.dn dnVar;
        bi.q1 q1Var;
        switch (this.f37134a) {
            case 0:
                if (this.f37135b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                r20 r20Var = this.f37136c;
                r20Var.f37482x = f10;
                r20Var.f37476e.setTranslationY(f10 * org.telegram.messenger.g0.L(48.0f));
                r20Var.f37476e.setPadding(0, 0, 0, (int) (r20Var.f37482x * org.telegram.messenger.g0.L(48.0f)));
                return;
            default:
                boolean z9 = this.f37135b;
                if (z9) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                r20 r20Var2 = this.f37136c;
                r20Var2.E = f11;
                r20Var2.f37478n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, f11));
                r20Var2.f37478n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, r20Var2.E));
                org.telegram.ui.oj ojVar = r20Var2.f37477f;
                if (ojVar != null && (dnVar = ojVar.f45407a) != null && (q1Var = dnVar.Z3) != null) {
                    q1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, r20Var2.E));
                    r20Var2.f37477f.f45407a.Z3.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, r20Var2.E));
                }
                r20Var2.h.setAlpha(r20Var2.E);
                if (!z9) {
                    r20Var2.h.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
