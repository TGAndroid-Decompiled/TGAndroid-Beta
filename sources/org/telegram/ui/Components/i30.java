package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i30 extends AnimatorListenerAdapter {
    public final int f26993a;
    public final boolean f26994b;
    public final j30 f26995c;

    public i30(j30 j30Var, boolean z10, int i10) {
        this.f26993a = i10;
        this.f26995c = j30Var;
        this.f26994b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        org.telegram.ui.vn vnVar;
        ag.b1 b1Var;
        switch (this.f26993a) {
            case 0:
                if (this.f26994b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                j30 j30Var = this.f26995c;
                j30Var.f27263x = f7;
                j30Var.e.setTranslationY(f7 * org.telegram.messenger.i0.L(48.0f));
                j30Var.e.setPadding(0, 0, 0, (int) (j30Var.f27263x * org.telegram.messenger.i0.L(48.0f)));
                return;
            default:
                boolean z10 = this.f26994b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                j30 j30Var2 = this.f26995c;
                j30Var2.E = f10;
                j30Var2.f27259n.setScaleX(org.telegram.messenger.i0.T1(0.95f, 1.0f, f10));
                j30Var2.f27259n.setScaleY(org.telegram.messenger.i0.T1(0.95f, 1.0f, j30Var2.E));
                org.telegram.ui.ik ikVar = j30Var2.f27258f;
                if (ikVar != null && (vnVar = ikVar.f43128a) != null && (b1Var = vnVar.Z3) != null) {
                    b1Var.setScaleX(org.telegram.messenger.i0.T1(1.0f, 0.95f, j30Var2.E));
                    j30Var2.f27258f.f43128a.Z3.setScaleY(org.telegram.messenger.i0.T1(1.0f, 0.95f, j30Var2.E));
                }
                j30Var2.h.setAlpha(j30Var2.E);
                if (!z10) {
                    j30Var2.h.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
