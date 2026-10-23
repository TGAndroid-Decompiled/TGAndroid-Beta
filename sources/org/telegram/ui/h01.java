package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class h01 implements z4.f {
    public int f37705a;
    public final i01 f37706b;

    public h01(i01 i01Var) {
        this.f37706b = i01Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        i01 i01Var = this.f37706b;
        ProfileActivity profileActivity = i01Var.f38007n;
        int k10 = profileActivity.f33981o0.D0.k(i10);
        if (this.f37705a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        i01Var.a(z10);
        this.f37705a = k10;
        if (profileActivity.f34001r0 == null) {
            return;
        }
        if (profileActivity.U0.t()) {
            AndroidUtilities.runOnUIThread(new my0(i01Var, 4), 500L);
        } else {
            i01Var.c();
        }
    }

    @Override
    public final void c(int i10) {
    }

    @Override
    public final void b(float f7, int i10, int i11) {
    }
}
