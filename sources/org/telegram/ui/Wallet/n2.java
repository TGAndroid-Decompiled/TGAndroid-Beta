package org.telegram.ui.Wallet;

import org.telegram.ui.ih1;
public final class n2 implements org.telegram.ui.ActionBar.a2 {
    public final int f35321a;
    public final org.telegram.ui.ActionBar.n2 f35322b;

    public n2(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f35321a = i10;
        this.f35322b = n2Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35321a) {
            case 0:
                this.f35322b.presentFragment(new ih1(6, null));
                return;
            default:
                m7.Z((m7) this.f35322b, b2Var, i10);
                return;
        }
    }
}
