package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r20 extends AnimatorListenerAdapter {
    public final int f37536a;
    public final boolean f37537b;
    public final s20 f37538c;

    public r20(s20 s20Var, boolean z9, int i7) {
        this.f37536a = i7;
        this.f37538c = s20Var;
        this.f37537b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        org.telegram.ui.dn dnVar;
        bi.q1 q1Var;
        switch (this.f37536a) {
            case 0:
                if (this.f37537b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                s20 s20Var = this.f37538c;
                s20Var.f37893x = f10;
                s20Var.f37887e.setTranslationY(f10 * org.telegram.messenger.g0.L(48.0f));
                s20Var.f37887e.setPadding(0, 0, 0, (int) (s20Var.f37893x * org.telegram.messenger.g0.L(48.0f)));
                return;
            default:
                boolean z9 = this.f37537b;
                if (z9) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                s20 s20Var2 = this.f37538c;
                s20Var2.E = f11;
                s20Var2.f37889n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, f11));
                s20Var2.f37889n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, s20Var2.E));
                org.telegram.ui.oj ojVar = s20Var2.f37888f;
                if (ojVar != null && (dnVar = ojVar.f45471a) != null && (q1Var = dnVar.Z3) != null) {
                    q1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, s20Var2.E));
                    s20Var2.f37888f.f45471a.Z3.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, s20Var2.E));
                }
                s20Var2.h.setAlpha(s20Var2.E);
                if (!z9) {
                    s20Var2.h.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
