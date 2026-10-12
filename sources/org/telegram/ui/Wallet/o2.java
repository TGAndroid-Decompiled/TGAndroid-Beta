package org.telegram.ui.Wallet;

import org.telegram.ui.kh1;
public final class o2 implements org.telegram.ui.ActionBar.z1 {
    public final int f35153a;
    public final org.telegram.ui.ActionBar.m2 f35154b;

    public o2(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f35153a = i10;
        this.f35154b = m2Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f35153a) {
            case 0:
                this.f35154b.presentFragment(new kh1(6, null));
                return;
            default:
                n7.Z((n7) this.f35154b, a2Var, i10);
                return;
        }
    }
}
