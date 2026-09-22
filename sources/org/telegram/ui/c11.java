package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class c11 implements z4.e {
    public int f32621a;
    public final d11 f32622b;

    public c11(d11 d11Var) {
        this.f32622b = d11Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        d11 d11Var = this.f32622b;
        ProfileActivity profileActivity = d11Var.f32914n;
        int k10 = profileActivity.f31326n0.D0.k(i10);
        if (this.f32621a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        d11Var.a(z10);
        this.f32621a = k10;
        if (profileActivity.f31346q0 == null) {
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
    public final void b(float f7, int i10, int i11) {
    }
}
