package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class c11 implements z4.e {
    public int f34973a;
    public final d11 f34974b;

    public c11(d11 d11Var) {
        this.f34974b = d11Var;
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        d11 d11Var = this.f34974b;
        ProfileActivity profileActivity = d11Var.f35611n;
        int k10 = profileActivity.f33948n0.D0.k(i10);
        if (this.f34973a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        d11Var.a(z10);
        this.f34973a = k10;
        if (profileActivity.f33968q0 == null) {
            return;
        }
        if (profileActivity.T0.t()) {
            AndroidUtilities.runOnUIThread(new f01(d11Var, 2), 500L);
        } else {
            d11Var.c();
        }
    }

    @Override
    public final void c(int i10) {
    }

    @Override
    public final void a(float f7, int i10, int i11) {
    }
}
