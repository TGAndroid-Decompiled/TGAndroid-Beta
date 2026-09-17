package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class d11 implements z4.e {
    public int f32982a;
    public final e11 f32983b;

    public d11(e11 e11Var) {
        this.f32983b = e11Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        e11 e11Var = this.f32983b;
        ProfileActivity profileActivity = e11Var.f33262n;
        int k10 = profileActivity.f31342n0.D0.k(i10);
        if (this.f32982a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e11Var.a(z10);
        this.f32982a = k10;
        if (profileActivity.f31362q0 == null) {
            return;
        }
        if (profileActivity.T0.t()) {
            AndroidUtilities.runOnUIThread(new g01(e11Var, 2), 500L);
        } else {
            e11Var.c();
        }
    }

    @Override
    public final void c(int i10) {
    }

    @Override
    public final void b(float f7, int i10, int i11) {
    }
}
