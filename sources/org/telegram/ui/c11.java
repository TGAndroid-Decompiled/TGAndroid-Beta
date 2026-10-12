package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class c11 implements z4.e {
    public int f36297a;
    public final d11 f36298b;

    public c11(d11 d11Var) {
        this.f36298b = d11Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        d11 d11Var = this.f36298b;
        ProfileActivity profileActivity = d11Var.f36608n;
        int k10 = profileActivity.f34140n0.D0.k(i10);
        if (this.f36297a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        d11Var.a(z10);
        this.f36297a = k10;
        if (profileActivity.f34160q0 == null) {
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
