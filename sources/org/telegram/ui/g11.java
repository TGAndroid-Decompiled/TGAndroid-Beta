package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class g11 implements z4.e {
    public int f36036a;
    public final h11 f36037b;

    public g11(h11 h11Var) {
        this.f36037b = h11Var;
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        h11 h11Var = this.f36037b;
        ProfileActivity profileActivity = h11Var.f36368n;
        int k10 = profileActivity.f32322n0.D0.k(i10);
        if (this.f36036a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        h11Var.a(z10);
        this.f36036a = k10;
        if (profileActivity.f32342q0 == null) {
            return;
        }
        if (profileActivity.T0.t()) {
            AndroidUtilities.runOnUIThread(new tz0(h11Var, 3), 500L);
        } else {
            h11Var.c();
        }
    }

    @Override
    public final void c(int i10) {
    }

    @Override
    public final void a(float f7, int i10, int i11) {
    }
}
