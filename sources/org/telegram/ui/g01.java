package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class g01 implements z4.f {
    public int f37416a;
    public final h01 f37417b;

    public g01(h01 h01Var) {
        this.f37417b = h01Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        h01 h01Var = this.f37417b;
        ProfileActivity profileActivity = h01Var.f37712n;
        int k10 = profileActivity.f33983o0.D0.k(i10);
        if (this.f37416a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        h01Var.a(z10);
        this.f37416a = k10;
        if (profileActivity.f34003r0 == null) {
            return;
        }
        if (profileActivity.U0.t()) {
            AndroidUtilities.runOnUIThread(new ly0(h01Var, 4), 500L);
        } else {
            h01Var.c();
        }
    }

    @Override
    public final void c(int i10) {
    }

    @Override
    public final void b(float f7, int i10, int i11) {
    }
}
