package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b30 extends AnimatorListenerAdapter {
    public final int f33521a;
    public final boolean f33522b;
    public final c30 f33523c;

    public b30(c30 c30Var, boolean z10, int i7) {
        this.f33521a = i7;
        this.f33523c = c30Var;
        this.f33522b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        org.telegram.ui.cn cnVar;
        di.b1 b1Var;
        switch (this.f33521a) {
            case 0:
                if (this.f33522b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                c30 c30Var = this.f33523c;
                c30Var.f33877x = f10;
                c30Var.f33871e.setTranslationY(f10 * org.telegram.messenger.g0.L(48.0f));
                c30Var.f33871e.setPadding(0, 0, 0, (int) (c30Var.f33877x * org.telegram.messenger.g0.L(48.0f)));
                return;
            default:
                boolean z10 = this.f33522b;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                c30 c30Var2 = this.f33523c;
                c30Var2.F = f11;
                c30Var2.f33873n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, f11));
                c30Var2.f33873n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, c30Var2.F));
                org.telegram.ui.nj njVar = c30Var2.f33872f;
                if (njVar != null && (cnVar = njVar.f47021a) != null && (b1Var = cnVar.f45936a4) != null) {
                    b1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, c30Var2.F));
                    c30Var2.f33872f.f47021a.f45936a4.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, c30Var2.F));
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
