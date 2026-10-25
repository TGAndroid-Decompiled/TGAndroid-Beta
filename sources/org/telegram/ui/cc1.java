package org.telegram.ui;
public final class cc1 implements kc1 {
    public boolean f38424a;
    public final un f38425b;

    public cc1(un unVar, boolean z10) {
        this.f38425b = unVar;
        this.f38424a = z10;
    }

    @Override
    public final boolean X0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f38424a;
    }

    @Override
    public final void j1(boolean z10) {
        boolean z11 = !this.f38424a;
        this.f38424a = z11;
        sn snVar = this.f38425b.f44385qa;
        snVar.q(snVar.f43542f, snVar.f43543g, z10, Boolean.valueOf(z11), false);
    }
}
