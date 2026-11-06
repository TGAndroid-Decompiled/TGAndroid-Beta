package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q20 extends AnimatorListenerAdapter {
    public final int f37126a;
    public final boolean f37127b;
    public final r20 f37128c;

    public q20(r20 r20Var, boolean z9, int i7) {
        this.f37126a = i7;
        this.f37128c = r20Var;
        this.f37127b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        org.telegram.ui.bn bnVar;
        bi.q1 q1Var;
        switch (this.f37126a) {
            case 0:
                if (this.f37127b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                r20 r20Var = this.f37128c;
                r20Var.f37515x = f10;
                r20Var.f37509e.setTranslationY(f10 * org.telegram.messenger.g0.L(48.0f));
                r20Var.f37509e.setPadding(0, 0, 0, (int) (r20Var.f37515x * org.telegram.messenger.g0.L(48.0f)));
                return;
            default:
                boolean z9 = this.f37127b;
                if (z9) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                r20 r20Var2 = this.f37128c;
                r20Var2.E = f11;
                r20Var2.f37511n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, f11));
                r20Var2.f37511n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, r20Var2.E));
                org.telegram.ui.mj mjVar = r20Var2.f37510f;
                if (mjVar != null && (bnVar = mjVar.f44858a) != null && (q1Var = bnVar.Z3) != null) {
                    q1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, r20Var2.E));
                    r20Var2.f37510f.f44858a.Z3.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, r20Var2.E));
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
