package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class c11 implements z4.e {
    public int f35001a;
    public final d11 f35002b;

    public c11(d11 d11Var) {
        this.f35002b = d11Var;
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        d11 d11Var = this.f35002b;
        ProfileActivity profileActivity = d11Var.f35639n;
        int k10 = profileActivity.f33976n0.D0.k(i10);
        if (this.f35001a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        d11Var.a(z10);
        this.f35001a = k10;
        if (profileActivity.f33996q0 == null) {
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
