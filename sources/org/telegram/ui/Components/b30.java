package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b30 extends AnimatorListenerAdapter {
    public final int f33618a;
    public final boolean f33619b;
    public final c30 f33620c;

    public b30(c30 c30Var, boolean z10, int i7) {
        this.f33618a = i7;
        this.f33620c = c30Var;
        this.f33619b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        org.telegram.ui.cn cnVar;
        di.b1 b1Var;
        switch (this.f33618a) {
            case 0:
                if (this.f33619b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                c30 c30Var = this.f33620c;
                c30Var.f33917x = f10;
                c30Var.f33911e.setTranslationY(f10 * org.telegram.messenger.g0.L(48.0f));
                c30Var.f33911e.setPadding(0, 0, 0, (int) (c30Var.f33917x * org.telegram.messenger.g0.L(48.0f)));
                return;
            default:
                boolean z10 = this.f33619b;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                c30 c30Var2 = this.f33620c;
                c30Var2.F = f11;
                c30Var2.f33913n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, f11));
                c30Var2.f33913n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, c30Var2.F));
                org.telegram.ui.nj njVar = c30Var2.f33912f;
                if (njVar != null && (cnVar = njVar.f47191a) != null && (b1Var = cnVar.f46122a4) != null) {
                    b1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, c30Var2.F));
                    c30Var2.f33912f.f47191a.f46122a4.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, c30Var2.F));
                }
                c30Var2.h.setAlpha(c30Var2.F);
                if (!z10) {
                    c30Var2.h.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
