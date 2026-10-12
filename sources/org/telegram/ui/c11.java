package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class c11 implements z4.e {
    public int f36299a;
    public final d11 f36300b;

    public c11(d11 d11Var) {
        this.f36300b = d11Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        d11 d11Var = this.f36300b;
        ProfileActivity profileActivity = d11Var.f36610n;
        int k10 = profileActivity.f34142n0.D0.k(i10);
        if (this.f36299a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        d11Var.a(z10);
        this.f36299a = k10;
        if (profileActivity.f34162q0 == null) {
            return;
        }
        if (profileActivity.T0.t()) {
            AndroidUtilities.runOnUIThread(new pz0(d11Var, 3), 500L);
        } else {
            d11Var.c();
        }
    }

    @Override
    public final void c(int i10) {
    }

    @Override
    public final void b(float f7, int i10, int i11) {
    }
}
