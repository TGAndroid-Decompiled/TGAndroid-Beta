package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class l01 implements a5.i {
    public int f41092a;
    public final m01 f41093b;

    public l01(m01 m01Var) {
        this.f41093b = m01Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        m01 m01Var = this.f41093b;
        ProfileActivity profileActivity = m01Var.f41426n;
        int k10 = profileActivity.f36037n0.D0.k(i10);
        if (this.f41092a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        m01Var.a(z10);
        this.f41092a = k10;
        if (profileActivity.f36058q0 == null) {
            return;
        }
        if (profileActivity.T0.x()) {
            AndroidUtilities.runOnUIThread(new my0(m01Var, 5), 500L);
        } else {
            m01Var.c();
        }
    }

    @Override
    public final void c(int i10) {
    }

    @Override
    public final void b(float f7, int i10, int i11) {
    }
}
