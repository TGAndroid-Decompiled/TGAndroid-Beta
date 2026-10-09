package org.telegram.ui.Wallet;

import org.telegram.ui.ih1;
public final class m2 implements org.telegram.ui.ActionBar.a2 {
    public final int f35228a;
    public final org.telegram.ui.ActionBar.n2 f35229b;

    public m2(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f35228a = i10;
        this.f35229b = n2Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35228a) {
            case 0:
                this.f35229b.presentFragment(new ih1(6, null));
                return;
            default:
                l7.Z((l7) this.f35229b, b2Var, i10);
                return;
        }
    }
}
