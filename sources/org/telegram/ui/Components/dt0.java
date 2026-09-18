package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dt0 extends AnimatorListenerAdapter {
    public final int f23678a;
    public final kv0 f23679b;

    public dt0(kv0 kv0Var, int i10) {
        this.f23678a = i10;
        this.f23679b = kv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23678a) {
            case 0:
                this.f23679b.L0 = null;
                return;
            default:
                kv0 kv0Var = this.f23679b;
                org.telegram.ui.ActionBar.v0 v0Var = kv0Var.f25829n0;
                du0[] du0VarArr = kv0Var.f25824k0;
                kv0Var.f25815f1 = null;
                int i10 = 4;
                if (kv0Var.f25821i1) {
                    du0VarArr[1].setVisibility(8);
                    if (v0Var != null && !kv0Var.D()) {
                        if (kv0Var.v0()) {
                            i10 = 8;
                        }
                        v0Var.setVisibility(i10);
                        kv0Var.f25831o0 = 0.0f;
                    } else {
                        kv0Var.f25831o0 = kv0Var.b0(0.0f);
                        kv0Var.s1(0.0f);
                    }
                    kv0Var.q1(false);
                    kv0Var.f25853x0 = 0;
                } else {
                    du0 du0Var = du0VarArr[0];
                    du0VarArr[0] = du0VarArr[1];
                    du0VarArr[1] = du0Var;
                    du0Var.setVisibility(8);
                    if (v0Var != null && kv0Var.f25853x0 == 2) {
                        if (kv0Var.v0()) {
                            i10 = 8;
                        }
                        v0Var.setVisibility(i10);
                    }
                    kv0Var.f25853x0 = 0;
                    kv0Var.Z0(1.0f, du0VarArr[0].F);
                    kv0Var.L0();
                    kv0Var.f1();
                }
                kv0Var.f25817g1 = false;
                kv0Var.f25857y1 = false;
                kv0Var.f25854x1 = false;
                kv0Var.N0(false);
                kv0Var.G.setEnabled(true);
                kv0Var.I0.setEnabled(true);
                return;
        }
    }
}
