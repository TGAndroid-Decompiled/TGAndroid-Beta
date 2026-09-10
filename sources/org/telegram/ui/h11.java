package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class h11 implements z4.e {
    public int f33242a;
    public final i11 f33243b;

    public h11(i11 i11Var) {
        this.f33243b = i11Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        i11 i11Var = this.f33243b;
        ProfileActivity profileActivity = i11Var.f33518n;
        int k10 = profileActivity.f30441n0.D0.k(i10);
        if (this.f33242a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        i11Var.a(z10);
        this.f33242a = k10;
        if (profileActivity.f30461q0 == null) {
            return;
        }
        if (profileActivity.T0.t()) {
            AndroidUtilities.runOnUIThread(new k01(i11Var, 2), 500L);
        } else {
            i11Var.c();
        }
    }

    @Override
    public final void c(int i10) {
    }

    @Override
    public final void b(float f7, int i10, int i11) {
    }
}
