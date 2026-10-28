package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class n01 implements a5.i {
    public int f41595a;
    public final o01 f41596b;

    public n01(o01 o01Var) {
        this.f41596b = o01Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        o01 o01Var = this.f41596b;
        ProfileActivity profileActivity = o01Var.f41950n;
        int k10 = profileActivity.f36064n0.D0.k(i10);
        if (this.f41595a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        o01Var.a(z10);
        this.f41595a = k10;
        if (profileActivity.f36085q0 == null) {
            return;
        }
        if (profileActivity.T0.x()) {
            AndroidUtilities.runOnUIThread(new oy0(o01Var, 5), 500L);
        } else {
            o01Var.c();
        }
    }

    @Override
    public final void c(int i10) {
    }

    @Override
    public final void b(float f7, int i10, int i11) {
    }
}
