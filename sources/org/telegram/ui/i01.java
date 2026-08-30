package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class i01 implements m2.f {
    public int f34991a;
    public final j01 f34992b;

    public i01(j01 j01Var) {
        this.f34992b = j01Var;
    }

    @Override
    public final void a(int i10) {
        boolean z4;
        j01 j01Var = this.f34992b;
        ProfileActivity profileActivity = j01Var.f35196n;
        int k10 = profileActivity.f32099k0.A0.k(i10);
        if (this.f34991a != k10) {
            z4 = true;
        } else {
            z4 = false;
        }
        j01Var.a(z4);
        this.f34991a = k10;
        if (profileActivity.f32119n0 == null) {
            return;
        }
        if (profileActivity.Q0.t()) {
            AndroidUtilities.runOnUIThread(new vy0(j01Var, 3), 500L);
        } else {
            j01Var.c();
        }
    }

    @Override
    public final void c(int i10) {
    }

    @Override
    public final void b(float f10, int i10, int i11) {
    }
}
