package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class p01 implements m2.f {
    public int f39849a;
    public final q01 f39850b;

    public p01(q01 q01Var) {
        this.f39850b = q01Var;
    }

    @Override
    public final void a(int i10) {
        boolean z4;
        q01 q01Var = this.f39850b;
        ProfileActivity profileActivity = q01Var.f40292n;
        int k10 = profileActivity.f34632k0.A0.k(i10);
        if (this.f39849a != k10) {
            z4 = true;
        } else {
            z4 = false;
        }
        q01Var.a(z4);
        this.f39849a = k10;
        if (profileActivity.f34652n0 == null) {
            return;
        }
        if (profileActivity.Q0.t()) {
            AndroidUtilities.runOnUIThread(new sz0(q01Var, 2), 500L);
        } else {
            q01Var.c();
        }
    }

    @Override
    public final void c(int i10) {
    }

    @Override
    public final void b(float f10, int i10, int i11) {
    }
}
