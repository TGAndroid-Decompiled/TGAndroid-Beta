package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ss0 extends AnimatorListenerAdapter {
    public final int f27915a;
    public final zu0 f27916b;

    public ss0(zu0 zu0Var, int i10) {
        this.f27915a = i10;
        this.f27916b = zu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27915a) {
            case 0:
                this.f27916b.L0 = null;
                return;
            default:
                zu0 zu0Var = this.f27916b;
                org.telegram.ui.ActionBar.w0 w0Var = zu0Var.f30637n0;
                st0[] st0VarArr = zu0Var.f30632k0;
                zu0Var.f30623f1 = null;
                int i10 = 4;
                if (zu0Var.f30629i1) {
                    st0VarArr[1].setVisibility(8);
                    if (w0Var != null && !zu0Var.D()) {
                        if (zu0Var.v0()) {
                            i10 = 8;
                        }
                        w0Var.setVisibility(i10);
                        zu0Var.f30639o0 = 0.0f;
                    } else {
                        zu0Var.f30639o0 = zu0Var.b0(0.0f);
                        zu0Var.s1(0.0f);
                    }
                    zu0Var.q1(false);
                    zu0Var.f30661x0 = 0;
                } else {
                    st0 st0Var = st0VarArr[0];
                    st0VarArr[0] = st0VarArr[1];
                    st0VarArr[1] = st0Var;
                    st0Var.setVisibility(8);
                    if (w0Var != null && zu0Var.f30661x0 == 2) {
                        if (zu0Var.v0()) {
                            i10 = 8;
                        }
                        w0Var.setVisibility(i10);
                    }
                    zu0Var.f30661x0 = 0;
                    zu0Var.Z0(1.0f, st0VarArr[0].F);
                    zu0Var.L0();
                    zu0Var.f1();
                }
                zu0Var.f30625g1 = false;
                zu0Var.f30665y1 = false;
                zu0Var.f30662x1 = false;
                zu0Var.N0(false);
                zu0Var.G.setEnabled(true);
                zu0Var.I0.setEnabled(true);
                return;
        }
    }
}
