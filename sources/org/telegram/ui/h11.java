package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class h11 implements z4.e {
    public int f36577a;
    public final i11 f36578b;

    public h11(i11 i11Var) {
        this.f36578b = i11Var;
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        i11 i11Var = this.f36578b;
        ProfileActivity profileActivity = i11Var.f37009n;
        int k10 = profileActivity.f32620n0.D0.k(i10);
        if (this.f36577a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        i11Var.a(z10);
        this.f36577a = k10;
        if (profileActivity.f32640q0 == null) {
            return;
        }
        if (profileActivity.T0.t()) {
            AndroidUtilities.runOnUIThread(new uz0(i11Var, 3), 500L);
        } else {
            i11Var.c();
        }
    }

    @Override
    public final void c(int i10) {
    }

    @Override
    public final void a(float f7, int i10, int i11) {
    }
}
