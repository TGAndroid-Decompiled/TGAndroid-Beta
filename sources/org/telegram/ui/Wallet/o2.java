package org.telegram.ui.Wallet;

import org.telegram.ui.hh1;
public final class o2 implements org.telegram.ui.ActionBar.z1 {
    public final int f35385a;
    public final org.telegram.ui.ActionBar.m2 f35386b;

    public o2(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f35385a = i10;
        this.f35386b = m2Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f35385a) {
            case 0:
                this.f35386b.presentFragment(new hh1(6, null));
                return;
            default:
                n7.Z((n7) this.f35386b, a2Var, i10);
                return;
        }
    }
}
