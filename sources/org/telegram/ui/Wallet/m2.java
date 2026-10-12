package org.telegram.ui.Wallet;

import org.telegram.ui.oh1;
public final class m2 implements org.telegram.ui.ActionBar.z1 {
    public final int f33464a;
    public final org.telegram.ui.ActionBar.m2 f33465b;

    public m2(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f33464a = i10;
        this.f33465b = m2Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f33464a) {
            case 0:
                this.f33465b.presentFragment(new oh1(6, null));
                return;
            default:
                k7.Z((k7) this.f33465b, a2Var, i10);
                return;
        }
    }
}
