package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class d01 implements z4.e {
    public int f36235a;
    public final e01 f36236b;

    public d01(e01 e01Var) {
        this.f36236b = e01Var;
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        e01 e01Var = this.f36236b;
        ProfileActivity profileActivity = e01Var.f36487n;
        int k10 = profileActivity.f33673o0.D0.k(i10);
        if (this.f36235a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e01Var.a(z10);
        this.f36235a = k10;
        if (profileActivity.f33693r0 == null) {
            return;
        }
        if (profileActivity.U0.t()) {
            AndroidUtilities.runOnUIThread(new qy0(e01Var, 3), 500L);
        } else {
            e01Var.c();
        }
    }

    @Override
    public final void c(int i10) {
    }

    @Override
    public final void a(float f7, int i10, int i11) {
    }
}
