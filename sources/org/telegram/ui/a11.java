package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class a11 implements z4.e {
    public int f35804a;
    public final b11 f35805b;

    public a11(b11 b11Var) {
        this.f35805b = b11Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        b11 b11Var = this.f35805b;
        ProfileActivity profileActivity = b11Var.f36095n;
        int k10 = profileActivity.f34303n0.D0.k(i10);
        if (this.f35804a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        b11Var.a(z10);
        this.f35804a = k10;
        if (profileActivity.f34323q0 == null) {
            return;
        }
        if (profileActivity.T0.t()) {
            AndroidUtilities.runOnUIThread(new nz0(b11Var, 3), 500L);
        } else {
            b11Var.c();
        }
    }

    @Override
    public final void c(int i10) {
    }

    @Override
    public final void b(float f7, int i10, int i11) {
    }
}
