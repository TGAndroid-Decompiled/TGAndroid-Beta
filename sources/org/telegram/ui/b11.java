package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class b11 implements z4.e {
    public int f32217a;
    public final c11 f32218b;

    public b11(c11 c11Var) {
        this.f32218b = c11Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        c11 c11Var = this.f32218b;
        ProfileActivity profileActivity = c11Var.f32504n;
        int k10 = profileActivity.f31573n0.D0.k(i10);
        if (this.f32217a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        c11Var.a(z10);
        this.f32217a = k10;
        if (profileActivity.f31593q0 == null) {
            return;
        }
        if (profileActivity.T0.t()) {
            AndroidUtilities.runOnUIThread(new e01(c11Var, 2), 500L);
        } else {
            c11Var.c();
        }
    }

    @Override
    public final void c(int i10) {
    }

    @Override
    public final void b(float f7, int i10, int i11) {
    }
}
