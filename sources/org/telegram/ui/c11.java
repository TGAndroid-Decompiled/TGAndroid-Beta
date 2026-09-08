package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class c11 implements z4.e {
    public int f35000a;
    public final d11 f35001b;

    public c11(d11 d11Var) {
        this.f35001b = d11Var;
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        d11 d11Var = this.f35001b;
        ProfileActivity profileActivity = d11Var.f35638n;
        int k10 = profileActivity.f33975n0.D0.k(i10);
        if (this.f35000a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        d11Var.a(z10);
        this.f35000a = k10;
        if (profileActivity.f33995q0 == null) {
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
