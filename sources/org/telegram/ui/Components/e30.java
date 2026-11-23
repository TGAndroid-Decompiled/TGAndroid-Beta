package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e30 extends AnimatorListenerAdapter {
    public final int f34660a;
    public final boolean f34661b;
    public final f30 f34662c;

    public e30(f30 f30Var, boolean z10, int i7) {
        this.f34660a = i7;
        this.f34662c = f30Var;
        this.f34661b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        org.telegram.ui.cn cnVar;
        di.b1 b1Var;
        switch (this.f34660a) {
            case 0:
                if (this.f34661b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                f30 f30Var = this.f34662c;
                f30Var.f35054x = f10;
                f30Var.f35048e.setTranslationY(f10 * org.telegram.messenger.g0.L(48.0f));
                f30Var.f35048e.setPadding(0, 0, 0, (int) (f30Var.f35054x * org.telegram.messenger.g0.L(48.0f)));
                return;
            default:
                boolean z10 = this.f34661b;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                f30 f30Var2 = this.f34662c;
                f30Var2.F = f11;
                f30Var2.f35050n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, f11));
                f30Var2.f35050n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, f30Var2.F));
                org.telegram.ui.nj njVar = f30Var2.f35049f;
                if (njVar != null && (cnVar = njVar.f46973a) != null && (b1Var = cnVar.f45907a4) != null) {
                    b1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, f30Var2.F));
                    f30Var2.f35049f.f46973a.f45907a4.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, f30Var2.F));
                }
                f30Var2.h.setAlpha(f30Var2.F);
                if (!z10) {
                    f30Var2.h.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
