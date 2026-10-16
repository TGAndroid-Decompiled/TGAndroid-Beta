package org.telegram.ui.Wallet;

import org.telegram.ui.oh1;
public final class n2 implements org.telegram.ui.ActionBar.z1 {
    public final int f33233a;
    public final org.telegram.ui.ActionBar.m2 f33234b;

    public n2(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f33233a = i10;
        this.f33234b = m2Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f33233a) {
            case 0:
                this.f33234b.presentFragment(new oh1(6, null));
                return;
            default:
                l7.Z((l7) this.f33234b, a2Var, i10);
                return;
        }
    }
}
