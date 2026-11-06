package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q20 extends AnimatorListenerAdapter {
    public final int f37235a;
    public final boolean f37236b;
    public final r20 f37237c;

    public q20(r20 r20Var, boolean z9, int i7) {
        this.f37235a = i7;
        this.f37237c = r20Var;
        this.f37236b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        org.telegram.ui.bn bnVar;
        bi.q1 q1Var;
        switch (this.f37235a) {
            case 0:
                if (this.f37236b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                r20 r20Var = this.f37237c;
                r20Var.f37581x = f10;
                r20Var.f37575e.setTranslationY(f10 * org.telegram.messenger.g0.L(48.0f));
                r20Var.f37575e.setPadding(0, 0, 0, (int) (r20Var.f37581x * org.telegram.messenger.g0.L(48.0f)));
                return;
            default:
                boolean z9 = this.f37236b;
                if (z9) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                r20 r20Var2 = this.f37237c;
                r20Var2.E = f11;
                r20Var2.f37577n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, f11));
                r20Var2.f37577n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, r20Var2.E));
                org.telegram.ui.mj mjVar = r20Var2.f37576f;
                if (mjVar != null && (bnVar = mjVar.f44837a) != null && (q1Var = bnVar.Z3) != null) {
                    q1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, r20Var2.E));
                    r20Var2.f37576f.f44837a.Z3.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, r20Var2.E));
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
