package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class k01 implements m2.f {
    public int f38250a;
    public final l01 f38251b;

    public k01(l01 l01Var) {
        this.f38251b = l01Var;
    }

    @Override
    public final void a(int i10) {
        boolean z4;
        l01 l01Var = this.f38251b;
        ProfileActivity profileActivity = l01Var.f38546n;
        int k10 = profileActivity.f34632k0.A0.k(i10);
        if (this.f38250a != k10) {
            z4 = true;
        } else {
            z4 = false;
        }
        l01Var.a(z4);
        this.f38250a = k10;
        if (profileActivity.f34652n0 == null) {
            return;
        }
        if (profileActivity.Q0.t()) {
            AndroidUtilities.runOnUIThread(new xy0(l01Var, 3), 500L);
        } else {
            l01Var.c();
        }
    }

    @Override
    public final void c(int i10) {
    }

    @Override
    public final void b(float f10, int i10, int i11) {
    }
}
