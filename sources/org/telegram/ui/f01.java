package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class f01 implements z4.e {
    public int f36774a;
    public final g01 f36775b;

    public f01(g01 g01Var) {
        this.f36775b = g01Var;
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        g01 g01Var = this.f36775b;
        ProfileActivity profileActivity = g01Var.f37048n;
        int k10 = profileActivity.f33674o0.D0.k(i10);
        if (this.f36774a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        g01Var.a(z10);
        this.f36774a = k10;
        if (profileActivity.f33694r0 == null) {
            return;
        }
        if (profileActivity.U0.t()) {
            AndroidUtilities.runOnUIThread(new sy0(g01Var, 3), 500L);
        } else {
            g01Var.c();
        }
    }

    @Override
    public final void c(int i10) {
    }

    @Override
    public final void a(float f7, int i10, int i11) {
    }
}
