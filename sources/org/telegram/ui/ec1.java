package org.telegram.ui;
public final class ec1 implements mc1 {
    public boolean f38838a;
    public final wn f38839b;

    public ec1(wn wnVar, boolean z10) {
        this.f38839b = wnVar;
        this.f38838a = z10;
    }

    @Override
    public final boolean X0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f38838a;
    }

    @Override
    public final void j1(boolean z10) {
        boolean z11 = !this.f38838a;
        this.f38838a = z11;
        un unVar = this.f38839b.f45309ua;
        unVar.q(unVar.f44059f, unVar.f44060g, z10, Boolean.valueOf(z11), false);
    }
}
